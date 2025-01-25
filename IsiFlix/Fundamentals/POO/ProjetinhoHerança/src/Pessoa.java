public class Pessoa {
    protected String nome;
    protected String email;
    protected String telefone;

    public String exibir() {
        return this.nome+ ", "+ this.email + ", "+ this.telefone;
    }

    public Pessoa(String telefone, String email, String nome) {
        this.telefone = telefone;
        this.email = email;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
