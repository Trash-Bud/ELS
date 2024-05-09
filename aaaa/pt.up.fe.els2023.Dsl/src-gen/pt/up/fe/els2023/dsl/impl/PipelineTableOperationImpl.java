/**
 * generated by Xtext 2.32.0
 */
package pt.up.fe.els2023.dsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import pt.up.fe.els2023.dsl.DslPackage;
import pt.up.fe.els2023.dsl.PipelineTableOperation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pipeline Table Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link pt.up.fe.els2023.dsl.impl.PipelineTableOperationImpl#getPipeline <em>Pipeline</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PipelineTableOperationImpl extends MinimalEObjectImpl.Container implements PipelineTableOperation
{
  /**
   * The cached value of the '{@link #getPipeline() <em>Pipeline</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPipeline()
   * @generated
   * @ordered
   */
  protected EObject pipeline;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PipelineTableOperationImpl()
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
    return DslPackage.Literals.PIPELINE_TABLE_OPERATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject getPipeline()
  {
    return pipeline;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPipeline(EObject newPipeline, NotificationChain msgs)
  {
    EObject oldPipeline = pipeline;
    pipeline = newPipeline;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.PIPELINE_TABLE_OPERATION__PIPELINE, oldPipeline, newPipeline);
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
  public void setPipeline(EObject newPipeline)
  {
    if (newPipeline != pipeline)
    {
      NotificationChain msgs = null;
      if (pipeline != null)
        msgs = ((InternalEObject)pipeline).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.PIPELINE_TABLE_OPERATION__PIPELINE, null, msgs);
      if (newPipeline != null)
        msgs = ((InternalEObject)newPipeline).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.PIPELINE_TABLE_OPERATION__PIPELINE, null, msgs);
      msgs = basicSetPipeline(newPipeline, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.PIPELINE_TABLE_OPERATION__PIPELINE, newPipeline, newPipeline));
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
      case DslPackage.PIPELINE_TABLE_OPERATION__PIPELINE:
        return basicSetPipeline(null, msgs);
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
      case DslPackage.PIPELINE_TABLE_OPERATION__PIPELINE:
        return getPipeline();
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
      case DslPackage.PIPELINE_TABLE_OPERATION__PIPELINE:
        setPipeline((EObject)newValue);
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
      case DslPackage.PIPELINE_TABLE_OPERATION__PIPELINE:
        setPipeline((EObject)null);
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
      case DslPackage.PIPELINE_TABLE_OPERATION__PIPELINE:
        return pipeline != null;
    }
    return super.eIsSet(featureID);
  }

} //PipelineTableOperationImpl