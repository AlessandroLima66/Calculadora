package com.alessandrolima.calculadoraexemplo.calculadora.view;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.alessandrolima.calculadoraexemplo.R;
import com.alessandrolima.calculadoraexemplo.base.BaseActivity;
import com.alessandrolima.calculadoraexemplo.calculadora.presenter.CalculadoraPresenter;

public class CalculadoraActivity extends BaseActivity<CalculadoraPresenter>
        implements CalculadoraActivityView {

    private Button botao_zero;
    private Button botao_um;
    private Button botao_dois;
    private Button botao_tres;
    private Button botao_quatro;
    private Button botao_cinco;
    private Button botao_seis;
    private Button botao_sete;
    private Button botao_oito;
    private Button botao_nove;
    private Button botao_mais;
    private Button botao_menos;
    private Button botao_vezes;
    private Button botao_dividir;
    private Button botao_apagar;
    private Button botao_igual;
    private TextView expressao;

    @NonNull
    @Override
    protected CalculadoraPresenter createPresenter(@NonNull Context context) {
        return new CalculadoraPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        expressao = findViewById(R.id.calculadora_expressao);
        botao_zero = findViewById(R.id.calculadora_botao_zero);
        botao_um = findViewById(R.id.calculadora_botao_um);
        botao_dois = findViewById(R.id.calculadora_botao_dois);
        botao_tres = findViewById(R.id.calculadora_botao_tres);
        botao_quatro = findViewById(R.id.calculadora_botao_quatro);
        botao_cinco = findViewById(R.id.calculadora_botao_cinco);
        botao_seis = findViewById(R.id.calculadora_botao_seis);
        botao_sete = findViewById(R.id.calculadora_botao_sete);
        botao_oito = findViewById(R.id.calculadora_botao_oito);
        botao_nove = findViewById(R.id.calculadora_botao_nove);
        botao_mais = findViewById(R.id.calculadora_botao_mais);
        botao_menos = findViewById(R.id.calculadora_botao_menos);
        botao_vezes = findViewById(R.id.calculadora_botao_vezes);
        botao_dividir = findViewById(R.id.calculadora_botao_dividir);
        botao_apagar = findViewById(R.id.calculadora_botao_apagar);
        botao_igual = findViewById(R.id.calculadora_botao_igual);


        OnButtonsClicked onButtonsClicked = new OnButtonsClicked();
        botao_zero.setOnClickListener(onButtonsClicked);
        botao_um.setOnClickListener(onButtonsClicked);
        botao_dois.setOnClickListener(onButtonsClicked);
        botao_tres.setOnClickListener(onButtonsClicked);
        botao_quatro.setOnClickListener(onButtonsClicked);
        botao_cinco.setOnClickListener(onButtonsClicked);
        botao_seis.setOnClickListener(onButtonsClicked);
        botao_sete.setOnClickListener(onButtonsClicked);
        botao_oito.setOnClickListener(onButtonsClicked);
        botao_nove.setOnClickListener(onButtonsClicked);
        botao_mais.setOnClickListener(onButtonsClicked);
        botao_menos.setOnClickListener(onButtonsClicked);
        botao_vezes.setOnClickListener(onButtonsClicked);
        botao_dividir.setOnClickListener(onButtonsClicked);
        botao_apagar.setOnClickListener(onButtonsClicked);
        botao_igual.setOnClickListener(onButtonsClicked);
    }


    @Override
    public void setExpressao(String valor) {
        expressao.setText(valor);
    }

    @Override
    public CharSequence getExpressao() {
        return expressao.getText();
    }

    @Override
    public void showToastExpressao() {
        Toast.makeText(this,expressao.getText(), Toast.LENGTH_LONG).show();
    }

    private class OnButtonsClicked implements View.OnClickListener {
        @Override
        public void onClick(final View view) {
            mPresenter.cliqueBotao(view);
        }
    }
}
