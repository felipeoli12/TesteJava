/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package testesjunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.testesjunit.*;

public class CalculadoraTest {

    @Test

    public void testSomar() {

        System.out.println("Testando o método Somar");

        int num1 = 10;

        int num2 = 5;

        int resultadoEsperado = 15;

        Calculadora calculadora = new Calculadora();

        assertEquals(resultadoEsperado, calculadora.somar(num1, num2));

    }

    @Test
    public void testSomarPositivos() {

        System.out.println("Soma de Positivos");

        int num1 = 10;

        int num2 = 5;

        int resultadoEsperado = 15;

        Calculadora caluladora = new Calculadora();

        assertEquals(resultadoEsperado, caluladora.somar(num1, num2));

    }

    @Test
    public void testSomarNegativos() {

        System.out.println("Soma de Negativos");

        int num1 = -10;

        int num2 = -5;

        int resultadoEsperado = -15;

        Calculadora caluladora = new Calculadora();

        assertEquals(resultadoEsperado, caluladora.somar(num1, num2));

    }

    @Test
    public void testSomarPositivoNegativo() {

        System.out.println("Soma de Positivo e Negativo");

        int num1 = -10;

        int num2 = +5;

        int resultadoEsperado = -5;

        Calculadora caluladora = new Calculadora();

        assertEquals(resultadoEsperado, caluladora.somar(num1, num2));

    }

    @Test

    public void testsubtrairNegativo() {

        System.out.println("Subtrair Positivo");

        int num1 = -10;

        int num2 = -5;

        int resultadoEsperado = -5;

        Calculadora calculadora = new Calculadora();

        assertEquals(resultadoEsperado, calculadora.subtrair(num1, num2));

    }

    @Test

    public void testsubtrairPositivo() {

        System.out.println("Subtrair Negativo");

        int num1 = 10;

        int num2 = 5;

        int resultadoEsperado = 5;

        Calculadora calculadora = new Calculadora();

        assertEquals(resultadoEsperado, calculadora.subtrair(num1, num2));

    }

    @Test

    public void testsubtrairPositivoNegativo() {

        System.out.println("Subtrair Positivo e Negativo");

        int num1 = 10;

        int num2 = -5;

        int resultadoEsperado = 15;

        Calculadora calculadora = new Calculadora();

        assertEquals(resultadoEsperado, calculadora.subtrair(num1, num2));

    }

    @Test

    public void testmultiplicar() {

        System.out.println("Multiplicar");

        int num1 = 10;

        int num2 = 5;

        int resultadoEsperado = 50;

        Calculadora calculadora = new Calculadora();

        assertEquals(resultadoEsperado, calculadora.multiplicar(num1, num2));

    }

    @Test

    public void testdivisao() {

        System.out.println("Divisão");

        int num1 = 10;

        int num2 = 5;

        int resultadoEsperado = 2;

        Calculadora calculadora = new Calculadora();

        assertEquals(resultadoEsperado, calculadora.dividir(num1, num2));

    }
}
