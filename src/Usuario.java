public abstract class Usuario {
    private String senha;
    protected String email;
    public String nome;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public abstract boolean autenticar(String senha);

    public final void exibirUsuario() {
        System.out.println("Nome: " + nome + " | Email: " + email);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
