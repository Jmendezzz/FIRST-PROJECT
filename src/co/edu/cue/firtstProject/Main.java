package co.edu.cue.firtstProject;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(3,5);
        calculadora.sumar();
        System.out.println("El resultado de la resta es: "+calculadora.restar(8,2));
    }
}