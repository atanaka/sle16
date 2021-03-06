/*
 * generated by Xtext
 */
package org.gemoc.gexpressions.xtext.validation

import org.eclipse.xtext.validation.Check
import org.gemoc.gexpressions.GIfExpression
import org.gemoc.gexpressions.utils.GExpressionsPredicateValidator
import org.gemoc.gexpressions.xtext.validation.AbstractGExpressionsValidator

//import org.eclipse.xtext.validation.Check
/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class GExpressionsValidator extends AbstractGExpressionsValidator {

	//  public static val INVALID_NAME = 'invalidName'
	//
	//	@Check
	//	def checkGreetingStartsWithCapital(Greeting greeting) {
	//		if (!Character.isUpperCase(greeting.name.charAt(0))) {
	//			warning('Name should start with a capital', 
	//					MyDslPackage.Literals.GREETING__NAME,
	//					INVALID_NAME)
	//		}
	//	}
	//	@Check
	//	def checkGFeatureNavigationExpressionIsCoherent(GFeatureNavigationExpression exp) {
	//		if (exp.feature.EType == null) {
	//			error(
	//				'Could not determine type of the referenced EStructuralFeature',
	//				exp.feature,
	//				exp.eClass.getEStructuralFeature("feature")
	//			)
	//		}
	//	}
	@Check
	def checkGIfExpressionConditionIsPredicate(GIfExpression exp) {
		if (! (new GExpressionsPredicateValidator()).doSwitch(exp.condition)) {
			warning(
				'The condition expression in this If expression does not seem to lead to a boolean result',
				exp.condition,
				exp.eClass.getEStructuralFeature("condition")
			)
		}
	}
}
