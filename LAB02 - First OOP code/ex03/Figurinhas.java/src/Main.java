public class Main {
    public static void main(String[] args){
        Figurinha[] figurinhas = new Figurinha[3];

            for(int i = 0; i < 3; i++){
            figurinhas[i] = new Figurinha();
            }
            figurinhas[0].setNome("Neymar");
            figurinhas[0].setData("5/02/1992");
            figurinhas[0].setAltura(1.75f);
            figurinhas[0].setPeso(68.0f);
            figurinhas[0].setPosicao("Ponta esquerda");
            figurinhas[0].setPais("Brasil");

            figurinhas[1].setNome("Suarez");
            figurinhas[1].setData("24/01/1987");
            figurinhas[1].setAltura(1.82f);
            figurinhas[1].setPeso(76.0f);
            figurinhas[1].setPosicao("Atacante");
            figurinhas[1].setPais("Uruguay");
            
            figurinhas[2].setNome("Messi");
            figurinhas[2].setData("24/01/1987");
            figurinhas[2].setAltura(1.69f);
            figurinhas[2].setPeso(68.0f);
            figurinhas[2].setPosicao("Atacante");
            figurinhas[2].setPais("Argentina");
        
        for(int j = 0; j < 3; j++){
            System.out.println(figurinhas[j]);
        }
    }           
}
