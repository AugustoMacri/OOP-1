public class FigurinhaExtra extends Figurinha {
       
    protected String categoria;
    protected String cor;

    public FigurinhaExtra(String nome, String  data, float altura, float peso, String posicao, String pais, String categoria, String cor){
        super(nome, data, altura, peso, posicao, pais);
        this.categoria = categoria;
        this.cor = cor;
    }

    public void MostrarFigurinha(){
        System.out.println("Nome: " + getNome());
        System.out.println("Data de nascimento: " + getData());
        System.out.println("Altura: " + getAltura());
        System.out.println("Peso: " + getPeso());
        System.out.println("Posição: " + getPosicao());
        System.out.println("País: " + getselecao());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("País: " + getCor());
        System.out.println("\n");
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

    
        
    }


