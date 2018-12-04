package com.alessandrolima.calculadoraexemplo.calculadora.presenter;

import android.view.View;

import com.alessandrolima.calculadoraexemplo.R;
import com.alessandrolima.calculadoraexemplo.base.BasePresenter;
import com.alessandrolima.calculadoraexemplo.calculadora.model.Teclado;
import com.alessandrolima.calculadoraexemplo.calculadora.view.CalculadoraActivityView;
import com.alessandrolima.calculadoraexemplo.herper.ValidaExpressaoHelper;

public class CalculadoraPresenter extends BasePresenter {

    private CalculadoraActivityView view;

    public CalculadoraPresenter(final CalculadoraActivityView view) {
        this.view = view;
    }

    public void cliqueBotao(View botaoClicado) {
        switch (botaoClicado.getId()) {
            case R.id.calculadora_botao_zero:
                view.setExpressao(insereValor(Teclado.ZERO.getValor()));
                break;
            case R.id.calculadora_botao_um:
                view.setExpressao(insereValor(Teclado.UM.getValor()));
                break;
            case R.id.calculadora_botao_dois:
                view.setExpressao(insereValor(Teclado.DOIS.getValor()));
                break;
            case R.id.calculadora_botao_tres:
                view.setExpressao(insereValor(Teclado.TRES.getValor()));
                break;
            case R.id.calculadora_botao_quatro:
                view.setExpressao(insereValor(Teclado.QUATRO.getValor()));
                break;
            case R.id.calculadora_botao_cinco:
                view.setExpressao(insereValor(Teclado.CINCO.getValor()));
                break;
            case R.id.calculadora_botao_seis:
                view.setExpressao(insereValor(Teclado.SEIS.getValor()));
                break;
            case R.id.calculadora_botao_sete:
                view.setExpressao(insereValor(Teclado.SETE.getValor()));
                break;
            case R.id.calculadora_botao_oito:
                view.setExpressao(insereValor(Teclado.OITO.getValor()));
                break;
            case R.id.calculadora_botao_nove:
                view.setExpressao(insereValor(Teclado.NOVE.getValor()));
                break;
            case R.id.calculadora_botao_mais:
                view.setExpressao(insereValor(Teclado.MAIS.getValor()));
                break;
            case R.id.calculadora_botao_menos:
                view.setExpressao(insereValor(Teclado.MENOS.getValor()));
                break;
            case R.id.calculadora_botao_vezes:
                view.setExpressao(insereValor(Teclado.VEZES.getValor()));
                break;
            case R.id.calculadora_botao_dividir:
                view.setExpressao(insereValor(Teclado.DIVIDIR.getValor()));
                break;
            case R.id.calculadora_botao_apagar:
                view.setExpressao(apagaValor(view.getExpressao()));
                break;
            case R.id.calculadora_botao_igual:
                validaExpressao();
                break;
        }
    }

    private String  apagaValor(String expressao) {
        if (expressao.length() > 0)
           return expressao.substring(0, expressao.length()-1);
        else
            return "";
    }

    private String insereValor(String valor){
        return view.getExpressao() + valor;
    }

    private void validaExpressao() {
        try {
            double resul = ValidaExpressaoHelper.resolveExpressao(view.getExpressao());
            view.showToastExpressao("Resultado = " + resul);
        }catch (Exception a){
            view.showToastErro(a.getMessage());
        }
    }
}

