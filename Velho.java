public class Velho extends Imovel{
    private float desconto;

    public float getDesconto() {
        return this.desconto;
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
        this.preco = preco * this.desconto;
    }
    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }
}
