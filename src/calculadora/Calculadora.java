/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

public class Calculadora {
    int resultado;
    int a;
    int b;

    public Calculadora(int resultado, int a, int b) {
        this.resultado = resultado;
        this.a = a;
        this.b = b;
    }

    public int getResultado() {
        return resultado;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
    
    public int suma(int a, int b){
        return a + b;
    }
    
    public int resta(int a, int b){
        return a - b;
    }
    
    public int multiplicacion(int a, int b){
        return a * b;
    }
    
    public int division(int a, int b){
        return a/b;
    }
}
