package com.oodexamples.patterns.behavioral.interpreter;

public class Client {
    public static void main(String[] args){
        Expression expr1 = new TerminalExpression("Mary");
        Expression expr2 = new TerminalExpression("Susan");
        Expression expr3 = new TerminalExpression("Andy");
        String context1 = "Mary & Susan";
        String context2 = "Mary & Andy";

        Expression andExpr = new AndExpression(expr1, expr2);
        Expression orExpr = new OrExpression(expr1, expr3);
        boolean mustBeTrue = andExpr.interpret(context1);
        boolean mustBeFalse = andExpr.interpret(context2);
        boolean mustBeTrueToo = orExpr.interpret(context1);
        System.out.println(mustBeTrue);
        System.out.println(mustBeFalse);
        System.out.println(mustBeTrueToo);
    }
}