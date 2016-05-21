/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7.exercicio3;

import java.util.Scanner;

/**
 *
 * @author wilker
 */
public class Calculadora {

    private float memoria;
    private final int SOMA = 1;
    private final int SUBTRAI = 2;
    private final int MULTIPLICA = 3;
    private final int DIVIDE = 4;
    private final int LIMPA_MEM = 5;
    private final int SAIR = 6;

    public Calculadora() {
        System.out.println(memoria);
    }

    private void somar(float numero) {
        memoria += numero;
        exibeMemoria();
    }

    private void subtrair(float numero) {
        memoria -= numero;
        exibeMemoria();
    }

    private void multiplicar(float numero) {
        memoria *= numero;
        exibeMemoria();
    }

    private void limpaMemoria() {
        memoria = 0.0f;
        exibeMemoria();
    }

    private void dividir(float numero) {
        if (numero == 0) {
            System.out.println("Impossível dividir por 0");
        } else {
            memoria /= numero;
        }
        exibeMemoria();
    }

    void exibeMemoria() {
        System.out.println(memoria);
    }

    private float lêEntrada() {
        Scanner in = new Scanner(System.in);
        return in.nextFloat();
    }

    void iniciaCalc() {
        Scanner in = new Scanner(System.in);
        boolean continua = false;
        do {
            continua = realizaOperação(in.nextInt());
        } while (continua);
    }

    boolean realizaOperação(int op) {

        switch (op) {
            case SOMA:
                somar(lêEntrada());
                return true;
            case SUBTRAI:
                subtrair(lêEntrada());
                return true;
            case DIVIDE:
                dividir(lêEntrada());
                return true;
            case MULTIPLICA:
                multiplicar(lêEntrada());
                return true;
            case LIMPA_MEM:
                limpaMemoria();
                return true;
            case SAIR:
                return false;
            default:
                System.out.println("Opção invalida");
                return true;
        }

    }
}
