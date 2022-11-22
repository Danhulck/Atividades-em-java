package com.mycompany.calculadora;
import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {
        float num1, num2, total;
        int escolha, EscolhaFinal;
        //estrutura de repetição para "reiniciar o programa"(que aparentemente não está funcionando)
        //um dia eu conserto
        do{
            //pergunta + recebimento do 1º(primeiro) número
            System.out.println("Escreva um número: ");
            Scanner Uk1 = new Scanner(System.in);
            num1 = Uk1.nextFloat();

            //estrutura de repetição para receber apenas números dentro das
            //opções citadas abaixo
            do{            
                Scanner Uk = new Scanner(System.in);
                System.out.println("Escolha ente as operações: ");
                System.out.println("([1] + Soma)  /  ([2] - Subtração)");
                System.out.println("([3] % Divisão/  ([4] X Multiplicação))");
                System.out.println("([5] Raíz)");
                escolha = Uk.nextInt();
            // fim da estrutura de repetição
            }while(escolha >= 6 || escolha <=0);

            //foi utilizado a estrutura condicional 'if' pelo motivo de "facilitação" 
            //do programador (pois o programa não consegue chamar + operações no final
            // a não ser que o usuário reinicie)
            if(escolha == 5){
                total = (float) Math.sqrt(num1);
                System.out.println(total);
                System.out.println("Deu tudo certin (raíz)" );
                System.exit(0);
            }

            //pergunta + recebimento do 2º(segundo) número
            System.out.println("Escreva outro número");
            Scanner Uk2 = new Scanner(System.in);
            num2 = Uk2.nextFloat();

            //estrutura condicional para executar qualquer umadas operações citadas
            //entre a linha 19-22
            switch(escolha){
                case 1 -> {
                    total = num1 + num2;
                    System.out.println(total);
                }
                case 2 -> {
                    total = num1 - num2;
                    System.out.println(total);
                }
                case 3 -> {
                    total = num1 / num2;
                    System.out.println(total);
                }
                case 4 -> {
                    total = num1 * num2;
                    System.out.println(total);
                }  
            }
            do{            
                Scanner Uk = new Scanner(System.in);
                System.out.println("REINICIAR?");
                System.out.println("[1] Sim");
                System.out.println("([2] Não)");
                EscolhaFinal = Uk.nextInt();
            }while(EscolhaFinal == '1' ||EscolhaFinal == '2');
            System.out.println("Deu tudo certin " );

            //fim da estrutura de repetição para reiniciar o programa
        }while(EscolhaFinal == '2');
        System.out.println(EscolhaFinal);
     }
}