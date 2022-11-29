public class Figurinhas {

    private String nome;
    private String data;
    private float altura;
    private float peso;
    private String posicao;
    private String selecao;

    public Figurinhas(String nome, String  data, float altura, float peso, String posicao, String selecao){
        this.nome = nome;
        this.data = data;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.selecao = selecao;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public void setselecao(String selecao) {
        this.selecao = selecao;
    }
    public String getNome() {
        return nome;
    }
    public String getData() {
        return data;
    }
    public float getAltura() {
        return altura;
    }
    public float getPeso() {
        return peso;
    }
    public String getPosicao() {
        return posicao;
    }
    public String getselecao() {
        return selecao;
    }

    public void MostrarFigurinha(){
        System.out.println("Nome: " + getNome());
        System.out.println("Data de nascimento: " + getData());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
        System.out.println("Posição: " + getPosicao());
        System.out.println("País: " + getselecao());
        System.out.println("\n");
    }
    
    
}