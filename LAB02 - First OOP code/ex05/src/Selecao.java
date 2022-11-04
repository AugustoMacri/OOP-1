import java.util.Arrays;

public class Selecao {
    private String selecao, tecnico;
    private Figurinha jog[];

    public Selecao(String selecao, String tecnico){

        Figurinha jog[] = new Figurinha[11];

        for(int i = 0; i < 11; i++){
            jog[i] = new Figurinha("brasil");
        }

    }

    public String getSelecao() {
        return selecao;
    }

    public void setSelecao(String selecao) {
        this.selecao = selecao;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public Figurinha[] getJog() {
        return jog;
    }

    public void setJog(Figurinha[] jog) {
        this.jog = jog;
    }

    @Override
    public String toString() {
        return "Selecao = " + selecao + "\ntecnico = " + tecnico + "\njog = " + Arrays.toString(jog);
    }

    

}
