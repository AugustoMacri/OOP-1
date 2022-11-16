public class Produtos {
    private String nome;
    private float preco;
    private int quant;
    private float porcentagem;
/* 
    public Produtos(String nome, float preco, int quant, float porcentagem){
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
        this.porcentagem = porcentagem;
    }*/

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public int getQuant() {
        return quant;
    }
    public void setQuant(int quant) {
        this.quant = quant;
    }
    public float getPorcentagem() {
        return porcentagem;
    }
    public void setPorcentagem(float porcentagem) {
        this.porcentagem = porcentagem;
    }

    public float altera_preco(float preco, float porcentagem){
        float temp;

        if(porcentagem > -100){
            temp = porcentagem/100;
            return (preco + (preco*temp));
        }else{
            return preco;
        }
    }
}
