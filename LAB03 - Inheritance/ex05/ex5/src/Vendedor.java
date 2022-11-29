public class Vendedor extends Funcionario {
    private double valorFixo;
    private double comissao;
    private double vendas;

    public Vendedor(String nome, String dataNascimento, double salario, double valorFixo, double comissao, double vendas){
        super(nome, dataNascimento, salario);
        this.valorFixo = valorFixo;
        this.comissao = comissao;
        this.vendas = vendas;
    }

    //criar um metodo para somar o valor fizo + comissao*vendas
    public double salarioVendedor(){
        super.setSalario(super.getSalario()+ (valorFixo+(comissao*vendas)));
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
