package org.ekaii.diaporama.rcp.wizard;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.ekaii.diaporama.DiaporamaFactory;
import org.ekaii.diaporama.DiaporamaPackage;
import org.ekaii.diaporama.Slide;
import org.ekaii.diaporama.SlideShow;
import org.ekaii.diaporama.presentation.DiaporamaEditorAdvisor;
import org.ekaii.diaporama.rcp.DiaporamaPlugin;
import org.ekaii.diaporama.rcp.IConstants;

public class DiaporamaModelWizard extends Wizard implements INewWizard {
	/**
	 * This caches an instance of the model package. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DiaporamaPackage diaporamaPackage = DiaporamaPackage.eINSTANCE;

	/**
	 * This caches an instance of the model factory. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected DiaporamaFactory diaporamaFactory = diaporamaPackage.getDiaporamaFactory();

	/**
	 * This is the initial object creation page. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	protected DiaporamaModelWizardInitialObjectCreationPage initialObjectCreationPage;

	/**
	 * Remember the selection during initialization for populating the default
	 * container. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * Remember the workbench during initialization. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected IWorkbench workbench;

	/**
	 * Caches the names of the types that can be created as the root object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected List<String> initialObjectNames;

	/**
	 * This just records the information. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle("Creation d'un nouveau diaporama"); //$NON-NLS-1$
		setDefaultPageImageDescriptor(DiaporamaPlugin.getImageDescriptor("icons/wizban/NewDiaporama.gif")); //$NON-NLS-1$
	}

	/**
	 * Returns the names of the types that can be created as the root object.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Collection<String> getInitialObjectNames() {
		if (initialObjectNames == null) {
			initialObjectNames = new ArrayList<String>();
			for (EClassifier eClassifier : diaporamaPackage.getEClassifiers()) {
				if (eClassifier instanceof EClass) {
					EClass eClass = (EClass) eClassifier;
					if (!eClass.isAbstract()) {
						initialObjectNames.add(eClass.getName());
					}
				}
			}
			Collections.sort(initialObjectNames, java.text.Collator.getInstance());
		}
		return initialObjectNames;
	}

	/**
	 * Create a new model. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected EObject createInitialModel() {
		SlideShow slideShow = diaporamaFactory.createSlideShow();
		Slide newSlide = diaporamaFactory.createSlide();
		newSlide.setSlideName("Première Diapo");
		slideShow.getAllSlides().add(newSlide);
		return slideShow;
	}

	/**
	 * Do the work after everything is specified. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean performFinish() {
		try {
			// Get the URI of the model file.
			//
			final URI fileURI = getModelURI();
			if (new File(fileURI.toFileString()).exists()) {
				if (!MessageDialog
						.openQuestion(getShell(), "Conflit", //$NON-NLS-1$
								"There are unsaved changes that conflict with changes made outside the editor.  Do you wish to discard this editor's changes? ")) //$NON-NLS-1$
				{
					initialObjectCreationPage.selectFileField();
					return false;
				}
			}

			// Do the work within an operation.
			//
			IRunnableWithProgress operation = new IRunnableWithProgress() {
				public void run(IProgressMonitor progressMonitor) {
					try {
						// Create a resource set
						//
						ResourceSet resourceSet = new ResourceSetImpl();

						// Create a resource for this file.
						//
						Resource resource = resourceSet.createResource(fileURI);

						// Add the initial model object to the contents.
						//
						EObject rootObject = createInitialModel();
						if (rootObject != null) {
							resource.getContents().add(rootObject);
						}

						// Save the contents of the resource to the file system.
						//
						Map<Object, Object> options = new HashMap<Object, Object>();
						options.put(XMLResource.OPTION_ENCODING, "ISO-8859-1");
						resource.save(options);

						// URI diagramURI = fileURI;
						// Resource diagram =
						// DiaporamaDiagramEditorUtil.createDiagram(diagramURI,
						// progressMonitor);
						// DiaporamaDiagramEditorUtil.openDiagram(diagram);

					} catch (Exception exception) {
						DiaporamaPlugin.log(exception);
					} finally {
						progressMonitor.done();
					}
				}
			};

			getContainer().run(false, false, operation);
			return DiaporamaEditorAdvisor.openEditor(workbench, fileURI);
		} catch (Exception exception) {
			DiaporamaPlugin.log(exception);
			return false;
		}
	}
	/**
	 * This is the page where the type of object to create is selected. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public class DiaporamaModelWizardInitialObjectCreationPage extends WizardPage {

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		protected Text fileField;

		/**
		 * Pass in the selection. <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public DiaporamaModelWizardInitialObjectCreationPage(String pageId) {
			super(pageId);
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			{
				GridLayout layout = new GridLayout();
				layout.numColumns = 1;
				layout.verticalSpacing = 12;
				composite.setLayout(layout);

				GridData data = new GridData();
				data.verticalAlignment = GridData.FILL;
				data.grabExcessVerticalSpace = true;
				data.horizontalAlignment = GridData.FILL;
				composite.setLayoutData(data);
			}

			Label resourceURILabel = new Label(composite, SWT.LEFT);
			{
				resourceURILabel.setText("Nom du Fichier"); //$NON-NLS-1$

				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				resourceURILabel.setLayoutData(data);
			}

			Composite fileComposite = new Composite(composite, SWT.NONE);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				fileComposite.setLayoutData(data);

				GridLayout layout = new GridLayout();
				// data.horizontalAlignment = GridData.FILL;
				layout.marginHeight = 0;
				layout.marginWidth = 0;
				layout.numColumns = 1;
				fileComposite.setLayout(layout);
			}

			fileField = new Text(fileComposite, SWT.BORDER);
			{
				GridData data = new GridData();
				data.horizontalAlignment = GridData.FILL;
				data.grabExcessHorizontalSpace = true;
				// data.horizontalSpan = 1;
				fileField.setLayoutData(data);
			}

			fileField.addModifyListener(validator);

			// Button resourceURIBrowseFileSystemButton = new
			// Button(fileComposite, SWT.PUSH);
			// resourceURIBrowseFileSystemButton.setText("Explorer");
			// //$NON-NLS-1$

			// resourceURIBrowseFileSystemButton.addSelectionListener(new
			// SelectionAdapter() {
			// @Override
			// public void widgetSelected(SelectionEvent event) {
			// String fileExtension = "diaporama"; //$NON-NLS-1$
			// String filePath =
			// ApplicationWorkbenchAdvisor.openFilePathDialog(getShell(), "*." +
			// fileExtension, SWT.OPEN); //$NON-NLS-1$
			// if (filePath != null) {
			// if (!filePath.endsWith("." + fileExtension)) //$NON-NLS-1$
			// {
			// filePath = filePath + "." + fileExtension; //$NON-NLS-1$
			// }
			// fileField.setText(filePath);
			// }
			// }
			// });
			// Label containerLabel = new Label(composite, SWT.LEFT);
			// {
			// containerLabel.setText("&Model Object"); //$NON-NLS-1$
			//
			// GridData data = new GridData();
			// data.horizontalAlignment = GridData.FILL;
			// containerLabel.setLayoutData(data);
			// }
			//
			// initialObjectField = new Combo(composite, SWT.BORDER);
			// {
			// GridData data = new GridData();
			// data.horizontalAlignment = GridData.FILL;
			// data.grabExcessHorizontalSpace = true;
			// initialObjectField.setLayoutData(data);
			// }
			//
			// for (String objectName : getInitialObjectNames()) {
			// initialObjectField.add(getLabel(objectName));
			// }
			//
			// if (initialObjectField.getItemCount() == 1) {
			// initialObjectField.select(0);
			// }
			// initialObjectField.addModifyListener(validator);
			//
			// Label encodingLabel = new Label(composite, SWT.LEFT);
			// {
			// encodingLabel.setText("XMLEncoding"); //$NON-NLS-1$
			//
			// GridData data = new GridData();
			// data.horizontalAlignment = GridData.FILL;
			// encodingLabel.setLayoutData(data);
			// }
			// encodingField = new Combo(composite, SWT.BORDER);
			// {
			// GridData data = new GridData();
			// data.horizontalAlignment = GridData.FILL;
			// data.grabExcessHorizontalSpace = true;
			// encodingField.setLayoutData(data);
			// }
			//
			// for (String encoding : getEncodings()) {
			// encodingField.add(encoding);
			// }
			//
			// encodingField.select(0);
			// encodingField.addModifyListener(validator);

			setPageComplete(validatePage());
			setControl(composite);
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		protected ModifyListener validator = new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				setPageComplete(validatePage());
			}
		};

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		protected boolean validatePage() {
			URI fileURI = getFileURI();
			if (fileURI == null || fileURI.isEmpty()) {
				setErrorMessage(null);
				return false;
			}

			File file = new File(fileURI.toFileString());
			if (file.exists()) {
				setErrorMessage("Un diaporama du nom de [" + file.getName() + "] existe déja, veuillez en choisir un autre."); //$NON-NLS-1$
				return false;
			}

			setErrorMessage(null);
			return true;
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		@Override
		public void setVisible(boolean visible) {
			super.setVisible(visible);
			if (visible) {
				fileField.setFocus();
			}
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		// public String getInitialObjectName() {
		// String label = initialObjectField.getText();
		//
		// for (String name : getInitialObjectNames()) {
		// if (getLabel(name).equals(label)) {
		// return name;
		// }
		// }
		// return null;
		// }
		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		// public String getEncoding() {
		// return encodingField.getText();
		// }
		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public URI getFileURI() {
			String fileS = fileField.getText();
			if (!fileS.endsWith(IConstants.DIAPO_EXTENSION)) {
				fileS = fileS + '.' + IConstants.DIAPO_EXTENSION;
			}
			try {
				File instanceFile = IConstants.getDiaporamasStorageDir();
				File diapoFile = new File(instanceFile, fileS);
				return URI.createFileURI(diapoFile.getAbsolutePath());
			} catch (Exception exception) {
				// Ignore
			}
			return null;
		}

		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		public void selectFileField() {
			fileField.selectAll();
			fileField.setFocus();
		}

		/**
		 * Returns the label for the specified type name. <!-- begin-user-doc
		 * --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		// protected String getLabel(String typeName) {
		// try {
		// return DiaporamaEditPlugin.INSTANCE.getString("_UI_" + typeName +
		// "_type"); //$NON-NLS-1$ //$NON-NLS-2$
		// } catch (MissingResourceException mre) {
		// DiaporamaPlugin.log(mre);
		// }
		// return typeName;
		// }
		/**
		 * <!-- begin-user-doc --> <!-- end-user-doc -->
		 * 
		 * @generated
		 */
		// protected Collection<String> getEncodings() {
		// if (encodings == null) {
		// encodings = new ArrayList<String>();
		// encodings.add("UTF-8");
		// }
		// return encodings;
		// }
	}

	/**
	 * The framework calls this to create the contents of the wizard. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void addPages() {
		initialObjectCreationPage = new DiaporamaModelWizardInitialObjectCreationPage("Whatever2"); //$NON-NLS-1$
		initialObjectCreationPage.setTitle("parametres globaux du diaporama"); //$NON-NLS-1$
		initialObjectCreationPage.setDescription("Modifiez les paramètres par défaut si vous le souhaitez."); //$NON-NLS-1$
		addPage(initialObjectCreationPage);
	}

	/**
	 * Get the URI from the page. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public URI getModelURI() {
		return initialObjectCreationPage.getFileURI();
	}

}
