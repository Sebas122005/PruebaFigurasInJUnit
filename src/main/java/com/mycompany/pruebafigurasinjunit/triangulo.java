package com.mycompany.pruebafigurasinjunit;

public class triangulo {

    String tipo;
    double base,altura,l3;

    public triangulo() {
    }

    public triangulo(String tipo, double base, double altura, double l3) {
        this.tipo = tipo;
        this.base = base;
        this.altura = altura;
        this.l3 = l3;
    }
    
    
    
    
    double area (){
        return (base * altura)/2;
    }
    
    double perimetro(){
        if(tipo=="ISOSCELES"){
            return (base *2)+ l3;
        }
        else if(tipo=="EQUILATERO"){
           return base*3;
        }
        else{
            return base + altura+ l3;
        }  
    }
}
