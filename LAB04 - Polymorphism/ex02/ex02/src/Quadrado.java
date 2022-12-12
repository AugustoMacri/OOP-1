public class Quadrado extends FormaBidimensional {
    
    private double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }


    public double obterArea(){ //sobreposicao do metodo da superclasse
        return lado*lado;
    }

    public void descricao(){
        System.out.println("O quadrado é um polígono convexo que possui quatro lados. Em outras palavras, é uma figura geométrica plana que possui quatro lados congruentes e quatro ângulos retos.");

    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }
}
