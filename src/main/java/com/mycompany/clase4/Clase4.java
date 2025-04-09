/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.clase4;

import java.util.Scanner;

/**
 *
 * @author IDC
 */
public class Clase4 {

    public static void main(String[] args) {

        //LIBRERIA SCANNER
        /* Scanner entrada=new Scanner(System.in);
        System.out.println("¿Cual es el nombre?");
        String nombre=entrada.nextLine();
        System.out.println("Hola,"+nombre+".");
       
       int a;
       int b;
       Scanner e= new Scanner (System.in);
        System.out.println("Ingrese el primer numero");
        a= e.nextInt();
        System.out.println("Ingrese el segundo numero");
        b= e.nextInt();
        int suma=a+b;
        System.out.println("El resultado de la suma es: "+suma);*/
        Scanner e = new Scanner(System.in);    //Instanciar
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.multiplicar");
        System.out.println("Elije una opcion (1-2):");
        int opcion = e.nextInt();
        int a;
        int b;
        int suma;
        int resta;
        int multiplicacion;

        switch (opcion) {
            case 1:
                System.out.println("Ingrese el primer numero");
                a = e.nextInt();

                System.out.println("Ingrese el segundo numero");
                b = e.nextInt();
                suma = a + b;
                System.out.println("El resultado de la suma es: " + suma);
            case 2:
                System.out.println("Ingrese el primer numero");
                a = e.nextInt();

                System.out.println("Ingrese el segundo numero");
                b = e.nextInt();
                resta = a - b;
                System.out.println("El resultado de la resta es: " + resta);
            case 3:
                System.out.println("Ingrese el primer numero");
                a = e.nextInt();

                System.out.println("Ingrese el segundo numero");
                b = e.nextInt();
                multiplicacion = a * b;
                System.out.println("El resultado de la resta es: " + multiplicacion);
                break;
            default:
                System.out.println("Opcion correcta");
        }

    }
}
