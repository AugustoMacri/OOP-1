import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;;


public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);

    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor na ordem inversa >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d: \n", i+1);
            vet[i] = sc.nextInt();
        }
        
        System.out.println("A ordem inversa dos números é:");
        for (int i = 5; i >= 0; i--){
            System.out.printf("%d ", vet[i]);
        }

    }

    public static void ex04(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor de números pares >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d: \n", i+1);
            vet[i] = sc.nextInt();
            if(vet[i] %2 == 1){
                System.out.printf("Erro: Valor inválido \n");
                i--;
            }
        }
        System.out.printf("Os números pares digitados foram:");
            for (int i = 0; i < 6; i++){
                System.out.printf("%d ", vet[i]);
            }
    }

    public static void ex05(){
        Scanner sc = new Scanner(System.in);
        float[] vet = new float[5];
        float maior, menor, media;
        
        System.out.println("<< 5 valores >>");

        for(int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d: \n", i+1);
            vet[i] = sc.nextFloat();
        }
        System.out.printf("Os números digitados foram:");
        for (int i = 0; i < 5; i++){
            System.out.printf("%.0f ", vet[i]);
        }

        maior = vet[0];
        for(int i = 0; i < 5; i++){
            if(vet[i] > maior){maior = vet[i];}
        }

        menor = vet[0];
        for(int i = 0; i < 5; i++){
            if(vet[i] < menor){
                menor = vet[i];
            }
        }

        media = 0;
        for(int i =0; i < 5; i++){
            media += vet[i];
        }

        System.out.printf("\nO maior valor é: %.0f \n", maior);
        System.out.printf("O menor valor é: %.0f \n", menor);
        System.out.printf("A média é: %.1f \n", media/5);

    }

    public static void ex06(){
        Scanner sc = new Scanner(System.in);
        float[] vet = new float[5];
        float maior, menor, media;
        int posicao = 0, posicao2 = 0;
        
        System.out.println("<< 5 valores >>");

        for(int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d: \n", i+1);
            vet[i] = sc.nextFloat();
        }
        System.out.printf("Os números digitados foram:");
        for (int i = 0; i < 5; i++){
            System.out.printf("%.0f ", vet[i]);
        }

        maior = vet[0];
        for(int i = 0; i < 5; i++){
            if(vet[i] > maior){
                maior = vet[i];
                posicao = i;
            }

        }

        menor = vet[0];
        for(int i = 0; i < 5; i++){
            if(vet[i] < menor){
                menor = vet[i];
                posicao2 = i;
            }
        }

        media = 0;
        for(int i = 0; i < 5; i++){
            media += vet[i];
        }

        System.out.printf("\nO maior valor é: %.0f, localizado na posição %d do vetor \n", maior, posicao);
        System.out.printf("O menor valor é: %.0f, localizado na posição %d do vetor \n", menor, posicao2);
        System.out.printf("A média é: %.1f \n", media/5);

    }

    public static void ex07() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int maior;
        float indice;

        System.out.println("<<Normalizando as notas>>");
        for(int i = 0; i < 5; i++){
            System.out.printf("Entre com a nota do aluno %d: \n", i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Notas normalizadas"); // a nota do maior aluno deve ser convertida para 100
        
        maior = vet[0];
        for(int i = 0; i < 5; i++){
            if(vet[i] > maior){
                maior = vet[i];
            }
        }

        indice = 100/maior;

        for (int i = 0; i < 5; i++){
            System.out.printf("A nota do aluno %d é %.0f \n", i+1, vet[i]*indice);
        }
            
    }

    public static void ex08(){ //calcular o desvio padrão 
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        float media; 
        double somatorio=0, desvio;

        System.out.println("<< Média e desvio-padrão >>");
        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o valor %d: \n", i+1);
            vet[i] = sc.nextInt();
        }

        media = 0;
        for(int i = 0; i < 5; i++){
            media += vet[i];
        }
        media/=5;

        desvio = 0;
        for(int i = 0; i < 5; i++){
            somatorio += Math.pow((vet[i]-media), 2);
            
        }

        desvio = Math.sqrt(somatorio/4);


        System.out.printf("\n A média é %.0f e o desvio-padrão é de %f \n", media, desvio);


    }

    public static void ex09(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[100];
        int alunos;
        float media;

        System.out.println("<< Média n de alunos. Máximo 100 alunos >>");
        System.out.printf("Entre com o número de alunos: ");
        alunos = sc.nextInt();

        if(alunos > 100){
            System.out.printf("Erro! O número máximo de alunos permitido é 100.");
        }else{

        for(int i = 0; i < alunos; i++){
            System.out.printf("Entre com a nota do aluno %d: \n", i+1);
            vet[i] = sc.nextInt();
        }

        media = 0;
        for(int i = 0; i < 5; i++){
            media += vet[i];
        }
        media/=alunos;

        System.out.printf("Relatório de notas \n");
        for(int i = 0; i < alunos; i++){
            System.out.printf("A nota do aluno %d é: %d \n", i, vet[i]);
        }

        System.out.printf("A média da turma é: %.1f \n", media);
    }

    }

    public static void ex10(){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3], b = new int[3], c = new int[3];

        System.out.println("<< Subtração de vetores >>");
        for(int i = 0; i < 3; i++){
            System.out.printf("Digite o valor %d de A: \n", i+1);
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < 3; i++){
            System.out.printf("Digite o valor %d de B: \n", i+1);
            b[i] = sc.nextInt();
        }

        for(int i = 0; i < 3; i++){
            c[i] = a[i] - b[i];
        }

        System.out.printf("O vetor C, definido como C=A-B é (%d, %d, %d)", c[0], c[1], c[2]);

    }

    public static void ex11(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5], impares = new int[5], pares = new int [5];
        System.out.println("<< Pares e ímpares >>");

        for(int i = 0; i < 5; i++){
            System.out.printf("Digite o valor %d: \n", i+1);
            vet[i] = sc.nextInt();
        }

        for(int i = 0; i < 5; i++){
        if(vet[i] %2 == 0){
            pares[i] = vet[i];
        }else{
            impares[i] = vet[i];
        }
        }

        System.out.printf("Ímpares: ");
        for(int i = 0; i < 5; i++){
            if(impares[i] != 0){
                System.out.printf("%d ", impares[i]);
            }
        }

        System.out.println();

        System.out.printf("Pares: ");
        for(int i = 0; i < 5; i++){
            if(pares[i] != 0){
                System.out.printf("%d ", pares[i]);
            }
        }

    }

    public static void ex12(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        //int v, a, am, ve, soma; 
        float div1, div2, div3, div4, v, a, am, ve, soma;

        System.out.println("<< Probabilidades >>");
        
        System.out.println("Digite a quantidade de bolinhas");
        System.out.printf("Verdes: ");
        v = sc.nextFloat();
        System.out.printf("Azul: ");
        a = sc.nextFloat();
        System.out.printf("Amarelo: ");
        am = sc.nextFloat();
        System.out.printf("vermelha: ");
        ve = sc.nextFloat();

        soma = (v+a+ve+am);
        div1 = (v/soma)*100;
        div2 = (a/soma)*100;
        div3 = (am/soma)*100;
        div4 = (ve/soma)*100;

        System.out.println();
        System.out.println("Probabilidades");
        if(div1 > div2 && div1 > div3 && div1 > div4){
        System.out.printf("Verde: %.1f%% <<Maior Probabilidade\n", div1);
        System.out.printf("Azul: %.1f%% \n", div2);
        System.out.printf("Amarelo: %.1f%% \n", div3);
        System.out.printf("Vermelha: %.1f%% \n", div4);
        }else if(div2 > div1 && div2 > div3 && div2 > div4){
            System.out.printf("Verde: %.1f%% \n", div1);
            System.out.printf("Azul: %.1f%% <<Maior Probabilidade\n", div2);
            System.out.printf("Amarelo: %.1f%% \n", div3);
            System.out.printf("Vermelha: %.1f%% \n", div4);
            }else if(div3 > div1 && div3 > div2 && div3 > div4){
                System.out.printf("Verde: %.1f%% \n", div1);
                System.out.printf("Azul: %.1f%% \n", div2);
                System.out.printf("Amarelo: %.1f%% <<Maior Probabilidade \n", div3);
                System.out.printf("Vermelha: %.1f%% \n", div4);
                }else if(div4 > div1 && div4 > div2 && div4 > div3){
                    System.out.printf("Verde: %.1f%% \n", div1);
                    System.out.printf("Azul: %.1f%% \n", div2);
                    System.out.printf("Amarelo: %.1f%% \n", div3);
                    System.out.printf("Vermelha: %.1f%% <<Maior Probabilidade\n", div4);
                    }
    }
    
    public static void ex13(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        System.out.println("<< Zerando Negativos >>");

        for(int i = 0; i < 5; i++){
            System.out.printf("Entre com o número %d: ", i+1);
            vet[i] = sc.nextInt();
            if(vet[i] < 0){
                vet[i] = 0;
            }
        }
        System.out.printf("Zerando os negativos, obtém-se: ");
        for(int i = 0; i < 5; i++){
        System.out.printf("%d ", vet[i]);
        }
    }

    public static void ex14(){
        Scanner sc = new Scanner(System.in);
        int[] matricula = new int[10000]; 
        int alunos; 
        String x[] = new String[10000];
        float cra[] = new float[10000];

        System.out.println("<< Universidade X >>");
        System.out.printf("Quantos alunos serão cadastrados: ");
        alunos = sc.nextInt();
        if(alunos > 10000){
            System.out.println("Erro! O número máximo de alunos é 10000");
        }else{

        for(int i = 0; i < alunos; i++){
            System.out.printf("Entre com o número do aluno: ");
            matricula[i] = sc.nextInt();
            System.out.printf("Entre com a classe social do aluno: ");
            x[i] = sc.next();
            System.out.printf("Entre com o CRA do aluno: ");
            cra[i] = sc.nextFloat();

        }

        System.out.println("==== Alunos Cadastrados ====");
        for(int i = 0; i < alunos; i++){
            System.out.printf("Número: %d Classe Social: %s CRA: %.1f \n", matricula[i], x[i], cra[i]);
        }

        }

    }

    public static void ex15(){
        Scanner sc = new Scanner(System.in);
        System.out.println("<< Valores iguais >>");
        int[] vet = new int[8], iguais = new int[8];
        int aux=0, rep=0;

        for(int i = 0; i < 8; i++){
            System.out.printf("Entre com o número %d: ", i+1);
            vet[i] = sc.nextInt();
            
        }
        System.out.printf("Valores repetidos: ");
        
        Arrays.sort(vet);

        for(int i = 0; i < 8; i++){
            if(i < 7 && vet[i] == vet[i+1]){
                for(int j = 0; j < (aux+1); j++){
                    if(vet[i] == iguais[j]){
                        rep++;
                    }
                }
                if(rep == 0){
                    iguais[aux] = vet[i];
                    aux++;

                }else if(vet[i]==0 && aux==0){
                    iguais[aux] = vet[i];
                    aux++;
                }
                rep=0;
            }
        }

        for(int i = 0; i < aux; i++){
            System.out.printf("%d ", iguais[i]);
        }
        
    }

        
    
    public static void ex16(){
        Scanner sc = new Scanner(System.in);
        System.out.println("<< Valores iguais >>");
        int[] vet = new int[8], iguais = new int[8];
        int aux=0, rep=0;

        for(int i = 0; i < 8; i++){
            System.out.printf("Entre com o número %d: ", i+1);
            vet[i] = sc.nextInt();
            
        }
        System.out.printf("Valores repetidos: ");
        
        Arrays.sort(vet);

        for(int i = 0; i < 8; i++){
            if(i < 7 && vet[i] == vet[i+1]){
                for(int j = 0; j < (aux+1); j++){
                    if(vet[i] == iguais[j]){
                        rep++;
                    }
                }
                if(rep == 0){
                    iguais[aux] = vet[i];
                    aux++;

                }else if(vet[i]==0 && aux==0){
                    iguais[aux] = vet[i];
                    aux++;
                }
                rep=0;
            }
        }

        for(int i = 0; i < aux; i++){
            System.out.printf("%d ", iguais[i]);
        }
        
    }

    

    public static void main(String[] args) {
        /* 
        ex01();
        ex02();
        ex03();
        ex04();
        ex05();
        ex06();
        ex07();
        ex08();
        ex09();
        ex10();
        ex11();
        ex12();
        ex13();
        ex14();
        ex15();
        ex16();
        */
    }


}
