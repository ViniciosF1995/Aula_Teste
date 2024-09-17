import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.GeometriaService;

public class GeometriaServiceTeste {
    GeometriaService geometriaService = new GeometriaService();
   
    @Test
   public void ValorTriangulo(){

double resultado = geometriaService.CalcularAreaTriangulo(2, 2);

assertEquals(2, resultado);

   }
@Test
   public void deveCalcularAreaQuadrado(){

    double resultado = geometriaService.calcularQuadrado(20);
    assertEquals(4, resultado);

   }
@Test
 public void DeveCalcularVolumeEsfera(){

    double resultado = geometriaService.CalcularVolumeEsfera(2.0);

    assertEquals(33.5, resultado, 0.1);
 }
@Test
public void DeveCalcularAreaRetangulo(){

double resultado = geometriaService.CalcularAreaRetangulo(2, 3);
assertEquals(6, resultado);

}
@Test
public void DeveCalcularCircuferencia(){

    double resultado = geometriaService.CalcularCircuferencia(2);
    assertEquals(12.5, resultado, 0.1);

}
@Test
public void DeveCalcularCilindro(){

    double resultado = geometriaService.CalcularareaCilindro(2, 2);
    assertEquals(25.1, resultado, 0.1);

}
@Test
public void DeveCalcularCubo(){

    double resultado = geometriaService.CalcularCubo(2);
    assertEquals(8, resultado);

}


}
