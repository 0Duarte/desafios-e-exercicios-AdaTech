public class SegurancaUtils {
    public static boolean validarSenhaForte(String senha) {
        if (senha == null) return false;
        if (senha.length() <= 8) return false;
        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);
            if (c >= '0' && c <= '9') {
                return true;
            }
        }
        return false;
    }
}
