import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.Login;

public class LoginTeste {
@Test    
public void testLogin(){

    Login loginJoao = new Login();

    boolean resultado = loginJoao.logar("teste@gmail.com", "senha123");

    assertTrue(resultado);

}
@Test
public void testSenha(){

    Login loginJoao = new Login();

    boolean resultado = loginJoao.logar("teste@gmail.com", "senha12345");

    assertFalse(resultado);

}
@Test
public void testEmail(){

    Login loginJoao = new Login();

    boolean resultado = loginJoao.logar("testeDois@gmail.com", "senha123");

    assertFalse(resultado);

}

}
