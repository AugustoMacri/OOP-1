public class FigurinhaExtra extends Figurinha {
       
    protected String categoria;
    protected String cor;
    
    public FigurinhaExtra(String nome, String  data, float altura, float peso, String posicao, String pais, String categoria, String cor){
        super(nome, data, altura, peso, posicao, pais);
        this.categoria = categoria;
        this.cor = cor;
    }
    
    
     public void MostrarFigurinha(){
        super.MostrarFigurinha();
         System.out.println("CATEGORIA " + categoria);
         System.out.println("COR: " + cor);
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


