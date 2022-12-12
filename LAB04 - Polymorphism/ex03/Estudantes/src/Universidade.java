public class Universidade {
    private String nome;
    private String dataFundacao;

    public Universidade(String nomeUni, String dataFundacao){
        this.nome = nome;
        this.dataFundacao = dataFundacao;
    }

    //(a) Crie um método que mostra quantos estudantes de graduação, mestrado e doutorado a Universidade possui (para facilitar, é permitido instanciar os alunos no próprio código)
    public void quantidadeEstudantes(Estudante[] estudantes){
        int graduacao=0, mestrado=0, doutorado=0;
        for(int i=0; i<100; i++){
            if(estudantes[i]!=null){
                if(estudantes[i] instanceof EstudanteGraduacao){
                    graduacao += 1;
                }
                if(estudantes[i] instanceof EstudanteMestrado){
                    mestrado+=1;
                }
                if(estudantes[i] instanceof EstudanteDoutorado){
                    doutorado+=1;
                }
            }
        }
        System.out.printf("\nA universidade possui :\n");
        System.out.printf("%d estudantes de graduacao\n", graduacao);
        System.out.printf("%d estudantes de Mestrado\n", mestrado);
        System.out.printf("%d estudantes de doutorado\n\n", doutorado);


       

    }
}
