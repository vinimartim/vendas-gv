package Classes;

public class Dados {
    public boolean validarUsuario(String email, String senha) {
        if(email.equals("vini@vini.com") && senha.equals("123")) {
            return true;
        }
        return false;
    }
}
