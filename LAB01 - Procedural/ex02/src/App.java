import java.util.Scanner;

public class App{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Produtos[] produtos = new Produtos[4];
        float[] vet = new float[4];

        

        for(int i=0; i<4; i++){
            produtos[i] = new Produtos();
            
            System.out.println("Informe o nome, o preco e a qnt. em estoque do produto:");
            produtos[i].setNome(sc.nextLine());
            produtos[i].setPreco(sc.nextFloat());
            produtos[i].setQuant(sc.nextInt());
            sc.nextLine();          //Limpar o buffer
            
        }
        
        //acessar o preco do primeiro item colocado produtos[0].getPreco()
        System.out.println("");
        System.out.println("Aumentando o preco em 10% do produto 1 e 3 ");
        //As variaveis x e y irao salvar o o valor que sera aumentado
        vet[0] = produtos[0].altera_preco(produtos[0].getPreco(), -110);
        vet[2] = produtos[2].altera_preco(produtos[2].getPreco(), 10);

        System.out.printf("%f", vet[0]);

        System.out.println("Reduzindo o preco em 5% do produto 2\n");
            if(produtos[1].altera_preco(produtos[1].getPreco(), -5) == -1){
            System.out.println("Erro: preco nao alterado. Porcentagem invalida\n");
        }else{
            System.out.println("Preco alterado com sucesso\n");
            vet[1] = produtos[1].altera_preco(produtos[1].getPreco(), -5);
        }

        System.out.println("Alterado o preco do prod. 3");

        if(produtos[3].altera_preco(produtos[3].getPreco(), -110) == -1){
        System.out.println("Erro: preco nao alterado. Porecentagem invalida");
        }else { 
        System.out.printf("\n\n Preco alterado com sucesso");
        vet[3] = (produtos[3].altera_preco(produtos[3].getPreco(), -110));
        }



        System.out.println("Produtos Cadastrados");

        for(int i = 0; i < 4; i++){
            System.out.println("Produto: " + produtos[i].getNome() + "\n Preco: "+ vet[i] + "\nEstoque: " + produtos[i].getQuant());
        }

    }
}



