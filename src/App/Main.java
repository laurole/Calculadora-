/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import calculadora.Calculadora;

public class Main {
    public static void main(String... args) {
        Calculadora calc = new Calculadora(0, 4, 2);
        System.out.println(calc.suma(4, 2));
        System.out.println(calc.resta(4, 2));
        System.out.println(calc.multiplicacion(4, 2));
        try {
            System.out.println(getResultadoDivision(calc));
        } catch(ArithmeticException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }
    
    public static int getResultadoDivision(Calculadora calc) throws ArithmeticException {
        return calc.division(4, 2);
    }
}
