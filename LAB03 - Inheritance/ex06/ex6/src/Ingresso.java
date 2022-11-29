public class Ingresso {
    protected double valor;


    public Ingresso(double valor){
        this.valor = valor;
    }

    //metodo
    public void escreveValor(){
        System.out.println(valor);
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
}