public class Operario extends Funcionario {
    private double valorPorProducao;
    private double quantidadeProduzida;

    public Operario(String nome, String dataNascimento, double salario, double valorPorProducao, double quantidadeProduzida){
        super(nome, dataNascimento, salario);
        this.valorPorProducao = valorPorProducao;
        this.quantidadeProduzida = quantidadeProduzida;
    }

    public double salarioOperario(){
        super.setSalario(super.getSalario() + valorPorProducao*quantidadeProduzida);
        return super.getSalario();
    }

    public double getValorPorProducao() {
        return valorPorProducao;
    }

    public void setValorPorProducao(double valorPorProducao) {
        this.valorPorProducao = valorPorProducao;
    }

    public double getQuantidadeProduzida() {
        return quantidadeProduzida;
    }

    public void setQuantidadeProduzida(double quantidadeProduzida) {
        this.quantidadeProduzida = quantidadeProduzida;
    }


    
    
}
