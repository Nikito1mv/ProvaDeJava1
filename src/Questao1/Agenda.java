/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao1;

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
    
}
