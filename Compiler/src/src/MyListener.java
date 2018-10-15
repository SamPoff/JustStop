package src;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import src.CParser.AbstractDeclaratorContext;
import src.CParser.AdditiveExpressionContext;
import src.CParser.AlignmentSpecifierContext;
import src.CParser.AndExpressionContext;
import src.CParser.ArgumentExpressionListContext;
import src.CParser.AssignmentExpressionContext;
import src.CParser.AssignmentOperatorContext;
import src.CParser.AtomicTypeSpecifierContext;
import src.CParser.BlockItemContext;
import src.CParser.BlockItemListContext;
import src.CParser.CastExpressionContext;
import src.CParser.CompilationUnitContext;
import src.CParser.CompoundStatementContext;
import src.CParser.ConditionalExpressionContext;
import src.CParser.ConstantExpressionContext;
import src.CParser.DeclarationContext;
import src.CParser.DeclarationListContext;
import src.CParser.DeclarationSpecifierContext;
import src.CParser.DeclarationSpecifiers2Context;
import src.CParser.DeclarationSpecifiersContext;
import src.CParser.DeclaratorContext;
import src.CParser.DesignationContext;
import src.CParser.DesignatorContext;
import src.CParser.DesignatorListContext;
import src.CParser.DirectAbstractDeclaratorContext;
import src.CParser.DirectDeclaratorContext;
import src.CParser.EnumSpecifierContext;
import src.CParser.EnumerationConstantContext;
import src.CParser.EnumeratorContext;
import src.CParser.EnumeratorListContext;
import src.CParser.EqualityExpressionContext;
import src.CParser.ExclusiveOrExpressionContext;
import src.CParser.ExpressionContext;
import src.CParser.ExpressionStatementContext;
import src.CParser.ExternalDeclarationContext;
import src.CParser.ForConditionContext;
import src.CParser.ForDeclarationContext;
import src.CParser.ForExpressionContext;
import src.CParser.FunctionDefinitionContext;
import src.CParser.FunctionSpecifierContext;
import src.CParser.GccAttributeContext;
import src.CParser.GccAttributeListContext;
import src.CParser.GccAttributeSpecifierContext;
import src.CParser.GccDeclaratorExtensionContext;
import src.CParser.GenericAssocListContext;
import src.CParser.GenericAssociationContext;
import src.CParser.GenericSelectionContext;
import src.CParser.IdentifierListContext;
import src.CParser.InclusiveOrExpressionContext;
import src.CParser.InitDeclaratorContext;
import src.CParser.InitDeclaratorListContext;
import src.CParser.InitializerContext;
import src.CParser.InitializerListContext;
import src.CParser.IterationStatementContext;
import src.CParser.JumpStatementContext;
import src.CParser.LabeledStatementContext;
import src.CParser.LogicalAndExpressionContext;
import src.CParser.LogicalOrExpressionContext;
import src.CParser.MultiplicativeExpressionContext;
import src.CParser.NestedParenthesesBlockContext;
import src.CParser.ParameterDeclarationContext;
import src.CParser.ParameterListContext;
import src.CParser.ParameterTypeListContext;
import src.CParser.PointerContext;
import src.CParser.PostfixExpressionContext;
import src.CParser.PrimaryExpressionContext;
import src.CParser.RelationalExpressionContext;
import src.CParser.SelectionStatementContext;
import src.CParser.ShiftExpressionContext;
import src.CParser.SpecifierQualifierListContext;
import src.CParser.StatementContext;
import src.CParser.StaticAssertDeclarationContext;
import src.CParser.StorageClassSpecifierContext;
import src.CParser.StructDeclarationContext;
import src.CParser.StructDeclarationListContext;
import src.CParser.StructDeclaratorContext;
import src.CParser.StructDeclaratorListContext;
import src.CParser.StructOrUnionContext;
import src.CParser.StructOrUnionSpecifierContext;
import src.CParser.TranslationUnitContext;
import src.CParser.TypeNameContext;
import src.CParser.TypeQualifierContext;
import src.CParser.TypeQualifierListContext;  
import src.CParser.TypeSpecifierContext;
import src.CParser.TypedefNameContext;
import src.CParser.UnaryExpressionContext;
import src.CParser.UnaryOperatorContext;

public class MyListener implements CListener {
	
//	public MyListener( Map<String, Integer> usedVals2 )  {
//		usedVals = usedVals2;
//	}
	
	String[] R = { "R0", "R1", "R2",  "R3",  "R4",  "R5",  "R6",  "R7", 
			       "R8", "R9", "R10", "R11", "R12", "R13", "R14", "R15" };
	
	boolean[] RInUse = { false, false, false, false, false, false, false, false, 
			             false, false, false, false, false, false, false, false }; 

	Queue<String> keys = new LinkedList<String>();
	
	@Override
	public void enterEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEveryRule(ParserRuleContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		
	}


	// Variable name in an expression.
	@Override
	public void enterPrimaryExpression(PrimaryExpressionContext ctx) {
//		System.out.print( ctx.getText() + " " );
	}

	@Override
	public void exitPrimaryExpression(PrimaryExpressionContext ctx) {
		// TODO Auto-generated method stub
//		System.out.print( ctx.getText() + " " );
		
	}

	@Override
	public void enterGenericSelection(GenericSelectionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitGenericSelection(GenericSelectionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterGenericAssocList(GenericAssocListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitGenericAssocList(GenericAssocListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterGenericAssociation(GenericAssociationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitGenericAssociation(GenericAssociationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPostfixExpression(PostfixExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPostfixExpression(PostfixExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterArgumentExpressionList(ArgumentExpressionListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitArgumentExpressionList(ArgumentExpressionListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterUnaryExpression(UnaryExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUnaryExpression(UnaryExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterUnaryOperator(UnaryOperatorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitUnaryOperator(UnaryOperatorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCastExpression(CastExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCastExpression(CastExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMultiplicativeExpression(MultiplicativeExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMultiplicativeExpression(MultiplicativeExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAdditiveExpression(AdditiveExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAdditiveExpression(AdditiveExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterShiftExpression(ShiftExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitShiftExpression(ShiftExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterRelationalExpression(RelationalExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitRelationalExpression(RelationalExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEqualityExpression(EqualityExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEqualityExpression(EqualityExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAndExpression(AndExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAndExpression(AndExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterExclusiveOrExpression(ExclusiveOrExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitExclusiveOrExpression(ExclusiveOrExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInclusiveOrExpression(InclusiveOrExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInclusiveOrExpression(InclusiveOrExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterLogicalAndExpression(LogicalAndExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitLogicalAndExpression(LogicalAndExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterLogicalOrExpression(LogicalOrExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitLogicalOrExpression(LogicalOrExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterConditionalExpression(ConditionalExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitConditionalExpression(ConditionalExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	} 

	@Override
	public void enterAssignmentExpression(AssignmentExpressionContext ctx) {
//		System.out.println( "Assign Text " + ctx.getText() );
//		System.out.println( "Assign Child " + ctx.getChild(0).getText() );
//		System.out.println( "Assign Parent " + ctx.getParent().getText() );
		
	}

	@Override
	public void exitAssignmentExpression(AssignmentExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAssignmentOperator(AssignmentOperatorContext ctx) {
//		System.out.println( "assop " + ctx.getText() );
		
	}

	@Override
	public void exitAssignmentOperator(AssignmentOperatorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterExpression(ExpressionContext ctx) {
//		System.out.println( "Exx " + ctx.getText() );
//		System.out.println( "Exx " + ctx.getChild(0).getText() );
//		System.out.println( "Exx " + ctx.getParent().getText() );
	}

	@Override
	public void exitExpression(ExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterConstantExpression(ConstantExpressionContext ctx) {
//		System.out.println( "constant " + ctx.getText() );
		
	}

	@Override
	public void exitConstantExpression(ConstantExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDeclaration(DeclarationContext ctx) throws Exception {
		
		System.out.println( "\nStarting new line\n" );

		// Returns the name given to the variable in the original
		// code.
		String var = ctx.getChild( 1 ).getText().split( "=" )[ 0 ];
//		System.out.println( "var = " + var );
		// Returns an uppercase version of that variable name.
		String varUp = var.toUpperCase();
//		System.out.println( "varUp = " + varUp );
		// Returns just the value part (right side of '=' sign).
		String val = ctx.getChild( 1 ).getText().split( "=" )[ 1 ];
//		System.out.println( "val = " + val );

		// Tries to convert values from string to int. If that
		// can't be done because it's referencing another variable
		// then it replaces it with the value of that variable. 
		List<String> arrayVersion = new ArrayList<String>();
		for( String variableName : keys ) {
			if( val.contains( variableName ) ) {
				System.out.println("valln = " + val.length() + " varN.l = " + variableName.length());
				int h = 0;
				for( int i = 0; i < val.length() - variableName.length() ; i++ ) {
					int j = i + variableName.length() ; 
                    if( val.substring( i, j ).equals( variableName ) ) {
                    	arrayVersion.add( val.substring(i, j) );
                    	i += j - 1;
                    	j += j - i;
                    }
                    else {
                    	arrayVersion.add( val.substring( i, i + 1 ) );
                    	j++;
                    }
                    h++;
				}System.out.println("h = " + h);
			}
		}
		System.out.println("\n");
		for( String s : arrayVersion ) System.out.println("Array " + s );
		
		
//		int i = 0;
//		// Make char array of values.
//		char[] charVersion = val.toCharArray();
//		val = "";
//		// For each char in the array see if it is a key
//		// for the dictionary declared at the beginning of
//		// the class. If it is, replace the key with the
//		// value. 
//		for( char c : charVersion ) {
//			if( usedVals.get( String.valueOf( c ) ) != null ) {
//				charVersion[i] = usedVals.get( String.valueOf( c ) )
//						.toString()
//						.charAt(0);
//			}
//			val += String.valueOf( charVersion[i] );
//			i++;
//		}
//		// TODO: What about if referencing a variable that hasn't
//		// been initialized yet. Will also break if variable name 
//		// has number in it. Also order of operations.
//		String splitted [] = val.split( "[*/+-]" );
//		int amountOfOperands = splitted.length;
//
//		String splittedA[] = val.split( "[*]" );
//		String splittedB[] = val.split( "[/]" );
//		String splittedC[] = val.split( "[+]" );
//		String splittedD[] = val.split( "[-]" );
//		System.out.println();
//		for( String s : splitted  ) System.out.println( s );
//		System.out.println();
//		for( String s : splittedA ) System.out.println( s );
//		System.out.println();
//		for( String s : splittedB ) System.out.println( s );
//		System.out.println();
//		for( String s : splittedC ) System.out.println( s );
//		System.out.println();
//		for( String s : splittedD ) System.out.println( s );
//		
		
		
		
		
		
		
		
		
		
		
//		int valInt = 0;
//		try {
//			valInt = Integer.parseInt( val );
//		} catch( NumberFormatException e ) {
//			int i = 0;
//			// Make char array of values.
//			char[] charVersion = val.toCharArray();
//			val = "";
//			// For each char in the array see if it is a key
//			// for the dictionary declared at the beginning of
//			// the class. If it is, replace the key with the
//			// value. 
//			for( char c : charVersion ) {
//				if( usedVals.get( String.valueOf( c ) ) != null ) {
//					charVersion[i] = usedVals.get( String.valueOf( c ) )
//							.toString()
//							.charAt(0);
//				}
//				val += String.valueOf( charVersion[i] );
//				i++;
//			}
//			// TODO: What about if referencing a variable that hasn't
//			// been initialized yet. Will also break if variable name 
//			// has number in it. Also order of operations.
//			String splitted [] = val.split( "[*/+-]" );
//			int amountOfOperands = splitted.length;
//
//			String splittedA[] = val.split( "[*]" );
//			String splittedB[] = val.split( "[/]" );
//			String splittedC[] = val.split( "[+]" );
//			String splittedD[] = val.split( "[-]" );
//			System.out.println();
//			for( String s : splitted  ) System.out.println( s );
//			System.out.println();
//			for( String s : splittedA ) System.out.println( s );
//			System.out.println();
//			for( String s : splittedB ) System.out.println( s );
//			System.out.println();
//			for( String s : splittedC ) System.out.println( s );
//			System.out.println();
//			for( String s : splittedD ) System.out.println( s );
//		}
		
		
		// Returns variable value in hex.
		String valHex = Integer.toHexString( Integer.valueOf( val ) );
		// Format hex string.
		String valHexFormat = padZ( valHex, 4 );
		int length = valHexFormat.length();
		try {
			if( length > 4 ) throw new Exception();
			System.out.println( varUp + " EQU " + valHexFormat );
			keys.add( var );
//			System.out.println("Dict contains: key -> " + var + " val -> " + val );
		} catch( Exception e ) {
			System.out.println( "Values must be <= 16 bits." );
		}
		System.out.println();

	}
	
	@Override
	public void exitDeclaration(DeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}
	
	public static String padZ( String str, int n ) {
	    return String.format( "%1$" + n + "s", str ).replace( ' ', '0' );
	  }

	@Override
	public void enterDeclarationSpecifiers(DeclarationSpecifiersContext ctx) {
//		System.out.println("spec " + ctx.getText());
	}

	@Override
	public void exitDeclarationSpecifiers(DeclarationSpecifiersContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDeclarationSpecifiers2(DeclarationSpecifiers2Context ctx) {
//		System.out.println("spec2 " + ctx.getText());
		
	}

	@Override
	public void exitDeclarationSpecifiers2(DeclarationSpecifiers2Context ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDeclarationSpecifier(DeclarationSpecifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDeclarationSpecifier(DeclarationSpecifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInitDeclaratorList(InitDeclaratorListContext ctx) {
//		System.out.print( ctx.toString() );
		
	}

	@Override
	public void exitInitDeclaratorList(InitDeclaratorListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInitDeclarator(InitDeclaratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInitDeclarator(InitDeclaratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStorageClassSpecifier(StorageClassSpecifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStorageClassSpecifier(StorageClassSpecifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypeSpecifier(TypeSpecifierContext ctx) {
//		System.out.print("LOAD ");
	}

	@Override
	public void exitTypeSpecifier(TypeSpecifierContext ctx) {
		
	}

	@Override
	public void enterStructOrUnionSpecifier(StructOrUnionSpecifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStructOrUnionSpecifier(StructOrUnionSpecifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStructOrUnion(StructOrUnionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStructOrUnion(StructOrUnionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStructDeclarationList(StructDeclarationListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStructDeclarationList(StructDeclarationListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStructDeclaration(StructDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStructDeclaration(StructDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSpecifierQualifierList(SpecifierQualifierListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSpecifierQualifierList(SpecifierQualifierListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStructDeclaratorList(StructDeclaratorListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStructDeclaratorList(StructDeclaratorListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStructDeclarator(StructDeclaratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStructDeclarator(StructDeclaratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEnumSpecifier(EnumSpecifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEnumSpecifier(EnumSpecifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEnumeratorList(EnumeratorListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEnumeratorList(EnumeratorListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEnumerator(EnumeratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEnumerator(EnumeratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEnumerationConstant(EnumerationConstantContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEnumerationConstant(EnumerationConstantContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAtomicTypeSpecifier(AtomicTypeSpecifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAtomicTypeSpecifier(AtomicTypeSpecifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypeQualifier(TypeQualifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypeQualifier(TypeQualifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFunctionSpecifier(FunctionSpecifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFunctionSpecifier(FunctionSpecifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAlignmentSpecifier(AlignmentSpecifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAlignmentSpecifier(AlignmentSpecifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDeclarator(DeclaratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDeclarator(DeclaratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDirectDeclarator(DirectDeclaratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDirectDeclarator(DirectDeclaratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterGccDeclaratorExtension(GccDeclaratorExtensionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitGccDeclaratorExtension(GccDeclaratorExtensionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterGccAttributeSpecifier(GccAttributeSpecifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitGccAttributeSpecifier(GccAttributeSpecifierContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterGccAttributeList(GccAttributeListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitGccAttributeList(GccAttributeListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterGccAttribute(GccAttributeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitGccAttribute(GccAttributeContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterNestedParenthesesBlock(NestedParenthesesBlockContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitNestedParenthesesBlock(NestedParenthesesBlockContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterPointer(PointerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitPointer(PointerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypeQualifierList(TypeQualifierListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypeQualifierList(TypeQualifierListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterParameterTypeList(ParameterTypeListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitParameterTypeList(ParameterTypeListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterParameterList(ParameterListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitParameterList(ParameterListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterParameterDeclaration(ParameterDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitParameterDeclaration(ParameterDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterIdentifierList(IdentifierListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitIdentifierList(IdentifierListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypeName(TypeNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypeName(TypeNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterAbstractDeclarator(AbstractDeclaratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitAbstractDeclarator(AbstractDeclaratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDirectAbstractDeclarator(DirectAbstractDeclaratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDirectAbstractDeclarator(DirectAbstractDeclaratorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTypedefName(TypedefNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTypedefName(TypedefNameContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInitializer(InitializerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInitializer(InitializerContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterInitializerList(InitializerListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitInitializerList(InitializerListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDesignation(DesignationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDesignation(DesignationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDesignatorList(DesignatorListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDesignatorList(DesignatorListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDesignator(DesignatorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDesignator(DesignatorContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStaticAssertDeclaration(StaticAssertDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStaticAssertDeclaration(StaticAssertDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterStatement(StatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitStatement(StatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterLabeledStatement(LabeledStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitLabeledStatement(LabeledStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCompoundStatement(CompoundStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCompoundStatement(CompoundStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterBlockItemList(BlockItemListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitBlockItemList(BlockItemListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterBlockItem(BlockItemContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitBlockItem(BlockItemContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterExpressionStatement(ExpressionStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitExpressionStatement(ExpressionStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterSelectionStatement(SelectionStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitSelectionStatement(SelectionStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterIterationStatement(IterationStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitIterationStatement(IterationStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterForCondition(ForConditionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitForCondition(ForConditionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterForDeclaration(ForDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitForDeclaration(ForDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterForExpression(ForExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitForExpression(ForExpressionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterJumpStatement(JumpStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitJumpStatement(JumpStatementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterCompilationUnit(CompilationUnitContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitCompilationUnit(CompilationUnitContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTranslationUnit(TranslationUnitContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTranslationUnit(TranslationUnitContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterExternalDeclaration(ExternalDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitExternalDeclaration(ExternalDeclarationContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterFunctionDefinition(FunctionDefinitionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitFunctionDefinition(FunctionDefinitionContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDeclarationList(DeclarationListContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDeclarationList(DeclarationListContext ctx) {
		// TODO Auto-generated method stub
		
	}

}
