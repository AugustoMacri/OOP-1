public class FormaTridimensional extends Forma {
    private double volume;

    public double obterVolume(){
        return 0;
    }

    @Override
    public String toString() {
        return "AREA: " + obterArea() + "\n" + "Volume: " + obterVolume() + "\n";
    }

    public void setVolume(double volume){
        this.volume = volume;
    }
    
    public double getVolume(){
        return volume;
    }
}
