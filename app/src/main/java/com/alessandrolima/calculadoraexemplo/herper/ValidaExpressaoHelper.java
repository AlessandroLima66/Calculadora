package com.alessandrolima.calculadoraexemplo.herper;


import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public abstract class ValidaExpressaoHelper {

    public static double resolveExpressao(String expressao) throws ArithmeticException {
        Expression e = new ExpressionBuilder(expressao)
                .build();

        return e.evaluate();
    }
}
