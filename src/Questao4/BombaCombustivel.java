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
    private double valorDoLitro;
    private double quantidadeDoCombustivel;
    
    BombaCombustivel(int id, String tipoDeCombustivel, double valorDoLitro, double quantidadeDoCombustivel){
        this.id = id;
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.valorDoLitro = valorDoLitro;
        this.quantidadeDoCombustivel = quantidadeDoCombustivel;
    }
    
    public void abastecerPorValor(double valor) {
        double litros = valor / valorDoLitro;
        quantidadeDoCombustivel -= litros;
        System.out.println("Você abasteceu " + litros + " litros");
    }
    
    public void abastecerPorLitro(double litros) {
        double valor = litros * valorDoLitro;
        quantidadeDoCombustivel -= litros;
        System.out.println("Total a pagar é " + valor + " reais");
    }
    
    public void abastecerBomba(int litros) {
        quantidadeDoCombustivel += litros;
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
