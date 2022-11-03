public class main {
    public static void main(String[] args){
        Selecao[] selecao = new Selecao[2];

            for(int i = 0; i < 2; i++){
            selecao[i] = new Selecao();
            }
            
            selecao[0].setSelecao("Argentina");
            selecao[0].setjog1("Emiliano");
            selecao[0].setjog2("Messi");
            selecao[0].setjog3("Paulo");
            selecao[0].setjog4("Lisandro");
            selecao[0].setjog5("Julián");
            selecao[0].setjog6("Di Maria");
            selecao[0].setjog7("Cristian");
            selecao[0].setjog8("Rodrigo");
            selecao[0].setjog9("Lautaro");
            selecao[0].setjog10("Giovani");
            selecao[0].setjog11("Alexis");
            selecao[0].setTecnico("Lionel Scaloni");

            selecao[1].setSelecao("Brasil");
            selecao[1].setjog1("Alisson");
            selecao[1].setjog2("Danilo");
            selecao[1].setjog3("Thiago Silva");
            selecao[1].setjog4("Marquinhos");
            selecao[1].setjog5("Alex Sandro");
            selecao[1].setjog6("Casemiro");
            selecao[1].setjog7("Neymar");
            selecao[1].setjog8("Vini Jr");
            selecao[1].setjog9("Richarlisson");
            selecao[1].setjog10("Rodrygo");
            selecao[1].setjog11("Éder Militão");
            selecao[1].setTecnico("Tite");

        for(int j = 0; j < 2; j++){
            System.out.println(selecao[j]);
        }
    }           
}
