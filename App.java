package com.example.Quest20;

import java.util.Scanner;

public class App {
  
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        //Armazenamento dos Dados
        int anodeFabricação = 0;
        float valorVeiculo = 0.0f;
        float porcentagemDesconto = 0.0f;
        float valorDesconto = 0.0f;
        float valorPagar = 0.0f;
        
        
        int totaldeCarrosSemiNovos = 0;
        int totaldeCarros = 0;
        
        
        char desejaRepetir = 's'; //modo para repetição com condição
       
        while (desejaRepetir == 's' || desejaRepetir == 'S'){/*condição s ou S
            digitados*/
            
        //Entrada de Dados
        System.out.println("Digite o ano de fabricação do veiculo");
        anodeFabricação = leitor.nextInt();
        System.out.println("Digite o valor do veiculo");
        valorVeiculo = leitor.nextFloat();
        
        if (anodeFabricação >= 2000){ //requisito 1 para aplicar
            porcentagemDesconto = 0.12f; //porcentagem para calcular 
        }else { //requisito 2 para aplicar
            porcentagemDesconto = 0.07f;// porcentagem para calcular 
            
        totaldeCarrosSemiNovos++; /*dentro da estrutura if para contabilizar */     
        }  
        totaldeCarros++; /*Fora da estrutura para contar o geral de carros */
        
        valorDesconto = valorVeiculo * porcentagemDesconto;
        valorPagar =  valorVeiculo - valorDesconto;
        
        System.out.println("O Valor do desconto foi de: " + valorDesconto);
        System.out.println("O Valor que deve ser pago é: " + valorPagar);
        
        System.out.println("Deseja Fazer Mais ? S - Sim / N -Não");
        desejaRepetir = leitor.next().charAt(0);
        } // repetição while acabou
        
    System.out.println("Total de Carros Semi Novos: " + totaldeCarrosSemiNovos);
    System.out.println("Total de Carros: " + totaldeCarros);
    }   
}
