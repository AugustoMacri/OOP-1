public class Main {

    public static void main(String[] args) {

        //(b) Mostre as informações do nome de todos os alunos e, no caso de aluno de doutorado, mostrar adicionalmente o título da tese a linha de pesquisa
        Estudante[] estudantes = new Estudante[100];
        estudantes[0] = new Estudante("Estudante", "Uberlandia");
        estudantes[1] = new EstudanteGraduacao("EstudanteGrad", "Uberlandia", "Titulo TCC");
        estudantes[2] = new EstudantePosGrad("EstudantePosGrad", "Uberlandia", "Formacao", "Pesquisa");
        estudantes[3] = new EstudanteMestrado("EstudanteMestrado", "Uberlandia", "Formacao", "Pesquisa", "Tipo", "Titulo");
        estudantes[4] = new EstudanteDoutorado("Nome", "Uberlandia", "Formacao", "Pesquisa", "Titulo da Tese");

        for(int i=0; i<100; i++){
            if(estudantes[i]!=null){
                estudantes[i].print();
                System.out.println(("-----------------------------------"));
            }
        }

        Universidade x = new Universidade("ufu", "Uberlandia");
        x.quantidadeEstudantes(estudantes);

        //Crie um novo vetor e copie para ele todos os alunos de pós-graduação (somente a cópia da referência do objeto - 
        //não há necessidade de duplicar o objeto na memóra). Percorra o vetor e mostre as informações completas dos alunos.
        Estudante[] posgrad = new Estudante[100];
        for(int i=0; i<100; i++){
            if(estudantes[i] != null){
                if(estudantes[i] instanceof EstudantePosGrad){
                    posgrad[i] = estudantes[i];
                    posgrad[i].print();
                }
            }
        }
    }
}