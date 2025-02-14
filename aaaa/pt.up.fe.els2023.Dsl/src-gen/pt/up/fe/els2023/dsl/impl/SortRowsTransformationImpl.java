/**
 * generated by Xtext 2.32.0
 */
package pt.up.fe.els2023.dsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import pt.up.fe.els2023.dsl.DslPackage;
import pt.up.fe.els2023.dsl.SortRowsTransformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sort Rows Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.up.fe.els2023.dsl.impl.SortRowsTransformationImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link pt.up.fe.els2023.dsl.impl.SortRowsTransformationImpl#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SortRowsTransformationImpl extends RowTransformationImpl implements SortRowsTransformation
{
  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected EList<String> columns;

  /**
   * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrder()
   * @generated
   * @ordered
   */
  protected static final String ORDER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrder()
   * @generated
   * @ordered
   */
  protected String order = ORDER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SortRowsTransformationImpl()
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
    return DslPackage.Literals.SORT_ROWS_TRANSFORMATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getColumns()
  {
    if (columns == null)
    {
      columns = new EDataTypeEList<String>(String.class, this, DslPackage.SORT_ROWS_TRANSFORMATION__COLUMNS);
    }
    return columns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOrder()
  {
    return order;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOrder(String newOrder)
  {
    String oldOrder = order;
    order = newOrder;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.SORT_ROWS_TRANSFORMATION__ORDER, oldOrder, order));
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
      case DslPackage.SORT_ROWS_TRANSFORMATION__COLUMNS:
        return getColumns();
      case DslPackage.SORT_ROWS_TRANSFORMATION__ORDER:
        return getOrder();
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
      case DslPackage.SORT_ROWS_TRANSFORMATION__COLUMNS:
        getColumns().clear();
        getColumns().addAll((Collection<? extends String>)newValue);
        return;
      case DslPackage.SORT_ROWS_TRANSFORMATION__ORDER:
        setOrder((String)newValue);
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
      case DslPackage.SORT_ROWS_TRANSFORMATION__COLUMNS:
        getColumns().clear();
        return;
      case DslPackage.SORT_ROWS_TRANSFORMATION__ORDER:
        setOrder(ORDER_EDEFAULT);
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
      case DslPackage.SORT_ROWS_TRANSFORMATION__COLUMNS:
        return columns != null && !columns.isEmpty();
      case DslPackage.SORT_ROWS_TRANSFORMATION__ORDER:
        return ORDER_EDEFAULT == null ? order != null : !ORDER_EDEFAULT.equals(order);
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
    result.append(" (columns: ");
    result.append(columns);
    result.append(", order: ");
    result.append(order);
    result.append(')');
    return result.toString();
  }

} //SortRowsTransformationImpl
