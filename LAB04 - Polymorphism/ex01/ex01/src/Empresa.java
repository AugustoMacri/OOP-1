
public class Empresa {
    public static void main(String[] args){
        Funcionario[] funcionarios = new Funcionario[4];

        funcionarios[0] = new Chefe("Chefe", "1/1/1990", 10000, 10000);
        funcionarios[1] = new Vendedor("Vendedor", "1/1/1990", 2000, 150, 10);
        funcionarios[2] = new Operario("Operario", "1/1/1990", 0.00, 100, 50);
        funcionarios[3] = new Horista("Horista", "1/1/1990", 0.00, 50, 160);
        
        FolhaPagamento x = new FolhaPagamento();

        
        x.TotalaPagar(funcionarios);
        
         
    }


}