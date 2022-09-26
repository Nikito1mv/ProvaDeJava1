/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao4;

/**
 *
 * @author Micael
 */
public class BombaCombustivel {
    private int id;
    private String tipoDeCombustivel;
    private double valorDoLitro, quantidadeDoCombustivel;
    
    BombaCombustivel(int id, String tipoDeCombustivel, double valorDoLitro, double quantidadeDoCombustivel){
        this.id = id;
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.valorDoLitro = valorDoLitro;
        this.quantidadeDoCombustivel = quantidadeDoCombustivel;
    }
    
    public double abastecerPorValor(double valor) {
        double litros = valor / valorDoLitro;
        if (litros <= quantidadeDoCombustivel) {
            quantidadeDoCombustivel -= litros;
        } else {
            System.out.println("Quantidade indisponivel");
        }
        return litros;
    }
    
    public double abastecerPorLitro(double litros) {
        double valor = litros * valorDoLitro;
        if (litros <= quantidadeDoCombustivel) {
            quantidadeDoCombustivel -= litros;
        } else {
            System.out.println("Quantidade indisponivel");
        }
        return valor;
    }
    
    public int getId() {
        return id;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public double getValorDoLitro() {
        return valorDoLitro;
    }

    public double getQuantidadeDoCombustivel() {
        return quantidadeDoCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public void setValorDoLitro(double valorDoLitro) {
        this.valorDoLitro = valorDoLitro;
    }

    public void setQuantidadeDoCombustivel(double quantidadeDoCombustivel) {
        this.quantidadeDoCombustivel = quantidadeDoCombustivel;
    }
    
}
