public class Main {
    public static void main(String[] args){

        String selecao = "Brasil";
        String tecnico = "Tite";

        Selecao time = new Selecao(selecao, tecnico);
        time.setSelecao(selecao);
        time.setTecnico(tecnico);

        System.out.println(time);
    }           
}
