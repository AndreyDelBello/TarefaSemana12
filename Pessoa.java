public class Pessoa {
    protected String nome;
    protected String end;
    protected String tel;

    public Pessoa() {
        throw new UnsupportedOperationException("É necessário fornecer pelo menos um nome e um endereco para criar uma pessoa");
    }
    public Pessoa(String nome) {
        throw new UnsupportedOperationException("Endereço ou nome nao declarados");
    }
    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.end = endereco;
        this.tel = null;
    }
    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.end = endereco;
        this.tel = telefone;
    }
    

    public String getNome() {
        return this.nome;
    }
    public String getEndereco() {
        return this.end;
    }
    public String getTelefone() {
        return this.tel;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEndereco(String endereco) {
        this.end = endereco;
    }
    public void setTelefone(String telefone) {
        this.tel = telefone;
    }
}