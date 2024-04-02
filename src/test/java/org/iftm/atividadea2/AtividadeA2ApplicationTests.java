package org.iftm.atividadea2;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AtividadeA2ApplicationTests {
    private static Calculadora calculadora;

    @BeforeAll
    public static void setUp() {
        calculadora = new Calculadora(3);
    }

    @Test
    public void testConstrutorSemParametro() {
        Calculadora calc = new Calculadora();
        assertEquals(0, calc.getMemoria());
    }

    @Test
    public void testConstrutorComParametro() {
        assertEquals(3, calculadora.getMemoria());
    }

    @Test
    public void testSomarNumeroNegativo() {
        Calculadora calc = new Calculadora();
        calc.somar(-5);
        assertEquals(1, calc.getMemoria());
    }
    

    @Test
    public void testSubtrairNumeroPositivo() {
        calculadora.subtrair(2);
        assertEquals(1, calculadora.getMemoria());
    }

    @Test
    public void testMultiplicarNumeroPositivo() {
        calculadora.multiplicar(2);
        assertEquals(6, calculadora.getMemoria());
    }

    @Test
    public void testDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(0));
    }

    @Test
    public void testDividirPorValorPositivo() throws Exception {
        assertThrows(ArithmeticException.class, () -> calculadora.dividir(0));
    }

    @Test
    public void testExponenciarValorMaiorQue10() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.exponenciar(11));
    }

    @Test
    public void testExponenciarPorUm() throws Exception {
        calculadora.exponenciar(1);
        assertEquals(1, calculadora.getMemoria());
    }

    @Test
    public void testZerarMemoria() {
        calculadora.zerarMemoria();
        assertEquals(0, calculadora.getMemoria());
    }

    @AfterAll
    public static void tearDown() {
        calculadora = null;
    }
}
