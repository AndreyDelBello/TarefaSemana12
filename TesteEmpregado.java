public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado e = new Empregado();

        e.setCodigoSetor(123);
        e.setSalarioBase(1100.00F);
        e.setImposto(100.00F);
        e.setNome("Junin");
        e.setEndereco("Pau d'alho, Rua dos bobos, 0");
        e.setTelefone("707070 se voce nao conseguir, 70 de novo");
        
        e.getCodigoSetor();
        e.getSalarioBase();
        e.getImposto();
        e.getNome();
        e.getEndereco();
        e.getTelefone();

        e.calcularSalario();
    }
}
