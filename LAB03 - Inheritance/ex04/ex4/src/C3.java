public class C3 extends C2{
    public int d;
    protected int e;
    private int f;

    public C3(){    //construtor padrao sem parametros
        System.out.println("Classe C3: Chamada do construtor padrao, sem parametros");
    }

    public C3(int x, int y, int z, int a, int b, int c, int d, int e, int f){
        super(x, y, z, a, b, c);
        this.d = e;
        this.e = d;
        this.f = f;
        System.out.println("Classe C3: Chamada do construtor padrao, com parametros");
    }

    public void  mostar_atributos(){
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }

    public void  mostar_atributos_super(){
        super.mostar_atributos();
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }

}