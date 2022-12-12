public class Triangulo extends FormaBidimensional {
    private double altura;
    private double base;

    public Triangulo(double altura, double base){
        this.altura = altura;
        this.base = base;
    }

    public double obterArea(){
        return (altura*base);
    }

    public void descricao(){
        System.out.println("O triângulo é um polígono que possui três lados. Ele é o polígono mais simples, pois possui o menor número de lados. Os principais elementos dessa figura geométrica são os seus três lados e os três ângulos.");
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
