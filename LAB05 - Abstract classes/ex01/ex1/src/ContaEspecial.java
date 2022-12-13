public class ContaEspecial extends ContaCorrente{
    private float limite;

    public ContaEspecial(float saldo, int estado, int numConta, int senha, float limite){
        super(saldo, numConta, senha);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    
}
