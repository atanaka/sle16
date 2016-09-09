package org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino;

import fr.inria.diverse.melange.adapters.EObjectAdapter;
import org.eclipse.emf.ecore.EClass;
import org.gemoc.arduino.sequential.arduino.arduino.UnaryExpression;

@SuppressWarnings("all")
public class UnaryExpressionAdapter extends EObjectAdapter<UnaryExpression> implements org.gemoc.arduino.sequential.arduinomt.arduino.UnaryExpression {
  private org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory adaptersFactory;
  
  public UnaryExpressionAdapter() {
    super(org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance());
    adaptersFactory = org.gemoc.arduino.sequential.arduino.adapters.arduinomt.ArduinoMTAdaptersFactory.getInstance();
  }
  
  @Override
  public org.gemoc.arduino.sequential.arduinomt.arduino.Expression getOperand() {
    return () adaptersFactory.createAdapter(adaptee.getOperand(), eResource);
  }
  
  @Override
  public void setOperand(final org.gemoc.arduino.sequential.arduinomt.arduino.Expression o) {
    if (o != null)
    	adaptee.setOperand(((org.gemoc.arduino.sequential.arduino.adapters.arduinomt.arduino.ExpressionAdapter) o).getAdaptee());
    else adaptee.setOperand(null);
  }
  
  @Override
  public Object evaluate() {
    return org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspect.evaluate(adaptee);
  }
  
  @Override
  public EClass eClass() {
    return org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.eINSTANCE.getUnaryExpression();
  }
  
  @Override
  public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.UNARY_EXPRESSION__OPERAND:
    		return getOperand();
    }
    
    return super.eGet(featureID, resolve, coreType);
  }
  
  @Override
  public boolean eIsSet(final int featureID) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.UNARY_EXPRESSION__OPERAND:
    		return getOperand() != null;
    }
    
    return super.eIsSet(featureID);
  }
  
  @Override
  public void eSet(final int featureID, final Object newValue) {
    switch (featureID) {
    	case org.gemoc.arduino.sequential.arduinomt.arduino.ArduinoPackage.UNARY_EXPRESSION__OPERAND:
    		setOperand(
    		(org.gemoc.arduino.sequential.arduinomt.arduino.Expression)
    		 newValue);
    		return;
    }
    
    super.eSet(featureID, newValue);
  }
}
