package com.dcc.ufjf;

public class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String imprimirTextoTXT(String texto) {
        Impressora impressora = new Impressora(texto);
        return impressora.imprimir(new OperacaoImprimirTXT());
    }

    public String imprimirTextoDOCX(String texto) {
        Impressora impressora = new Impressora(texto);
        return impressora.imprimir(new OperacaoImprimirDOCX());
    }

    public String imprimirTextoPDF(String texto) {
        Impressora impressora = new Impressora(texto);
        return impressora.imprimir(new OperacaoImprimirPDF());
    }
}
