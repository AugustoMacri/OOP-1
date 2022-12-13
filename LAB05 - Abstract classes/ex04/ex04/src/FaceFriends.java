import java.util.Scanner;

public class FaceFriends {
    public static void main(String[] args) {
        Contato[] contatos = new Contato[5]; // definir umm vetor do tipo contatos
        Scanner sc = new Scanner(System.in);
        int aux = 0;

        // Menu
        while (true) {
            System.out.println("------------------------------");
            System.out.println("            Menu              ");
            System.out.println("------------------------------");
            System.out.println("Especifique o subtipo do contato:");
            System.out.println(
                    " [1].Imprimir Familia   [2].Imprimir Amigo              [3].Imprimir Trabalho\n [4].Adicionar Contato  [5].Imprimir todos os contatos  [6].Imprimir os dados de um Unico contato\n [7].Imprimir Melhores amigos, Irmaos e Colegas\n");
            int op = sc.nextInt();

            if (op == 1) {
                for (int i = 0; i < 5; i++) {
                    if (contatos[i] instanceof Familia) {
                        System.out.println("--------------Contato----------------");
                        contatos[i].imprimirContato();
                    }
                }
            }

            if (op == 2) {
                for (int i = 0; i < 5; i++) {
                    if (contatos[i] instanceof Amigos) {
                        System.out.println("--------------Contato----------------");
                        contatos[i].imprimirContato();
                    }
                }
            }

            if (op == 3) {
                for (int i = 0; i < 5; i++) {
                    if (contatos[i] instanceof Trabalho) {
                        System.out.println("--------------Contato----------------");
                        contatos[i].imprimirContato();
                    }
                }
            }

            if (op == 5) {
                for (int i = 0; i < 5; i++) {
                    if (contatos[i] != null) {
                        System.out.println("--------------Contato----------------");
                        contatos[i].imprimirContato();
                    }
                }
            }

                if (op == 4) {
                    System.out.println("Qual subtítulo de contatos gostaria de inserir?\n");
                    System.out.println("[1].Familia      [2].Amigo      [3].Colegas de trabalho\n");
                    int op2 = sc.nextInt();
                    if (op2 == 1) {
                        System.out.println("Digite as informações do contato");
                        contatos[aux] = new Familia(sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
                        aux++;
                    }
                    if (op2 == 2) {
                        System.out.println("Digite as informações do contato");
                        contatos[aux] = new Amigos(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt());
                        aux++;
                    }
                    if (op2 == 3) {
                        System.out.println("Digite as informações do contato");
                        contatos[aux] = new Trabalho(sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
                        aux++;
                    }
                }

                // imprimir os dados de um unico contato
                if (op == 6) {
                    System.out.println("Selecione o contato que deseja imprimir");
                    int op3 = sc.nextInt();
                    contatos[op3].imprimirContato();

                }

                if (op == 7) { // imprimir os melhores amigos
                    for (int i = 0; i < 5; i++) {
                        if (contatos[i] instanceof Amigos && ((Amigos) contatos[i]).getGrau() == 1) {
                            System.out.println("--------------Melhores amigos----------------");
                            contatos[i].imprimirContato();
                        }
                        if (contatos[i] instanceof Familia && ((Familia) contatos[i]).getParentesco() == "Irmao") {
                            System.out.println("--------------Irmaos----------------");
                            contatos[i].imprimirContato();
                        }
                        if (contatos[i] instanceof Trabalho && ((Trabalho) contatos[i]).getTipo() == "Colega") {
                            System.out.println("--------------Colegas----------------");
                            contatos[i].imprimirContato();
                        }
                    }
                }
            

        } // fim do while
    }
}
