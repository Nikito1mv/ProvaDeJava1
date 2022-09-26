/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questao4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<BombaCombustivel> posto = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int id = 0;
        System.out.println("Digite 1 para registrar uma nova bomba de combustivel"
                          +"ou 2 para editar");
        int resposta = scan.nextInt();
        if (resposta == 1) {
            System.out.println("Digite o tipo de combustivel");
            String tipo = scan.nextLine();
            System.out.println("Digite o valor do litro");
            double valor = scan.nextDouble();
            System.out.println("Digite a quantidade de combustivel");
            double quantidade = scan.nextDouble();
            BombaCombustivel bomba = new BombaCombustivel(id, tipo, valor, quantidade);
            id++;
            posto.add(bomba);
        } else if (resposta == 2) {
            System.out.println("Digite o id da bomba de combustivel que deseja editar");
            resposta = scan.nextInt();
            System.out.println("Digite 1 para editar o tipo de combustivel"
                              +"Digite 2 para editar o valor do combustivel"
                              +"Digite 3 para editar a quantidade de combustivel"
                              +"Digite 4 para registrar um abastecimento por valor"
                              +"Digite 5 para registrar um abastecimento por litro");
            int resposta2 = scan.nextInt();
            for (BombaCombustivel bomba : posto) {
                if (bomba.getId() == resposta) {
                    switch (resposta2) {
                        case 1:
                            System.out.println("Digite um novo tipo de combustivel");
                            String novoTipo = scan.nextLine();
                            bomba.setTipoDeCombustivel(novoTipo);
                            break;
                        case 2:
                            System.out.println("Digite o novo valor do combustivel");
                            double novoValor = scan.nextDouble();
                            bomba.setValorDoLitro(novoValor);
                            break;
                        case 3:
                            System.out.println("Digite uma nova quantidade de combustivel");
                            double novaQuantidade = scan.nextDouble();
                            bomba.setQuantidadeDoCombustivel(novaQuantidade);
                            break;
                        case 4:
                            System.out.println("Digite o valor em reais a ser Debitado");
                            double valor = scan.nextDouble();
                            bomba.abastecerPorValor(valor);
                        case 5:
                            System.out.println("Digite quantos litros deseja abastecer");
                            double litros = scan.nextDouble();
                            bomba.abastecerPorLitro(litros);
                            break;
                        default:
                            System.out.println("Opção inválida");
                            break;
                    }
                } else {
                    System.out.println("Opção inválida");
                }
            }
        }
    }
}
