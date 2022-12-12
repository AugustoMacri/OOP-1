public class Cubo extends FormaTridimensional{
    private double lado;

    public Cubo(double lado){
        this.lado = lado;
    }

    public double obterArea(){
        return 6*(lado*lado);
    }

    public void descricao(){
        System.out.println("Cubo é um sólido composto de seis faces quadradas de igual tamanho, formando um hexaedro.");
    }

    public double obterVolume(){
        return lado*lado*lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    
}
