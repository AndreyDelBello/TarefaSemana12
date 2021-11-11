public class Novo extends Imovel{
    private float valorAdicional;

    public float getValorAdicional() {
        return this.valorAdicional;
    }
    public String getEndereco() {
        return this.endereco;
    }
    public double getPreco() {
        return this.preco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setPreco(Double preco) {
        this.preco = preco * this.valorAdicional;
    }
    public void setValorAdicional(float valorAdicional) {
        this.valorAdicional = valorAdicional;
    }
}
