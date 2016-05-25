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
public class Agenda {

    private Pessoa[] agenda = new Pessoa[100];

    public void inserePessoa(String nome, int idade) {
        Pessoa pessoa = new Pessoa(nome, idade);
        boolean inseriu = false;
        int i = 0;
        while (!inseriu) {
            if (agenda[i] == null) {
                agenda[i] = pessoa;
                inseriu = true;
            }
            if (i == agenda.length - 1) {
                System.out.println("agenda cheia");
                break;
            }
            i++;
        }
    }

    public void listaPorNome() {
        ordena("nome");
        imprime();
    }

    public void listaPorIdade() {
        ordena("idade");
        imprime();
    }

    private void ordena(String tipo) {

        boolean houveTroca;
        do {
            houveTroca = false;
            for (int i = 0; (i < agenda.length - 1) && (agenda[i + 1] != null); i++) {
                if ((tipo.equals("nome") && (agenda[i].getNome().compareToIgnoreCase(agenda[i + 1].getNome())) > 0)
                        || (tipo.equals("idade") && (agenda[i].getIdade() > agenda[i + 1].getIdade()))) {
                    Pessoa aux = agenda[i];
                    agenda[i] = agenda[i + 1];
                    agenda[i + 1] = aux;
                    houveTroca = true;
                }
            }
        } while (houveTroca);

    }

    private void imprime() {
        for (int i = 0; i < agenda.length && agenda[i]!=null; i++) {
            System.out.printf("Nome: %s Idade: %d\n", agenda[i].getNome(), agenda[i].getIdade());
        }
    }
}
