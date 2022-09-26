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
    
    Elevador(int totalDeAndares, int capacidadeDePessoas) {
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
                System.out.println("Uma pessoa entrou no elevador");
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
                System.out.println("Uma pessoa saiu do elevador");
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
            System.out.println("O elevador subiu para o " + andarAtual + " andar");
        } else {
            System.out.println("Vocé já está na cobertura");
        }
    }
    
    public void descer() {
        if (andarAtual > 1) {
            andarAtual -= 1;
            System.out.println("O elevador desceu para o " + andarAtual + " andar");
        } else if (andarAtual == 1) {
            andarAtual -= 1;
            System.out.println("O elevador desceu para o térreo");
        } else {
            System.out.println("Você já está no térreo");
        }
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int[] getTotalAndares() {
        return totalAndares;
    }

    public int[] getCapacidadePessoas() {
        return capacidadePessoas;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void setTotalAndares(int[] totalAndares) {
        this.totalAndares = totalAndares;
    }

    public void setCapacidadePessoas(int[] capacidadePessoas) {
        this.capacidadePessoas = capacidadePessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        this.numeroPessoas = numeroPessoas;
    }
    
    
}
