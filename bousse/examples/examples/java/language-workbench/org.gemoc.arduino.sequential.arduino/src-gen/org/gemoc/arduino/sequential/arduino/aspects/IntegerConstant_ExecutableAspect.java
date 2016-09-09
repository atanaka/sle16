package org.gemoc.arduino.sequential.arduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspect;
import org.gemoc.arduino.sequential.arduino.aspects.IntegerConstant_ExecutableAspectIntegerConstantAspectProperties;
import org.gemoc.arduino.sequential.arduino.arduino.IntegerConstant;

@Aspect(className = IntegerConstant.class)
@SuppressWarnings("all")
public class IntegerConstant_ExecutableAspect extends Expression_EvaluableAspect {
  @OverrideAspectMethod
  public static Object evaluate(final IntegerConstant _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.IntegerConstant_ExecutableAspectIntegerConstantAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.IntegerConstant_ExecutableAspectIntegerConstantAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.IntegerConstant){
    					result = org.gemoc.arduino.sequential.arduino.aspects.IntegerConstant_ExecutableAspect._privk3_evaluate(_self_, (org.gemoc.arduino.sequential.arduino.arduino.IntegerConstant)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.Expression){
    					result = org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.arduino.arduino.Expression)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Object)result;
  }
  
  private static Object super_evaluate(final IntegerConstant _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspectExpressionAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspectExpressionAspectContext.getSelf(_self);
    return  org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Object _privk3_evaluate(final IntegerConstant_ExecutableAspectIntegerConstantAspectProperties _self_, final IntegerConstant _self) {
    return Integer.valueOf(_self.getValue());
  }
}
