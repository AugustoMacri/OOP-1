public class ContaEspecial extends ContaCorrente{
    private float limite;

    //Uma conta especial com limite igual a ZERO deve ser modificada para uma ContaComum

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
