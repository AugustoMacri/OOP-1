import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String nome, data, posicao, pais, categoria, cor, resp;
        float altura, peso;
        FigurinhasExtra especial;
        Figurinhas normal;
        Scanner sc = new Scanner(System.in);

        System.out.println("Trata-se de uma figurinha diferenciada? (y/n)");
        resp = sc.nextLine();
        System.out.println("Digite o nome da figurinha");
        nome = sc.nextLine();
        System.out.println("Data:");
        data = sc.nextLine();
        System.out.println("Altura");
        altura = sc.nextFloat();
        System.out.println("Peso");
        peso = sc.nextFloat();
        System.out.println("Posicao");
        posicao = sc.nextLine();
        System.out.println("pais");
        pais = sc.nextLine();

        if(resp == "y"){
            System.out.println("Qual a categoria da figurinha?");
            categoria = sc.nextLine();
            System.out.println("Qual a cor da figurinha?");
            cor = sc.nextLine();
            especial = new FigurinhasExtra(nome, data, altura, peso, posicao, pais, categoria, cor);
            especial.MostrarFigurinha();
        }else{
            normal = new Figurinhas(nome, data, altura, peso, posicao, pais);
            normal.MostrarFigurinha();
        }

    }           
}