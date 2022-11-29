public class CamaroteInferior extends VIP{
    protected String localizacao;
    
    public CamaroteInferior(double valor, double valoradicional, String localizacao){
        super(valor, valoradicional);
        this.localizacao = localizacao;
    }

    //metodo
    public void imprimiLocalizacao(){
        System.out.println(localizacao);
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
}
