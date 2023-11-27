package com.dcc.ufjf;

public class OperacaoImprimirPDF implements Operacao {
    public String imprimir(String texto) {
        return "Imprimindo PDF: " + texto;
    }
}
