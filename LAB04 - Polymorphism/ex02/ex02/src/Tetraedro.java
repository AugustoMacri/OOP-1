import java.lang.Math;

public class Tetraedro extends FormaTridimensional{
    private double lado;
    private double altura;
    private double base;

    public Tetraedro(double lado, double altura, double base){
        this.lado = lado;
        this.altura = altura;
        this.base = base;
    }

    public double obterArea(){
        return (lado*lado*lado) * Math.sqrt(3);
    }

    public double obterVolume(){
        return (base*altura)*altura/3;
    }

    public void descricao(){
        System.out.println("Tetraedro são poliedros compostos por quatro faces triangulares, três delas encontrando-se em cada vértice.");
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    
    
}
