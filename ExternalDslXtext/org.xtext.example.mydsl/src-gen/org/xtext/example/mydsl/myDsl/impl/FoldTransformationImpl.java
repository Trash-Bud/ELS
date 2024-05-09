/**
 * generated by Xtext 2.32.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.FoldTransformation;
import org.xtext.example.mydsl.myDsl.GroupBy;
import org.xtext.example.mydsl.myDsl.MyDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fold Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FoldTransformationImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.FoldTransformationImpl#getGroupBy <em>Group By</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FoldTransformationImpl extends TransformationImpl implements FoldTransformation
{
  /**
   * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperation()
   * @generated
   * @ordered
   */
  protected EObject operation;

  /**
   * The cached value of the '{@link #getGroupBy() <em>Group By</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupBy()
   * @generated
   * @ordered
   */
  protected GroupBy groupBy;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FoldTransformationImpl()
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
    return MyDslPackage.Literals.FOLD_TRANSFORMATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getOperation()
  {
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOperation(EObject newOperation, NotificationChain msgs)
  {
    EObject oldOperation = operation;
    operation = newOperation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOLD_TRANSFORMATION__OPERATION, oldOperation, newOperation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOperation(EObject newOperation)
  {
    if (newOperation != operation)
    {
      NotificationChain msgs = null;
      if (operation != null)
        msgs = ((InternalEObject)operation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOLD_TRANSFORMATION__OPERATION, null, msgs);
      if (newOperation != null)
        msgs = ((InternalEObject)newOperation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOLD_TRANSFORMATION__OPERATION, null, msgs);
      msgs = basicSetOperation(newOperation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOLD_TRANSFORMATION__OPERATION, newOperation, newOperation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GroupBy getGroupBy()
  {
    return groupBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGroupBy(GroupBy newGroupBy, NotificationChain msgs)
  {
    GroupBy oldGroupBy = groupBy;
    groupBy = newGroupBy;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.FOLD_TRANSFORMATION__GROUP_BY, oldGroupBy, newGroupBy);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setGroupBy(GroupBy newGroupBy)
  {
    if (newGroupBy != groupBy)
    {
      NotificationChain msgs = null;
      if (groupBy != null)
        msgs = ((InternalEObject)groupBy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOLD_TRANSFORMATION__GROUP_BY, null, msgs);
      if (newGroupBy != null)
        msgs = ((InternalEObject)newGroupBy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.FOLD_TRANSFORMATION__GROUP_BY, null, msgs);
      msgs = basicSetGroupBy(newGroupBy, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.FOLD_TRANSFORMATION__GROUP_BY, newGroupBy, newGroupBy));
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
      case MyDslPackage.FOLD_TRANSFORMATION__OPERATION:
        return basicSetOperation(null, msgs);
      case MyDslPackage.FOLD_TRANSFORMATION__GROUP_BY:
        return basicSetGroupBy(null, msgs);
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
      case MyDslPackage.FOLD_TRANSFORMATION__OPERATION:
        return getOperation();
      case MyDslPackage.FOLD_TRANSFORMATION__GROUP_BY:
        return getGroupBy();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.FOLD_TRANSFORMATION__OPERATION:
        setOperation((EObject)newValue);
        return;
      case MyDslPackage.FOLD_TRANSFORMATION__GROUP_BY:
        setGroupBy((GroupBy)newValue);
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
      case MyDslPackage.FOLD_TRANSFORMATION__OPERATION:
        setOperation((EObject)null);
        return;
      case MyDslPackage.FOLD_TRANSFORMATION__GROUP_BY:
        setGroupBy((GroupBy)null);
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
      case MyDslPackage.FOLD_TRANSFORMATION__OPERATION:
        return operation != null;
      case MyDslPackage.FOLD_TRANSFORMATION__GROUP_BY:
        return groupBy != null;
    }
    return super.eIsSet(featureID);
  }

} //FoldTransformationImpl
