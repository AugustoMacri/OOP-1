public class ContaEspecial extends ContaCorrente{
    private float limite;

    public ContaEspecial(Float saldo, int estado, int numConta, int senha, float limite){
        super(limite, numConta, senha);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    public ContaComum modificarConta(){
        
        ContaComum conta = new ContaComum();
        return conta;
    }

    
}
