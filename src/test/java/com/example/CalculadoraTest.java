package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeAll
    static void initAll() {
        System.out.println("Iniciando todas las pruebas de Calculadora...");
    }

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora(); // Preparar
        System.out.println("Calculadora preparada para las pruebas.");
    }

    @Test
    void testSuma() {
        int result = calculadora.suma(2, 3); // Ejecutar
        System.out.println("Resultado de suma(2, 3): " + result);
        assertEquals(5, result); // Verificar
    }

    @Test
    void testResta() {
        int result = calculadora.resta(5, 3); // Ejecutar
        System.out.println("Resultado de resta(5, 3): " + result);
        assertEquals(2, result); // Verificar
    }

    @Test
    void testMultiplicacion() {
        int result = calculadora.multiplicacion(4, 3); // Ejecutar
        System.out.println("Resultado de multiplicacion(4, 3): " + result);
        assertEquals(12, result); // Verificar
    }

    @Test
    void testDivision() {
        int result = calculadora.division(10, 2); // Ejecutar
        System.out.println("Resultado de division(10, 2): " + result);
        assertEquals(5, result); // Verificar
    }

    @Test
    void testDivisionPorCero() {
        System.out.println("Probando división por cero, se espera una excepción.");
        // Verificar que lanza una excepción de tipo ArithmeticException al dividir por cero
        assertThrows(ArithmeticException.class, () -> calculadora.division(10, 0));
    }

    @AfterEach
    void tearDown() {
        calculadora = null; // Limpiar
        System.out.println("Calculadora limpiada después de la prueba.");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Finalizando todas las pruebas de Calculadora...");
    }
}
