package com.JavaStudent.DesignPattern.Interpreter;

public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEEExpression = getJavaEEExpression();

        System.out.println("Does developer know Java Core: " + isJava.interpreter("Java Core"));
        System.out.println("Does developer know Java EE: " + isJavaEEExpression.interpreter("Java Spring"));
    }

    public static Expression getJavaExpression(){
        Expression java = new TerminalExpression("Java");
        Expression javaCore = new TerminalExpression("Java Core");

        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression(){
        Expression java = new TerminalExpression("Java");
        Expression spring = new TerminalExpression("Spring");

        return new EndExpression(java, spring);
    }
}
