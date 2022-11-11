/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.pruebafigurasinjunit;

import java.util.Scanner;
import com.mycompany.pruebafigurasinjunit.Rectangulo;
import java.util.ArrayList;
import java.util.List;

public class PruebaFigurasInJUnit {

    public static void main(String[] args) {
        double entrada1, entrada2,entrada3;
        System.out.println("Prueba Unitaria con JUnit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar figura (rectangulo,triangulo):");
        String entrada = sc.nextLine();

        if (entrada.toString().trim() == "RECTANGULO") {
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

        } else if (entrada.toString().trim() == "TRIANGULO") {

            System.out.println("Ingresar el tipo de triangulo :");
            entrada = sc.nextLine();
            List<String> tiposTri = new ArrayList<String>();
            tiposTri.add("ISOSCELES");
            tiposTri.add("EQUILATERO");
            tiposTri.add("ESCALENO");
            if (tiposTri.contains(entrada)) {
                if (entrada == "ISOSCELES") {
                    System.out.println("Ingresar lados iguales : ");
                    entrada1 =Double.parseDouble(sc.nextLine());
                } else if (entrada == "EQUILATERO") {
                    System.out.println("Ingresar longitud de los lados : ");
                    entrada2 =Double.parseDouble(sc.nextLine());
                } else {
                    System.out.println("Ingresar longitud base : ");
                    entrada2 =Double.parseDouble(sc.nextLine());
                }
                System.out.println("Ingresar la base del triangulo : ");
            }
        }
        else{
            System.out.println("Ingreso una figura no valida");
        }

    }
}
