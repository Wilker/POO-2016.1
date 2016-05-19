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
class Pessoa {

    private String nome;
    private int idade;

    Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    String getNome() {
        return nome;
    }

    int getIdade() {
        return idade;
    }

}
