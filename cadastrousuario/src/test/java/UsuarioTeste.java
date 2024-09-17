import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.example.ResultadoValidacao;
import com.example.Usuario;

public class UsuarioTeste {
    @Test
    public void DeveCadastrarComSucesso() {
        // Given
        Usuario usuarioValido = new Usuario("joao", "joao@gmail.com", "123456789", "123456789", "000.000.000-90", "88034-375");
        // When
        ResultadoValidacao resultado = usuarioValido.salvarUsuario();
        // Then
        assertEquals(resultado.getMensagemErro(), "Usuário salvo com sucesso!");
        assertTrue(resultado.isSucesso());

    }

    @Test
    public void DeveRetornarErroQuandoConfirmacaoDeSenhaNaoConfere() {
        // Given
        Usuario usuarioSenhaInvalida = new Usuario("joao", "joao@gmail.com", "123456789", "987654321", "000.000.000-90", "88034-375");
        // When
        ResultadoValidacao resultado = usuarioSenhaInvalida.salvarUsuario();
        // Then
        assertEquals(resultado.getMensagemErro(), "Erro ao salvar o usuário: A senha e a confirmação de senha não correspondem.");
        assertFalse(resultado.isSucesso());

    }

    @Test
    public void DeveRetornarErroQuandoNomeVazio() {
        // Given
        Usuario usuarioSemNome = new Usuario("", "joao@gmail.com", "123456789", "123456789", "000.000.000-90", "88034-375");
        // When
        ResultadoValidacao resultado = usuarioSemNome.salvarUsuario();
        // Then
        assertEquals(resultado.getMensagemErro(), "Erro ao salvar o usuário: O nome é obrigatório.");
        assertFalse(resultado.isSucesso());

    }

}
