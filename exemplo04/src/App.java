import java.util.Scanner;

public class App {

    
    public static void main(String[] args){
        
       Scanner sc = new Scanner(System.in);

        String nome[] = new String[4]; // new String[4][100]
        float preco[] = new float[4];
        int qnt_estoque[] = new int[4];        

        for(int i = 0; i < 4; i++){
            System.out.println("Informe o nome, o preco e a qnt. em estoque do produto:");
            nome[i] = sc.nextLine();
            preco[i] = sc.nextFloat();
            qnt_estoque[i] = sc.nextInt();

            sc.nextLine();          //Limpar o buffer

        }

        System.out.println("Aumentando o preco em 10% do produto 1 e 3 \n");
       preco[0] = altera_preco(preco[0], -110);
       preco[2] = altera_preco(preco[2], 10);

        System.out.println("Reduzindo o preco em 5% do produto 2\n");
            if(altera_preco(preco[1], -5) == -1){
            System.out.println("Erro: preco nao alterado. Porcentagem invalida\n");
        }else{
            System.out.println("Preco alterado com sucesso\n");
        }

        System.out.println("Alterado o preco do prod. 3\n");

        if(altera_preco(preco[3], -110) == -1)
        System.out.println("Erro: preco nao alterado. Porecentagem invalida\n");

        System.out.println("Produtos Cadastrados");

        for(int i = 0; i < 4; i++){
            System.out.println("Produto: " + nome[i] + "\n Preco: "+ preco[i] + "\nEstoque: " + qnt_estoque[i]);
        }


        sc.close();
        
    }
    public static float altera_preco(float preco, float porcentagem){ 
        float temp;

        if(porcentagem > -100){
            temp = 1 + porcentagem/100;
            return (preco*temp);
        }else{
            return preco;
        }
        
    }
    
}
