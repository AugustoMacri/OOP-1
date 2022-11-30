public class C1 {
    public int x;
    protected int y;
    private int z;

    public C1(){    //construtor padrao sem parametros
        System.out.println("Classe C1: Chamada do construtor padrao, sem parametros");
    }

    public C1(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
        
        System.out.println("Classe C1: Chamada do construtor padrao, com parametros");
    }

    public void  mostar_atributos(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    

}
