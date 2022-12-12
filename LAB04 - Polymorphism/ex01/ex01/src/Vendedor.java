public class Vendedor extends Funcionario {
    private double comissao;
    private double vendas;

    public Vendedor(String nome, String dataNascimento, double salario, double comissao, double vendas){
        super(nome, dataNascimento, salario);
        this.comissao = comissao;
        this.vendas = vendas;
    }

    //criar um metodo para somar o valor fizo + comissao*vendas
    public double salarioTotal(){
        super.setSalario(super.getSalario()+(comissao*vendas));
        return super.getSalario();
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    
    
}
