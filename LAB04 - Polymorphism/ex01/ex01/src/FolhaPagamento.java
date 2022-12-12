//Criar também uma classe {FolhaPagamento}, que lê dados referentes ao conjunto de empregados de uma empresa e mostra a folha de pagamento da empresa.

//import java.util.ArrayList;
//import java.util.Iterator;

public class FolhaPagamento extends Funcionario{

        double aux=0;
    
    public void TotalaPagar(Funcionario[] funcionarios){
        for(int i=0; i<4; i++){
            
            aux += funcionarios[i].salarioTotal();
        }

        System.out.printf("\nO valor total a ser pago eh de: %.2f\n", aux);

    }

}
