/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao4;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<BombaCombustivel> bdc = new ArrayList<BombaCombustivel>();
        BombaCombustivel bomba1 = new BombaCombustivel(1, "gasolina", 5.9, 500);
        bdc.add(bomba1);
        System.out.println(bdc.toString());
        
    }
}
