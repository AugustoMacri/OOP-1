public class CamaroteSuperior extends VIP{
    protected double valorAdicional2;

    public CamaroteSuperior(double valor, double valoradicional, double valorAdicional2){
        super(valor, valoradicional);
        this.valorAdicional2 = valorAdicional2;
    }

    //metodo para retornar o valor do ingresso
    public double valorDoIngresso(){
        super.setValor(super.getValor() + super.getValorAdicional() + valorAdicional2);
        return super.getValor();
    }

    
}
