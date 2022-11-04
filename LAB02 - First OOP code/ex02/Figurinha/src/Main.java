public class Main {
    public static void main(String[] args){
        Figurinha jog1 = new Figurinha();
        Figurinha jog2 = new Figurinha();
        Figurinha jog3 = new Figurinha();

        jog1.setNome("Neymar");
        jog1.setData("5/02/1992");
        jog1.setAltura(1.75f);
        jog1.setPeso(68.0f);
        jog1.setPosicao("Ponta esquerda");
        jog1.setPais("Brasil");

        jog2.setNome("Suarez");
        jog2.setData("24/01/1987");
        jog2.setAltura(1.82f);
        jog2.setPeso(76.0f);
        jog2.setPosicao("Atacante");
        jog2.setPais("Uruguay");
        
        jog3.setNome("Messi");
        jog3.setData("24/01/1987");
        jog3.setAltura(1.69f);
        jog3.setPeso(68.0f);
        jog3.setPosicao("Atacante");
        jog3.setPais("Argentina");

        jog1.printFig();
        jog2.printFig();
        jog3.printFig();

    }           
}
