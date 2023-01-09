import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        int num, senha;
        float valor;
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero da conta que vai ser criada: ");
        num = sc.nextInt();
        System.out.println("Valor a ser debitado: ");
        valor = sc.nextFloat();
        System.out.println("Senha: ");
        senha = sc.nextInt();
        ContaCorrente conta = new ContaCorrente(valor, num, senha);

        System.out.println("Digite a senha e o valor a ser creditado");
        float x = sc.nextFloat();   
        senha = sc.nextInt();
        conta.creditaValor(senha, x);

        System.out.println("Digite o valor que sera sacado e a senha");
        float y = sc.nextFloat();
        senha = sc.nextInt();
        conta.debitaValor(y, senha);

        sc.close();
    }
}
