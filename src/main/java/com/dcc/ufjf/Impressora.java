package com.dcc.ufjf;

public class Impressora {
    private String texto;

    public Impressora(String texto) {
        this.texto = texto;
    }

    public String imprimir(Operacao operacao) {
        if (operacao == null || !(operacao.getClass() == OperacaoImprimirDOCX.class) && !(operacao.getClass() == OperacaoImprimirPDF.class)
                && !(operacao.getClass() == OperacaoImprimirTXT.class)) {
            throw new IllegalArgumentException("Operação inválida");
        }
        return operacao.imprimir(texto);
    }
}
