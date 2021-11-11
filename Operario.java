public class Operario extends Empregado{
    private float valorProducao;
    private float comicao;

    public float getValorProducao() {
        return this.valorProducao;
    }
    public float getComicao() {
        return this.comicao;
    }
    public void setValorProducao(float valorProducao) {
        this.valorProducao = valorProducao;
    }
    public void setComicao(float comicao) {
        this.comicao = comicao;
    }

    public double calcularSalario() {
        return this.salarioBase - this.imposto + (this.valorProducao * this.comicao);
    }
}
