public class Horista extends Funcionario{
    private double valorPorHora;
    private double totalDeHorasTrabalhadas;

    public Horista(String nome, String dataNascimento, double salario, double valorPorHora, double totalDeHorasTrabalhadas){
        super(nome, dataNascimento, salario);
        this.valorPorHora = valorPorHora;
        this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;

    }

    public double salarioTotal(){
        super.setSalario(super.getSalario() + (valorPorHora*totalDeHorasTrabalhadas));
        return super.getSalario();
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    public double getTotalDeHorasTrabalhadas() {
        return totalDeHorasTrabalhadas;
    }

    public void setTotalDeHorasTrabalhadas(double totalDeHorasTrabalhadas) {
        this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
    }

    
    
}
