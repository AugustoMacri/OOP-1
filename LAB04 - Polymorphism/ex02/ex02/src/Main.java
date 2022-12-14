public class Main {
    public static void main(String[] args) {

        //fazer um array da superclasse

        Forma[] formas = new Forma[6];

        formas[0] = new Circulo(4);
        formas[1] = new Quadrado(5);
        formas[2] = new Triangulo(2, 4);
        formas[3] = new Esfera(4);
        formas[4] = new Cubo(4);
        formas[5] = new Tetraedro(4, 2, 5);

        //percorrer o vetor 
        for(int i=0; i<6; i++){
            System.out.println("-----------------------------");
            System.out.println("Figura:");
            formas[i].descricao();
            
            if (formas[i] instanceof FormaBidimensional){
                formas[i].obterArea();
                System.out.println(formas[i]);
            }if(formas[i] instanceof FormaTridimensional){
                ((FormaTridimensional)formas[i]).obterVolume();
                formas[i].obterArea();
                System.out.println(formas[i]);
            }
            
        }

    }
}
