/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
/*Problema: Uma empresa de entregas precisa gerenciar 
sua frota de veículos. Para isso, é essencial registrar 
informações como modelo, placa e capacidade de carga de 
cada carro, caminhão ou moto*/

public class Veiculo {
    String modelo;
    String placa;
    double cap_Carga;
    
    public void exibirInfo(){
    System.out.println("--------FROTA DE VEICULOS--------");
    System.out.println("Modelo: " + modelo);
    System.out.println("Placa: " + placa);
    System.out.println("Capacidade de carga: " + cap_Carga);
    };
}
