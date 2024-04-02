package org.iftm.atividadea2;

public class Calculadora {
    private int memoria;

    public Calculadora() {
        this.memoria = 0;
    }

    public Calculadora(int memoria) {
        this.memoria = memoria;
    }

    public int getMemoria() {
        return this.memoria;
    }

    public void zerarMemoria() {
        this.memoria = 0;
    }

    public void somar(int valor) {
        this.memoria += valor;
    }

    public void subtrair(int valor) {
        this.memoria -= valor;
    }

    public void multiplicar(int valor) {
        this.memoria *= valor;
    }

    public void dividir(int valor) {
        if (valor == 0) {
            throw new ArithmeticException("Divisão por zero!");
        }
        this.memoria /= valor;
    }

    public void exponenciar(int valor) {
        if (valor > 10) {
            throw new IllegalArgumentException("Expoente incorreto, valor máximo é 10.");
        }
        this.memoria = (int) Math.pow(this.memoria, valor);
    }
}
