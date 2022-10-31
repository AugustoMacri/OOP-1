public class Figurinha {

    private String nome;
    private String data;
    private float altura;
    private float peso;
    private String posicao;
    private String pais;

    
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
    public void setPais(String pais) {
        this.pais = pais;
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
    public String getPais() {
        return pais;
    }
    @Override
    public String toString() {
        return "Figurinha [nome=" + nome + ", data=" + data + ", altura=" + altura + ", peso=" + peso + ", posicao="
                + posicao + ", pais=" + pais + "]";
    }
    
    
}

