public class Empregado extends Pessoa{
    protected int codigoSetor;
    protected float salarioBase;
    protected float imposto;

    public int getCodigoSetor() {
        return this.codigoSetor;
    }
    public float getSalarioBase() {
        return this.salarioBase;
    }
    public float getImposto() {
        return this.imposto;
    }
    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }
    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }
    public void setImposto(float imposto) {
        this.imposto = imposto;
    }

    public double calcularSalario() {
        return this.salarioBase - this.imposto;
    }
}
