package com.mycompany.pruebafigurasinjunit;

public class triangulo {

    String tipo;
    double base,altura,l3;

    public triangulo() {
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
