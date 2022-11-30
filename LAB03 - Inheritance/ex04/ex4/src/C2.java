public class C2 extends C1{
    public int a;
    protected int b;
    private int c;

    public C2(){    //construtor padrao sem parametros
        System.out.println("Classe C2: Chamada do construtor padrao, sem parametros");
    }

    public C2(int x, int y, int z, int a, int b, int c){
        super(x,y,z);
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Classe C2: Chamada do construtor padrao, com parametros");
    }

    public void  mostar_atributos(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(super.getZ());
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public void  mostar_atributos_super(){
        super.mostar_atributos();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    

}