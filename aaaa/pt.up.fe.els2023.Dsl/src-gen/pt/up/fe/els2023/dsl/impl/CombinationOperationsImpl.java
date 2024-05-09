/**
 * generated by Xtext 2.32.0
 */
package pt.up.fe.els2023.dsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import pt.up.fe.els2023.dsl.CombinationOperations;
import pt.up.fe.els2023.dsl.DslPackage;
import pt.up.fe.els2023.dsl.TableOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Combination Operations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.up.fe.els2023.dsl.impl.CombinationOperationsImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link pt.up.fe.els2023.dsl.impl.CombinationOperationsImpl#getType <em>Type</em>}</li>
 *   <li>{@link pt.up.fe.els2023.dsl.impl.CombinationOperationsImpl#getTableOperation <em>Table Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CombinationOperationsImpl extends MinimalEObjectImpl.Container implements CombinationOperations
{
  /**
   * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected static final String OPERATION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected String operation = OPERATION_EDEFAULT;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getTableOperation() <em>Table Operation</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTableOperation()
   * @generated
   * @ordered
   */
  protected EList<TableOperations> tableOperation;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CombinationOperationsImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DslPackage.Literals.COMBINATION_OPERATIONS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOperation()
  {
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOperation(String newOperation)
  {
    String oldOperation = operation;
    operation = newOperation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.COMBINATION_OPERATIONS__OPERATION, oldOperation, operation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.COMBINATION_OPERATIONS__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<TableOperations> getTableOperation()
  {
    if (tableOperation == null)
    {
      tableOperation = new EObjectContainmentEList<TableOperations>(TableOperations.class, this, DslPackage.COMBINATION_OPERATIONS__TABLE_OPERATION);
    }
    return tableOperation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DslPackage.COMBINATION_OPERATIONS__TABLE_OPERATION:
        return ((InternalEList<?>)getTableOperation()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DslPackage.COMBINATION_OPERATIONS__OPERATION:
        return getOperation();
      case DslPackage.COMBINATION_OPERATIONS__TYPE:
        return getType();
      case DslPackage.COMBINATION_OPERATIONS__TABLE_OPERATION:
        return getTableOperation();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DslPackage.COMBINATION_OPERATIONS__OPERATION:
        setOperation((String)newValue);
        return;
      case DslPackage.COMBINATION_OPERATIONS__TYPE:
        setType((String)newValue);
        return;
      case DslPackage.COMBINATION_OPERATIONS__TABLE_OPERATION:
        getTableOperation().clear();
        getTableOperation().addAll((Collection<? extends TableOperations>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DslPackage.COMBINATION_OPERATIONS__OPERATION:
        setOperation(OPERATION_EDEFAULT);
        return;
      case DslPackage.COMBINATION_OPERATIONS__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case DslPackage.COMBINATION_OPERATIONS__TABLE_OPERATION:
        getTableOperation().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DslPackage.COMBINATION_OPERATIONS__OPERATION:
        return OPERATION_EDEFAULT == null ? operation != null : !OPERATION_EDEFAULT.equals(operation);
      case DslPackage.COMBINATION_OPERATIONS__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case DslPackage.COMBINATION_OPERATIONS__TABLE_OPERATION:
        return tableOperation != null && !tableOperation.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (operation: ");
    result.append(operation);
    result.append(", type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //CombinationOperationsImpl