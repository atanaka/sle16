package org.gemoc.arduino.sequential.arduino.aspects;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.OverrideAspectMethod;
import org.gemoc.arduino.sequential.arduino.aspects.Control_EvaluableAspect;
import org.gemoc.arduino.sequential.arduino.aspects.Expression_EvaluableAspect;
import org.gemoc.arduino.sequential.arduino.aspects.While_EvaluableAspectWhileAspectProperties;
import org.gemoc.arduino.sequential.arduino.arduino.BooleanExpression;
import org.gemoc.arduino.sequential.arduino.arduino.While;

@Aspect(className = While.class)
@SuppressWarnings("all")
public class While_EvaluableAspect extends Control_EvaluableAspect {
  @OverrideAspectMethod
  public static Boolean evaluate(final While _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.While_EvaluableAspectWhileAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.While_EvaluableAspectWhileAspectContext.getSelf(_self);
    Object result = null;
     if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.While){
    					result = org.gemoc.arduino.sequential.arduino.aspects.While_EvaluableAspect._privk3_evaluate(_self_, (org.gemoc.arduino.sequential.arduino.arduino.While)_self);
    } else  if (_self instanceof org.gemoc.arduino.sequential.arduino.arduino.Control){
    					result = org.gemoc.arduino.sequential.arduino.aspects.Control_EvaluableAspect.evaluate((org.gemoc.arduino.sequential.arduino.arduino.Control)_self);
    } else  { throw new IllegalArgumentException("Unhandled parameter types: " + java.util.Arrays.<Object>asList(_self).toString()); };
    return (java.lang.Boolean)result;
  }
  
  private static Boolean super_evaluate(final While _self) {
    final org.gemoc.arduino.sequential.arduino.aspects.Control_EvaluableAspectControlAspectProperties _self_ = org.gemoc.arduino.sequential.arduino.aspects.Control_EvaluableAspectControlAspectContext.getSelf(_self);
    return  org.gemoc.arduino.sequential.arduino.aspects.Control_EvaluableAspect._privk3_evaluate(_self_, _self);
  }
  
  protected static Boolean _privk3_evaluate(final While_EvaluableAspectWhileAspectProperties _self_, final While _self) {
    BooleanExpression _condition = _self.getCondition();
    Object _evaluate = Expression_EvaluableAspect.evaluate(_condition);
    Boolean resCond = ((Boolean) _evaluate);
    return resCond;
  }
}
