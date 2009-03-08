/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ekaii.diaporama;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Picture Resizing Policy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ekaii.diaporama.DiaporamaPackage#getPictureResizingPolicy()
 * @model instanceClass="org.ekaii.diaporama.PictureResizingPolicy"
 * @generated
 */
public enum PictureResizingPolicy implements Enumerator {
	/**
	 * The '<em><b>FIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIT_VALUE
	 * @generated
	 * @ordered
	 */
	FIT(0, "FIT", "FIT"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>STRETCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STRETCH_VALUE
	 * @generated
	 * @ordered
	 */
	STRETCH(1, "STRETCH", "STRETCH"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
	 * The '<em><b>FIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FIT_VALUE = 0;

	/**
	 * The '<em><b>STRETCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STRETCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STRETCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STRETCH_VALUE = 1;

	/**
	 * An array of all the '<em><b>Picture Resizing Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PictureResizingPolicy[] VALUES_ARRAY = new PictureResizingPolicy[]{FIT, STRETCH,};

	/**
	 * A public read-only list of all the '<em><b>Picture Resizing Policy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PictureResizingPolicy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Picture Resizing Policy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PictureResizingPolicy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PictureResizingPolicy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Picture Resizing Policy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PictureResizingPolicy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PictureResizingPolicy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Picture Resizing Policy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PictureResizingPolicy get(int value) {
		switch (value) {
			case FIT_VALUE :
				return FIT;
			case STRETCH_VALUE :
				return STRETCH;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PictureResizingPolicy(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //PictureResizingPolicy
