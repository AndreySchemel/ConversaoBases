

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import conversordenumeros.Metodos;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andrey.schemel
 */
public class TesteMetodos {

    @Test
    public void testeDecimalParaBinario() {
        final int DECIMAL = 25;
        final String BINARIO = "11001";
        final String CONVERTIDO = Metodos.converterDecimalParaBinario(DECIMAL);
        assertTrue(CONVERTIDO.equals(BINARIO));
    }
    
    @Test
    public void testeDecimalParaOctal() {
        final int DECIMAL = 25;
        final String OCTAL = "31";
        final String CONVERTIDO = Metodos.converterDecimalParaOctal(DECIMAL);
        assertTrue(CONVERTIDO.equals(OCTAL));
    }
    
    @Test
    public void testeDecimalParaHexadecimal() {
        final int DECIMAL = 25;
        final String HEXADECIMAL = "19";
        final String CONVERTIDO = Metodos.converterDecimalParaHexadecimal(DECIMAL);
        assertTrue(CONVERTIDO.equals(HEXADECIMAL));
    }

    
    @Test
    public void testeOctalParaDecimal() {
        final int CONVERTIDO = Metodos.converterOctalParaDecimal("25");
        assertTrue(CONVERTIDO == 21);
    }
    
    @Test
    public void testeHexadecimalParaDecimal() {
        final int CONVERTIDO = Metodos.converterHexadecimalParaDecimal("25");
        assertTrue(CONVERTIDO == 37);
    }
    
    
}