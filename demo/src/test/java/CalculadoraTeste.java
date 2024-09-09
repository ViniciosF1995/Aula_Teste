import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.Calculadora;

public class CalculadoraTeste {
    @Test
    public void testeSoma(){

        Calculadora calc = new Calculadora();
        Integer result = calc.soma(2, 2);
        assertEquals(4, result);

    }
    @Test
    public void testeSub(){

        Calculadora calc = new Calculadora();
        Integer result = calc.somaSub(2, 2);
        assertEquals(0, result);

    }
    @Test
    public void testeDiv(){

        Calculadora calc = new Calculadora();
        Integer result = calc.somaDiv(2, 2);
        assertEquals(1, result);

    }
    @Test
    public void testeMult(){

        Calculadora calc = new Calculadora();
        Integer result = calc.somaMult(2, 2);
        assertEquals(4, result);

    }
}
