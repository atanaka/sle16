package org.gemoc.arduino.sequential.arduino.aspects;

import com.google.common.base.Objects;
import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspectExpressionAspectProperties;
import org.gemoc.arduino.sequential.arduino.arduino.Expression;
import org.gemoc.arduino.sequential.arduino.arduino.Instruction;

@Aspect(className = Expression.class)
@SuppressWarnings("all")
public abstract class Expression_EvaluableAspect {
  protected static Instruction getInstruction(final Expression _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
    result = _privk3_getInstruction(_self_, _self);;
    return (org.gemoc.arduino.sequential.arduino.arduino.Instruction)result;
  }
  
  @Abstract
  public static Object evaluate(final Expression _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.IntegerModuleGet){
    					result = org.gemoc.arduino.sequential.arduino.aspects.IntegerModuleGet_ExecutableAspect.evaluate((org.gemoc.arduino.sequential.arduino.arduino.IntegerModuleGet)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.Constant){
    					result = org.gemoc.arduino.sequential.arduino.aspects.Constant_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.arduino.arduino.Constant)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.VariableRef){
    					result = org.gemoc.arduino.sequential.arduino.aspects.VariableRef_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.arduino.arduino.VariableRef)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.IntegerConstant){
    					result = org.gemoc.arduino.sequential.arduino.aspects.IntegerConstant_ExecutableAspect.evaluate((org.gemoc.arduino.sequential.arduino.arduino.IntegerConstant)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.BinaryBooleanExpression){
    					result = org.gemoc.arduino.sequential.arduino.aspects.BinaryBooleanExpression_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.arduino.arduino.BinaryBooleanExpression)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.BinaryIntegerExpression){
    					result = org.gemoc.arduino.sequential.arduino.aspects.BinaryIntegerExpression_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.arduino.arduino.BinaryIntegerExpression)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.BooleanModuleGet){
    					result = org.gemoc.arduino.sequential.arduino.aspects.BooleanModuleGet_ExecutableAspect.evaluate((org.gemoc.arduino.sequential.arduino.arduino.BooleanModuleGet)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.BooleanConstant){
    					result = org.gemoc.arduino.sequential.arduino.aspects.BooleanConstant_ExecutableAspect.evaluate((org.gemoc.arduino.sequential.arduino.arduino.BooleanConstant)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.Expression){
    					result = org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_, (org.gemoc.arduino.sequential.arduino.arduino.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  protected static Instruction _privk3_getInstruction(final Expression_EvaluableAspectExpressionAspectProperties _self_, final Expression _self) {
    Instruction instruction = null;
    EObject current = _self.eContainer();
    while ((!Objects.equal(current, null))) {
      {
        if ((current instanceof Instruction)) {
          instruction = ((Instruction) current);
          return instruction;
        }
        EObject _eContainer = current.eContainer();
        current = _eContainer;
      }
    }
    return instruction;
  }
  
  protected static Object _privk3_evaluate(final Expression_EvaluableAspectExpressionAspectProperties _self_, final Expression _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
