import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario("nome", 13234, 20000);

        System.out.println("Digite o porcentual de aumento de salario do funcionario");
        double x = sc.nextDouble();
        
        try
        {
        funcionario.aumentarSalario(x);
        }
        catch(ValorNegativoException e)
        {
            System.out.println(e.getMessage());
        }
        catch(PassouTetoException t)
        {
            System.out.println(t.getMessage());
        }
        finally
        {
            System.out.println("O valor atual do salario eh de:" + funcionario.getSalario());
        }



    }
}
