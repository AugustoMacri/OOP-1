public class Main {
    public static void main(String[] args){
        Produto[] produtos = new Produto[3];
        Cliente[] clientes = new Cliente[3];
        Servico[] servicos = new Servico[3];

        produtos[0] = new Produto(234);
        produtos[1] = new Produto(123);
        produtos[2] = new Produto(345);

        clientes[0] = new Cliente("arthur");
        clientes[1] = new Cliente("augusto");
        clientes[2] = new Cliente("alberto");

        servicos[0] = new Servico(18.0);
        servicos[1] = new Servico(15.0);
        servicos[2] = new Servico(12.0);

        Classificador.ordena(produtos);
        Classificador.ordena(clientes);
        Classificador.ordena(servicos);

        for(int i=0; i<3; i++){
            System.out.println(produtos[i].getCodigo());
        }
        for(int i=0; i<3; i++){
            System.out.println(clientes[i].getNome());
        }
        for(int i=0; i<3; i++){
            System.out.println(servicos[i].getPreco());
        }

    }
}
