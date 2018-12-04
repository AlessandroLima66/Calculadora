package com.alessandrolima.calculadoraexemplo.calculadora.view;

public interface CalculadoraActivityView {

    void setExpressao(String valor);

    String getExpressao();

    void showToastExpressao(String mensagem);

    void showToastErro(String mensagem);
}
