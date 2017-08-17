/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversordenumeros;

import java.util.Scanner;

/**
 *
 * @author andrey.schemel
 */
public class ConversorDeNumeros {

    public static void main(String[] args) {
        
        Metodos m = new Metodos();
        Scanner scan = new Scanner(System.in);
        int opcao;
     
        do{
            System.out.println("Digite a base para conversão de números");
            System.out.println("1- Decimal                             ");
            System.out.println("2- Binário                             ");
            System.out.println("3- Octal                               ");
            System.out.println("4- Hexadecimal                         ");
            System.out.println("0 - Para finalizar                     ");
            opcao = scan.nextInt();
            
             switch(opcao){
                case 1:
                    System.out.println("Digite o numero para a conversão:");
                    int decimal = scan.nextInt();
                    
                    System.out.println("\nEntrada\nBase: Decimal\nValor:" + decimal + "\nSaída" + 
                    "\n" + "Binário: " + Metodos.converterDecimalParaBinario(decimal) + 
                    "\n" + "Octal: " + Metodos.converterDecimalParaOctal(decimal) +
                    "\n" + "Hexadecimal: " + Metodos.converterDecimalParaHexadecimal(decimal) + 
                    "\n");
                    
                break;
                case 2:
                    System.out.println("Digite o numero para a conversão:");
                    String binario = scan.next();
                    
                    System.out.println("\nEntrada\nBase: Binário\nValor:" + binario + "\nSaída" + 
                    "\n" + "Decimal: " + Metodos.converterBinarioParaDecimal(binario) + 
                    "\n" + "Octal: " + Metodos.converterBinarioParaOctal(binario) + 
                    "\n" + "Hexadecimal: " + Metodos.converterBinarioParaHexadecimal(binario) + 
                    "\n");
                    
                    break;
                case 3:
                    System.out.println("Digite o numero para a conversão: ");
                    String octal = scan.next();
                    
                    System.out.println("\nEntrada\nBase: Octal\nValor:" + octal + "\nSaída" + 
                    "\n" + "Binário: " + Metodos.converterOctalParaBinario(octal) + 
                    "\n" + "Decimal: " + Metodos.converterOctalParaDecimal(octal) + 
                    "\n" + "Hexadecimal: " + Metodos.converterOctalParaHexadecimal(octal) + 
                    "\n");  
                    
                    break;
                case 4:
                    System.out.println("Digite o numero para a conversaão: ");
                    String hexadecimal = scan.next();
                    
                    System.out.println("\nEntrada\nBase: Hexadecimal\nValor:" + hexadecimal + "\nSaída" + 
                    "\n" + "Binário: " + Metodos.converterHexadecimalParaBinario(hexadecimal) + 
                    "\n" + "Decimal: " + Metodos.converterHexadecimalParaDecimal(hexadecimal) + 
                    "\n" + "Octal: " + Metodos.converteHexadecimalParaOctal(hexadecimal) + 
                    "\n");
            }
            
        } while(opcao != 0);
         
    }
    
}
