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
        switch (entrada.toString().trim().toUpperCase()) {
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
                switch (entrada.toUpperCase().trim()) {
                    case "ISOSCELES":
                        System.out.println("Ingresar longitud de lados iguales : ");
                        entrada1 = Double.parseDouble(sc.nextLine());
                        entrada2 = entrada1;
                        System.out.println("Ingresar longitud del terccer lado : ");
                        entrada3 = Double.parseDouble(sc.nextLine());
                        triangulo trian = new triangulo(entrada, entrada1, entrada2, entrada3);
                        System.out.println("El area del triangulo es :" + trian.area() + "\nEl perimetro del triangulo es :" + trian.perimetro());
                        break;
                    case "EQUILATERO":
                        System.out.println("Ingresar longitud de los lados : ");
                        entrada1 = Double.parseDouble(sc.nextLine());
                        entrada2 = entrada1;
                        entrada3 = entrada1;
                        triangulo tria = new triangulo(entrada, entrada1, entrada2, entrada3);
                        System.out.println("El area del triangulo es :" + tria.area() + "\nEl perimetro del triangulo es :" + tria.perimetro());
                        break;
                    case "ESCALENO":
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
                    default:
                        System.out.println("No se reconoce el tipo de triangulo ingresado");
                        break;
                }
                break;
            default:
                System.out.println("Ingreso una figura no valida");
                break;
        }
    }
}
