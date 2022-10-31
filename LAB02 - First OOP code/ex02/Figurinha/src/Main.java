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

        System.out.println("Nome: " + jog1.getNome());
        System.out.println("Data de nascimento: " + jog1.getData());
        System.out.println("Altura: " + jog1.getAltura());
        System.out.println("Peso: " + jog1.getPeso());
        System.out.println("Posição: " + jog1.getPosicao());
        System.out.println("País: " + jog1.getPais());

        System.out.println();

        System.out.println("Nome: " + jog2.getNome());
        System.out.println("Data de nascimento: " + jog2.getData());
        System.out.println("Altura: " + jog2.getAltura());
        System.out.println("Peso: " + jog2.getPeso());
        System.out.println("Posição: " + jog2.getPosicao());
        System.out.println("País: " + jog2.getPais());

        System.out.println();

        System.out.println("Nome: " + jog3.getNome());
        System.out.println("Data de nascimento: " + jog3.getData());
        System.out.println("Altura: " + jog3.getAltura());
        System.out.println("Peso: " + jog3.getPeso());
        System.out.println("Posição: " + jog3.getPosicao());
        System.out.println("País: " + jog3.getPais());


    }           
}
