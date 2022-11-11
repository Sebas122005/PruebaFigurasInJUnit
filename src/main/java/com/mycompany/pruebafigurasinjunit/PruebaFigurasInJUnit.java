package com.mycompany.pruebafigurasinjunit;

import java.util.Scanner;
import com.mycompany.pruebafigurasinjunit.Rectangulo;
import java.util.ArrayList;
import java.util.List;

public class PruebaFigurasInJUnit {

    public static void main(String[] args) {
        double entrada1, entrada2, entrada3;
        System.out.println("Prueba Unitaria con JUnit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar figura (rectangulo,triangulo):");
        String entrada = sc.nextLine();
        switch (entrada.toString().trim()) {
            case "RECTANGULO":
                while (true) {
                    System.out.println("Ingresar ancho del rectangulo :");
                    entrada1 = Double.parseDouble(sc.nextLine());
                    if (entrada1 < 0) {
                        continue;
                    } else {
                        break;
                    }
                }

                while (true) {
                    System.out.println("Ingresar alto del rectangulo :");
                    entrada2 = Double.parseDouble(sc.nextLine());
                    if (entrada2 < 0) {
                        continue;
                    } else {
                        break;
                    }
                }

                Rectangulo rec = new Rectangulo(entrada1, entrada2);
                System.out.println("El area del rectangulo es : " + rec.area()
                        + " El perimetro del rectangulo es : " + rec.perimetro());
                break;

            case "TRIANGULO":

                System.out.println("Ingresar el tipo de triangulo :");
                entrada = sc.nextLine();
                if (entrada.toUpperCase() == "ISOSCELES") {
                    System.out.println("Ingresar lados iguales : ");
                    entrada1 = Double.parseDouble(sc.nextLine());
                    triangulo tri = new triangulo(entrada, entrada1, 0, 0);
                    System.out.println("El area del triangulo es :" + tri.area() +
                            "\nEl perimetro del triangulo es :" + tri.perimetro());
                    break;
                } else if (entrada.toUpperCase() == "EQUILATERO") {
                    System.out.println("Ingresar longitud de los lados : ");
                    entrada1 = Double.parseDouble(sc.nextLine());
                    triangulo tri = new triangulo(entrada, entrada1, 0, 0);
                    System.out.println("El area del triangulo es :" + tri.area() + "\nEl perimetro del triangulo es :" + tri.perimetro());
                    break;      
                } else if (entrada.toUpperCase() == "ESCALENO") {
                    //escaleno
                    System.out.println("Ingresar longitud base : ");
                    entrada1 = Double.parseDouble(sc.nextLine());
                    System.out.println("Ingresar longitud altura : ");
                    entrada2 = Double.parseDouble(sc.nextLine());
                    System.out.println("Ingresar longitud hipotenusa : ");
                    entrada3 = Double.parseDouble(sc.nextLine());
                    triangulo tri = new triangulo(entrada, entrada1, entrada2, entrada3);
                    System.out.println("El area del triangulo es :" + tri.area() + "\nEl perimetro del triangulo es :" + tri.perimetro());
                    break;
                } else {
                    System.out.println("No se reconoce el tipo de triangulo ingresado");
                    break;
                }
            default:
                System.out.println("Ingreso una figura no valida");
                break;

        }
    }
}
