package com.example;


public class GeometriaService {
    
public float CalcularAreaTriangulo(float base, float altura){

return (base * altura) / 2;

}

public double calcularQuadrado (double lado){

    return lado * lado;

}

public double CalcularVolumeEsfera(double raio){

    return (4 * Math.PI * Math.pow(raio, 3)) / 3;

    
   }

   public double CalcularAreaRetangulo (double base, double altura){

    return base * altura;
   }

   public double CalcularCircuferencia(double raio){

    return Math.PI * 2 * raio;
   }

   public double CalcularareaCilindro(double raio, double altura){

    return Math.PI * Math.pow(raio, 2) * altura;

   }

   public double CalcularCubo(double lado){

   return Math.pow(lado, 3);

   }
   

}
