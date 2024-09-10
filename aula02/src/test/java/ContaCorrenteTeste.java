import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.ContaCorrente;


public class ContaCorrenteTeste {
    @Test  
    public void testarConta(){

      ContaCorrente contMaria = new ContaCorrente("Maria", 200);
           
      ContaCorrente contJose = new ContaCorrente("José", 100);

      assertNotNull(contJose);
      assertNotNull(contMaria);

        assertNotEquals(contMaria.getBalanco(), contJose.getBalanco());

        contMaria.saque(100);
        assertEquals(contMaria.getBalanco(), contJose.getBalanco());

        contJose.deposito(50);
        assertEquals(contJose.getBalanco(), contMaria.getBalanco() + 50);

        
    }

    @Test
    public void testarSaldoDisp(){

        
        ContaCorrente contMaria = new ContaCorrente("Maria", 200);

        boolean resultado = contMaria.saque(100);

        assertTrue(resultado);

    }
    @Test
    public void testarSaldoIndisp(){

        ContaCorrente contMaria = new ContaCorrente("Maria", 100);

        boolean resultadoIndisp = contMaria.saque(150);

        assertFalse(resultadoIndisp);

    }




}
