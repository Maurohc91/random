package org.example;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Aleatorio {

    public void ejemplos(){
        Random aleatorio = new Random();

        int numero = aleatorio.nextInt();
        System.out.println(numero);

        numero = aleatorio.nextInt(899) +100;
        System.out.println(numero);

        double decimal = aleatorio.nextDouble()*3 + 1;
        System.out.println(decimal);

        double numero_math = Math.random() *3 + 1;   //mejor las otras opciones, es como nextDouble
        System.out.println(numero_math);{
        }

    }

    public void ejercicio1() {


        Random aleatorio = new Random();

        int dado1 = aleatorio.nextInt(6) +1;
        System.out.println("este es el dado 1: " + dado1);


        int dado2 = aleatorio.nextInt(6) +1;
        System.out.println("este es el dado 2: " + dado2);

        System.out.println("El resultaado es: " + (dado2+dado1));
    }

    public void ejercicio2() {
        Random aleatorio = new Random();


        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int longitud = 10;

        String contrasenya = "";

        int posicion;

        for (int i=0; i <longitud; i++){

            posicion = aleatorio.nextInt(caracteres.length());
            contrasenya += caracteres.charAt(posicion);  //el += puede unir letras y numeros

        }

        System.out.println("La contraseña generada es: " + contrasenya);


    }

    public void ejercicio3(){

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();

        int numeromaximo;
        int numerominimo;
        int numerosaleatorios;
        int numeroaleatorio;

        try {
            System.out.println("Introduce el rango máximo.");
            numeromaximo = entrada.nextInt();


            System.out.println("Introduce el rango mínimo.");
            numerominimo = entrada.nextInt();


            while (numeromaximo <= numerominimo) {

                System.out.println("Introduce bien los números.");
                break;
            }

            System.out.println("Cuántos números quieres?");
            numerosaleatorios = entrada.nextInt();

            for (int i = 0; i < numerosaleatorios; i++) {
                numeroaleatorio = aleatorio.nextInt(numeromaximo - numerominimo + 1) + numerominimo;
                System.out.println("Los numeros aleatorios son: " + numeroaleatorio);
            }
        }catch (InputMismatchException err){
            System.out.println("Por favor, introduce solo números");
        }


        }

    public void ejercicio4(){
        Random aleatorio = new Random();


        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        int longitud = aleatorio.nextInt(3)+ 6;


        String contrasenya = "";



        for (int i=0; i <longitud; i++){

            int posicion = aleatorio.nextInt(caracteres.length());
            contrasenya += caracteres.charAt(posicion);  //el += puede unir letras y numeros

        }

        System.out.println("La contraseña generada es: " + contrasenya);


    }

}
