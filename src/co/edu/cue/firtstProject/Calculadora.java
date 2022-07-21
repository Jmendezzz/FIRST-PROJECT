package co.edu.cue.firtstProject;

public class Calculadora {
    private int operando1;
    private int operando2;

    public void sumar(){
        int result = operando1+operando2;
        System.out.println("La suma es: "+result);
    }
    public int restar(int operando1,int operando2){
        return  operando1-operando2;
    }
    public Calculadora(int operando1,int operando2){
        this.operando1=operando1;
        this.operando2=operando2;
    }
    public Calculadora(){

    }
}
