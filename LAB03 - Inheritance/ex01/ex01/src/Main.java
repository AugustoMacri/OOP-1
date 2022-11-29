public class Main {
    public static void main(String[] args){
        String nome, data, posicao, pais, categoria, cor;
        float altura=0, peso=0;
        FigurinhaExtra especial;
        Figurinha normal;

        nome = "Richarlisson";
        data = "1/11/1111";
        altura = 1.65f;
        peso = 60.0f;
        posicao = "Atacante";
        pais = "brasil";
        categoria = "Legends";
        cor = "ouro";
        especial = new FigurinhaExtra(nome, data, altura, peso, posicao, pais, categoria, cor);
        especial.MostrarFigurinha();

        nome = "Neymar";
        data = "1/11/1111";
        altura = 1.70f;
        peso = 60.0f;
        posicao = "Atacante";
        pais = "Brasil";
        normal = new Figurinha(nome, data, altura, peso, posicao, pais);
        normal.MostrarFigurinha();

    }           
}