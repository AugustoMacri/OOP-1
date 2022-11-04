public class Figurinha {

    private String nome;
    private String data;
    private float altura;
    private float peso;
    private String posicao;
    private String selecao;

    public Figurinha(String selecao){
        this.nome = null;
        this.data = null;
        this.altura = 0;
        this.peso = 0;
        this.posicao = null;
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
}

