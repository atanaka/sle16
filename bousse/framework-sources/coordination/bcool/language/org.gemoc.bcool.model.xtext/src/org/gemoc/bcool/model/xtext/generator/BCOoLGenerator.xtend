/*
 * generated by Xtext
 */
package org.gemoc.bcool.model.xtext.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.xbase.XExpression
import org.gemoc.bcool.model.bcool.BCoolSpecification
import org.eclipse.xtext.xbase.compiler.XbaseCompiler
import com.google.inject.Inject
import org.eclipse.xtext.xbase.XBinaryOperation
import org.eclipse.xtext.xbase.XMemberFeatureCall
import org.eclipse.xtext.xbase.impl.XMemberFeatureCallImplCustom
import org.eclipse.xtext.xbase.XFeatureCall

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
 
 class BCOoLGenerator implements IGenerator {
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
	}
}
 
