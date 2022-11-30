public class Main {
   public static void main(String[] args){
    C1 c1 = new C1(1,2,3);
    C2 c2 = new C2(1,2,3,4,5,6);
    C3 c3 = new C3(1,2,3,4,5,6,7,8,9);

    c1.mostar_atributos();
    c2.mostar_atributos();
    c2.mostar_atributos_super();
    c3.mostar_atributos();
    c3.mostar_atributos_super();
   }
}
