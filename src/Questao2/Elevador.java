/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao2;

/**
 *
 * @author PC
 */
public class Elevador {
    private int andarAtual;
    private int[] totalAndares;
    private int[] capacidadePessoas;
    private int numeroPessoas;
    
    public Elevador(int totalDeAndares, int capacidadeDePessoas) {
        this.andarAtual = 0;
        totalAndares = new int[totalDeAndares];
        capacidadePessoas = new int[capacidadeDePessoas];
        this.numeroPessoas = 0;
    }
    
    public void entrar() {
        boolean cheio = true;
        for (int i = 0; i < capacidadePessoas.length; i++){
            if (capacidadePessoas[i] == 0) {
                capacidadePessoas[i] = 1;
                cheio = false;
                break;
            }
        }
        if (cheio) {
            System.out.println("Elevador Cheio");
        }
    }
    
    public void sair() {
        boolean vazio = true;
        for (int i = 0; i < capacidadePessoas.length; i++) {
            if (capacidadePessoas[i] == 1) {
                capacidadePessoas[i] = 0;
                vazio = false;
                break;
            }
        }
        if (vazio) {
            System.out.println("O elevador esta vazio");
        }
    }
    
    public void subir() {
        if (andarAtual < totalAndares.length) {
            andarAtual += 1;
        } else {
            System.out.println("Vocé já está no ultimo andar");
        }
    }
    
    public void descer() {
        if (andarAtual > 0) {
            andarAtual -= 1;
        }
    }
    
}
