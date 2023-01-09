public class Cliente implements Classificavel{
    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean eMenorQue(Classificavel obj) {
        // TODO Auto-generated method stub
        Cliente compara = (Cliente) obj; //casting de "classificavel" para cliente 
        //if(this.nome )
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
