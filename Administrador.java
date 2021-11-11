public class Administrador extends Empregado{
    private float ajudaDeCusto;

    public float getAjudaDeCusto() {
        return this.ajudaDeCusto;
    }
    public void setAjudaDeCusto(float ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double calcularSalario() {
        return this.salarioBase - this.imposto + this.ajudaDeCusto;
    }
}
