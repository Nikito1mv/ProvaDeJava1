/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao1;

import java.util.Arrays;

/**
 *
 * @author Micael
 */
public class Agenda {
    
    private Pessoa[] agenda;
    
    public Agenda() {
        agenda = new Pessoa[10];
    }
     
    public void armazenaPessoa(String nome, int idade, double altura) {
        Pessoa x = new Pessoa(nome, idade, altura);
        boolean cheio = true;
        for(int i = 0; i < agenda.length; i++) {
            if(agenda[i] == null) {
               agenda[i] = x;
               cheio = false;
               break;
            }
        }
        if (cheio) {
            System.out.println("Agenda cheia");
        }
    }
    
    public void removePessoa(String nome) {
        for(int i = 0; i < agenda.length; i++) {
            if(agenda[i].getNome().equals(nome)) {
               agenda[i] = null;
               break;
            }
        }
    }
    
    public int buscaPessoa(String nome) {
        for(int i = 0; i < agenda.length; i++) {
            if(agenda[i].getNome().equals(nome)) {
               return i;
            } else {
                System.out.println("Pessoa não encontrada");
            }
        } return 11;
    }
    
    public void imprimeAgenda() {
        /*for(int i = 0; i < agenda.length; i++) {
            agenda[i].toString();
        }*/
        System.out.println(Arrays.toString(agenda));
    }
    
    public void imprimePessoa(int index) {
        for(int i = 0; i < agenda.length; i++) {
            if(i == index) {
                agenda[i].toString();
            }
        }
    }
    
    
    
    public void armazenaPessoas(Pessoa nomedapessoa) {
        boolean cheio = true;
        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i] == null) {
                agenda[i] = nomedapessoa;
                cheio = false;
                break;
            }
        }
        if (cheio) {
            System.out.println("Agenda cheia");
        }

    }
    
}
