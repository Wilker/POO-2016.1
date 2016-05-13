/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import java.util.Scanner;

/**
 *
 * @author wilker
 */
public class Exercício4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Insira o nome do produto");
        String nome = in.nextLine();
        System.out.println("Insira o preço");
        double preco = in.nextDouble();
        System.out.println("Insira a quantidade");
        double qtd = in.nextDouble();

        if (qtd > 0 && qtd <= 10) {
            System.out.println(nome + " " + preco * qtd);
        } else {
            if (qtd > 10 && qtd <= 20) {
                System.out.println(nome + " " + (preco * qtd) * 0.9);
            }
            if (qtd > 20 && qtd <= 50) {
                System.out.println(nome + " " + (preco * qtd) * 0.8);
            } else if (qtd > 50) {
                System.out.println(nome + " R$" + (preco * qtd) * 0.75);
            } else {
                System.out.println("Quantidade inválida");
            }
        }
    }
}
