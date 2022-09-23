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
    
    public void Entrar() {
        boolean cheio = true;
        for (int i = 0; i < capacidadePessoas.length; i++){
            
        }
    }
    
}
