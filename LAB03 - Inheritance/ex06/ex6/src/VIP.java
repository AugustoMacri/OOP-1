public class VIP extends Ingresso {
    protected double valorAdicional;

    public VIP(double valor, double valorAdicional){
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    //metodo para devolver o valor do ingresso VIP com o adicional
    public double valorVIP(){
        super.setValor(super.getValor()+valorAdicional);
        return getValor();
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    
}
