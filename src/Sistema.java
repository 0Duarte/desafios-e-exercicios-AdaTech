public class Sistema {
    public static void main(String[] args) {
        Administrador admin = new Administrador("Maria", "maria@email.com", "senha1234");

        System.out.println("Acesso direto ao nome: " + admin.nome); // acessível
        System.out.println("Acesso direto ao nom2222e: " +admin.email); // acessível
        // System.out.println(admin.senha); // nao acessível

        admin.exibirUsuario();
        System.out.println("Autenticação correta: " + admin.autenticar("senha1234"));
        System.out.println("Autenticação incorreta: " + admin.autenticar("errada"));

        admin.redefinirSenha("novaSenha2025");
        System.out.println("Autenticação nova senha: " + admin.autenticar("novaSenha2025"));

        System.out.println("Senha forte? '12345678': " + SegurancaUtils.validarSenhaForte("12345678"));
        System.out.println("Senha forte? 'senha1234': " + SegurancaUtils.validarSenhaForte("senha1234"));
        System.out.println("Senha forte? 'forte2025!': " + SegurancaUtils.validarSenhaForte("forte2025!"));
    }
}

