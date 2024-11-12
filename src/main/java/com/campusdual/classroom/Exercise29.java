package com.campusdual.classroom;

public class Exercise29 {
    public static void main(String[] args) {
    int dividendo= 3, divisor= 0;
    try {
        int resultado= dividendo/divisor;
        System.out.println(resultado);
    }catch (ArithmeticException e){
        System.out.println("No se puede dividir por 0");
    }finally{
        System.out.println("Programa terminado");
        }
    }



}
