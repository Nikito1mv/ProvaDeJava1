/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao3;

/**
 *
 * @author Micael
 */
public class Tamagushi {
    private String nome;
    private int fome;
    private int tedio;
    private int idade;
    
    Tamagushi(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        tedio = 100;
        fome = 100;
    }

    public String getNome() {
        return nome;
    }

    public int getFome() {
        return fome;
    }

    public int getTedio() {
        return tedio;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public void setTedio(int tedio) {
        this.tedio = tedio;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void brincar(double minutos) {
        int diversao = (int) (minutos * 1);
        if (diversao <= tedio) {
            tedio -= diversao;
        } else {
            tedio = 0;
        }
    }
}
