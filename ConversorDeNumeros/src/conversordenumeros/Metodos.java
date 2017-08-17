/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversordenumeros;

import java.awt.BorderLayout;
import java.util.Arrays;

/**
 *
 * @author andrey.schemel
 */
public class Metodos {

    public static String converterDecimalParaBinario(int decimal) {
        StringBuilder bin = new StringBuilder();

        while (decimal > 0) {
            int binario = decimal % 2;
            bin.append(binario);
            decimal = decimal / 2;
        }

        return bin.reverse().toString();
    }

    public static String converterDecimalParaOctal(int decimal) {
        StringBuilder bin = new StringBuilder();

        while (decimal > 0) {
            int binario = decimal % 8;
            bin.append(binario);
            decimal = decimal / 8;
        }

        return bin.reverse().toString();    
    }

    public static String converterDecimalParaHexadecimal(int numero) {
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        int resto = -1;
        StringBuilder sb = new StringBuilder();

        if (numero == 0) {
            System.out.println("0");
        }

        while (numero > 0) {
            resto = numero % 16;
            numero = numero / 16;
            sb.insert(0, hexa[resto]);
        }

        return sb.toString();
    }

    public static int converterBinarioParaDecimal(String numeroBinario) {
        int valor = 0;

        for (int i = numeroBinario.length(); i > 0; i--) {
            valor += Integer.parseInt(numeroBinario.charAt(i - 1) + "") * Math.pow(2, (numeroBinario.length() - i));
        }
        return valor;
    }

    public static String converterBinarioParaOctal(String numeroBinario) {
        StringBuilder sb = new StringBuilder();
        int posicaoInicial = 0;
        int posicaoFinal = 0;

        posicaoInicial = numeroBinario.length();
        posicaoFinal = posicaoInicial;

        while (posicaoInicial > 0) {

            posicaoInicial = ((posicaoInicial - 3) >= 0) ? posicaoInicial - 3 : 0;

            sb.insert(0, converterBinarioParaDecimal(numeroBinario.substring(posicaoInicial, posicaoFinal)));

            posicaoFinal = posicaoInicial;
        }

        return sb.toString();
    }

    public static String converterBinarioParaHexadecimal(String binario) {
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        StringBuilder sb = new StringBuilder();
        int posicaoInicial = 0;
        int posicaoFinal = 0;
        char caractereEncontrado = '-';

        posicaoInicial = binario.length();
        posicaoFinal = posicaoInicial;

        while (posicaoInicial > 0) {
            posicaoInicial = ((posicaoInicial - 4) >= 0) ? posicaoInicial - 4 : 0;
            caractereEncontrado = hexa[converterBinarioParaDecimal(binario.substring(posicaoInicial, posicaoFinal))];
            sb.insert(0, caractereEncontrado);
            posicaoFinal = posicaoInicial;
        }

        return sb.toString();
    }

    public static String converterOctalParaBinario(String valorOctal) {
        int posicao = 0;
        StringBuilder sb = new StringBuilder();
        String valorConvertidoParaBinario = null;

        while (posicao < valorOctal.length()) { 
            valorConvertidoParaBinario = converterDecimalParaBinario(Integer.parseInt(valorOctal.charAt(posicao) + ""));
           
            if (valorConvertidoParaBinario.length() != 3 && posicao > 0) {
                for (int i = 0; i < (3 - valorConvertidoParaBinario.length()); i++) {
                    sb.append("0");
                }
            }

            sb.append(valorConvertidoParaBinario);
            posicao++;
        }

        return sb.toString();
    }

    public static int converterOctalParaDecimal(String valorOctal) {
        int valor = 0;

       
        for (int i = valorOctal.length(); i > 0; i--) {
            valor += Integer.parseInt(valorOctal.charAt(i - 1) + "") * Math.pow(8, (valorOctal.length() - i));
        }

        return valor;
    }

    public static String converterOctalParaHexadecimal(String valorOctal) {
        int valorDecimal = converterOctalParaDecimal(valorOctal);

        return converterDecimalParaHexadecimal(valorDecimal);
    }

    public static String converterHexadecimalParaBinario(String valorHexa) {
        int posicao = 0;
        int posicaoArrayHexa = -1;
        StringBuilder sb = new StringBuilder();
        String valorConvertidoParaBinario = null;
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

      
        while (posicao < valorHexa.length()) {
            
            posicaoArrayHexa = Arrays.binarySearch(hexa, valorHexa.charAt(posicao));
           
            valorConvertidoParaBinario = converterDecimalParaBinario(posicaoArrayHexa);
           
            if (valorConvertidoParaBinario.length() != 4 && posicao > 0) {
                for (int i = 0; i < (4 - valorConvertidoParaBinario.length()); i++) {
                    sb.append("0");
                }
            }

            sb.append(valorConvertidoParaBinario);
            posicao++;
        }
        return sb.toString();
    }

    public static int converterHexadecimalParaDecimal(String valorHexa) {
        int valor = 0;
        int posicaoCaractere = -1;
        char[] hexa = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

            for (int i = valorHexa.length(); i > 0; i--) {
            posicaoCaractere = Arrays.binarySearch(hexa, valorHexa.charAt(i - 1));
            valor += posicaoCaractere * Math.pow(16, (valorHexa.length() - i));
        }

        return valor;
    }

    public static String converteHexadecimalParaOctal(String valorHexa) {
        int valorDecimal = converterHexadecimalParaDecimal(valorHexa);

        return converterDecimalParaOctal(valorDecimal);
    }

}
