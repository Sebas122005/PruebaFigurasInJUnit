package com.mycompany.pruebafigurasinjunit;


public class Rectangulo {
    
    double alto,ancho;

    public Rectangulo() {
    }

    public Rectangulo(double alto, double ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }
    
    double area(){
        return ancho*alto;
    }
    
    double perimetro(){
        return (ancho*2)+(alto*2);
    }
    
}
