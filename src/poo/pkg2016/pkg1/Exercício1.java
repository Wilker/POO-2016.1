/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.pkg2016.pkg1;

import java.util.Scanner;

/**
 * @author midiacom
 */
public class Exercício1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;
        System.out.println("Insira o valor de a ");
        a = in.nextDouble();
        System.out.println("Insira o valor de b ");
        b = in.nextDouble();
        System.out.println("Insira o valor de c ");
        c = in.nextDouble();

        double delta = calculaDiscriminante(a, b, c);
        System.out.println("Discriminante "+ delta);
        if (delta < 0) {
            System.out.println("Não há raízes reais");
        } else {
            if (delta == 0) {
                double raiz1 = calculaRaiz1(a, b, c, delta);
                System.out.println(raiz1);
            }else{
                double raiz1 = calculaRaiz1(a, b, c, delta);
                double raiz2 = calculaRaiz2(a, b, c, delta);
                System.out.println(raiz1 +" "+ raiz2);
            }
        }
    }

    static double calculaDiscriminante(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }

    static double calculaRaiz1(double a, double b, double c, double delta) {
        return (-b+Math.sqrt(delta))/2*a;
    }

    static double calculaRaiz2(double a, double b, double c, double delta) {
        return (-b-Math.sqrt(delta))/2*a;
    }

}
