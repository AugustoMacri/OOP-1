public class Main {
    public static void main(String[] args){
        Figurinha jog1 = new Figurinha();
        Figurinha jog2 = new Figurinha();
        Figurinha jog3 = new Figurinha();

        jog1.nome = "Neymar";
        jog1.data = "5/02/1992";
        jog1.altura = 1.75f;
        jog1.peso = 68.0f;
        jog1.posicao = "Ponta esquerda";
        jog1.pais = "Brasil";

        jog2.nome = "Suarez";
        jog2.data = "24/01/1987";
        jog2.altura = 1.82f;
        jog2.peso = 76.0f;
        jog2.posicao = "Atacante";
        jog2.pais = "Uruguay";
        
        jog3.nome = "Messi";
        jog3.data = "24/01/1987";
        jog3.altura = 1.69f;
        jog3.peso = 68.0f;
        jog3.posicao = "Atacante";
        jog3.pais = "Argentina";

        System.out.println("Nome: " + jog1.nome);
        System.out.println("Data de nascimento: " + jog1.data);
        System.out.println("Altura: " + jog1.altura);
        System.out.println("Peso: " + jog1.peso);
        System.out.println("Posição: " + jog1.posicao);
        System.out.println("País: " + jog1.pais);

        System.out.println();

        System.out.println("Nome: " + jog2.nome);
        System.out.println("Data de nascimento: " + jog2.data);
        System.out.println("Altura: " + jog2.altura);
        System.out.println("Peso: " + jog2.peso);
        System.out.println("Posição: " + jog2.posicao);
        System.out.println("País: " + jog2.pais);

        System.out.println();

        System.out.println("Nome: " + jog3.nome);
        System.out.println("Data de nascimento: " + jog3.data);
        System.out.println("Altura: " + jog3.altura);
        System.out.println("Peso: " + jog3.peso);
        System.out.println("Posição: " + jog3.posicao);
        System.out.println("País: " + jog3.pais);
   }
}
