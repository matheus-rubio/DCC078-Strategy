package com.dcc.ufjf;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlunoTest {

    @Test
    public void testImprimirDOCX() {
        Aluno aluno = new Aluno("Teste");
        assertEquals("Imprimindo DOCX: Teste", aluno.imprimirTextoDOCX("Teste"));
    }

    @Test
    public void testImprimirPDF() {
        Aluno aluno = new Aluno("Teste");
        assertEquals("Imprimindo PDF: Teste", aluno.imprimirTextoPDF("Teste"));
    }

    @Test
    public void testImprimirTXT() {
        Aluno aluno = new Aluno("Teste");
        assertEquals("Imprimindo TXT: Teste", aluno.imprimirTextoTXT("Teste"));
    }

    @Test  
    public void testImprimirInvalido() {
        try {
            Impressora impressora = new Impressora("Teste");
            impressora.imprimir(null);
            fail("Deveria ter lançado uma exceção");
        } catch (Exception e) {
            assertEquals("Operação inválida", e.getMessage());
        }
    }
}
