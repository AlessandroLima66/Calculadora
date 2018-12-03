package com.alessandrolima.calculadoraexemplo.calculadora.model;

import com.alessandrolima.calculadoraexemplo.R;

public enum Teclado {
    ZERO("0"),
    UM("1"),
    DOIS("2"),
    TRES("3"),
    QUATRO("4"),
    CINCO("5"),
    SEIS("6"),
    SETE("7"),
    OITO("8"),
    NOVE("9"),
    MAIS("+"),
    MENOS("-"),
    VEZES("*"),
    DIVIDIR("/"),
    IGUAL("="),
    APAGAR("<");

    private String valor;

    Teclado(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
