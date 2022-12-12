public class Circulo extends FormaBidimensional{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }


    public double obterArea(){ //sobreposicao do metodo da superclasse
        return 3.14*(raio*raio);
    }

    public void descricao(){
        System.out.println("Superfície plana limitada por uma circunferência.");
    }


    public double getRaio() {
        return raio;
    }


    public void setRaio(double raio) {
        this.raio = raio;
    }

    

    
}
