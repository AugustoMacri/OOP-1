public class FigurinhaExtra {
    private String nome;
    private String data;
    private float altura;
    private float peso;
    private String posicao;
    private String selecao;
    private String categoria;
    private String cor;

    public FigurinhaExtra(String nome, String  data, float altura, float peso, String posicao, String selecao, String categoria, String cor){
        this.nome = nome;
        this.data = data;
        this.altura = altura;
        this.peso = peso;
        this.posicao = posicao;
        this.selecao = selecao;
        this.categoria = categoria;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public String getPosicao() {
        return posicao;
    }
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
    public String getSelecao() {
        return selecao;
    }
    public void setSelecao(String selecao) {
        this.selecao = selecao;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public void MostrarFigurinha(){
        System.out.println("Nome: " + getNome());
        System.out.println("Data de nascimento: " + getData());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
        System.out.println("Posição: " + getPosicao());
        System.out.println("País: " + getSelecao());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("cor: " + getCor());
        System.out.println("\n");
    }

    
}
