public class Esfera extends FormaTridimensional{
    private double raio;

    public Esfera(double raio){
        this.raio = raio;
    }

    public double obterArea(){
        return 4 * 3.1415 * (raio*raio);
    }

    public void descricao(){
        System.out.println("Esfera é um corpo sólido completamente redondo em toda a sua extensão; bola, globo.");
    }

    public double obterVolume(){
        return (4/3) * 3.14 * (raio*raio*raio); 
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    
}
