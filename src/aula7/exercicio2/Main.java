/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula7.exercicio2;

/**
 *
 * @author wilker
 */
public class Main {

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.inserePessoa("João", 25);
        agenda.inserePessoa("Wilker", 19);
        agenda.inserePessoa("Maria", 13);
        agenda.inserePessoa("Victor", 45);
        agenda.inserePessoa("Sei lá", 99);
        agenda.inserePessoa("Mais um", 10);
        agenda.inserePessoa("Outro", 4);
        agenda.inserePessoa("Ricardo", 10);
        agenda.inserePessoa("João", 26);
        
        agenda.listaPorIdade();
        System.out.println();
        agenda.listaPorNome();
    }
}
