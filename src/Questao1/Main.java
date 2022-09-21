/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao1;

/**
 *
 * @author Micael
 */
public class Main {
    public static void main(String[] args) {
        /*
        Pessoa micael = new Pessoa("Micael", 20, 1.81);
        System.out.println(micael);
        */
        Agenda ag = new Agenda();
        Pessoa micael = new Pessoa("Micael", 20, 1.81);
        ag.armazenaPessoa("Hyago", 24, 1.90);
        ag.armazenaPessoa("João", 18, 1.78);
        ag.armazenaPessoa("Jean", 17, 1.78);
        ag.armazenaPessoa("Negão Cavalo", 18, 1.76);
        ag.armazenaPessoa("John Animes", 20, 1.83);
        ag.armazenaPessoa("Alexandre", 47, 1.80);
        ag.armazenaPessoa("Luciene", 45, 1.68);
        ag.armazenaPessoa("Giovani", 14, 1.78);
        ag.armazenaPessoa("Bruna", 15, 1.69);
        ag.armazenaPessoas(micael);
        ag.imprimeAgenda();
        ag.armazenaPessoa("Kauan", 19, 1.82);
        ag.imprimePessoa(ag.buscaPessoa("Hyago"));
        ag.removePessoa("Giovani");
        ag.imprimeAgenda();
    }
    
}
