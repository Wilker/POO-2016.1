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
public class Main {

    public static void main(String[] args) {

        Menu.menu();
        Calculadora calculadora = new Calculadora();
        calculadora.iniciaCalc();
    }
}
