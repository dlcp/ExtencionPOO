package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

@Timeout(5)
public class CalculadoraTest {

    private static Calculadora calculadora;
        private static int num1;
        private static int num2;
    
    @BeforeAll
    static void initAll() {
        num1 = 10;
        num2 = 5;
        System.out.println(String.format("Iniciando numeros a operar %d y %d",num1, num2));
    }

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora(); // Preparar
        System.out.println("Calculadora preparada para las pruebas.");
    }

    @Test
    void testSuma() {
        int result = calculadora.suma(num1, num2); // Ejecutar
        assertEquals(15, result); // Verificar
        assertTrue(result == 15);
        assertFalse(result != 15);
        assertNotNull(result);
        System.out.println("Resultado de suma: " + result);
    }

    @Test
    void testResta() {
        int result = calculadora.resta(num1, num2); // Ejecutar
        assertEquals(5, result); // Verificar
        assertTrue(result == 5);
        assertFalse(result != 5);
        assertNotNull(result);
        System.out.println("Resultado de resta: " + result);
    }

    @Test
    void testMultiplicacion() {
        int result = calculadora.multiplicacion(num1, num2); // Ejecutar
        assertNotNull(result);
        assertEquals(50, result); // Verificar
        assertTrue(result == 50);
        assertFalse(result != 50);
        System.out.println("Resultado de multiplicacion: " + result);
    }

    @Test
    void testDivision() {
        int result = calculadora.division(num1, num2); // Ejecutar
        assertEquals(2, result); // Verificar
        assertTrue(result == 2);
        assertFalse(result != 2);
        assertNotNull(result);
        System.out.println("Resultado de division: " + result);
    }

    @Test
    void testDivisionPorCero() {
        System.out.println("Probando división por cero, se espera una excepción.");
        // Verificar que lanza una excepción de tipo ArithmeticException al dividir por cero
        assertThrows(ArithmeticException.class, () -> calculadora.division(num1, 0));
    }

    @AfterEach
    void tearDown() {
        calculadora = null; // Limpiar
        assertNull(calculadora);
        System.out.println("Calculadora limpiada después de la prueba.");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Finalizando todas las pruebas de Calculadora...");
    }
}
