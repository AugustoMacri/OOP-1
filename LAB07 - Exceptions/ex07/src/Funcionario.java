public class Funcionario {
    private String nome;
    private double cpf;
    private double salario;
    private double tetoSalarial;

    public Funcionario(String nome, double cpf, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.tetoSalarial = 40000;
    }

    //metodo para aumentar o salario
    public void aumentarSalario(double porcentagem) throws ValorNegativoException, PassouTetoException{
        porcentagem /= 100;
        if(salario + salario*porcentagem < 0){
            throw new ValorNegativoException("Valor invalido de salario");
        }else if(salario + salario*porcentagem > tetoSalarial){
            throw new PassouTetoException("Valor ultrapassa teto");
        }else{
            salario += salario*porcentagem;
            System.out.println("Valor valido");
        }

    }

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getCpf() {
        return cpf;
    }


    public void setCpf(int cpf) {
        this.cpf = cpf;
    }


    public double getSalario() {
        return salario;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }


    public double getTetoSalarial() {
        return tetoSalarial;
    }


    public void setTetoSalarial(double tetoSalarial) {
        this.tetoSalarial = tetoSalarial;
    }

    
    

}
