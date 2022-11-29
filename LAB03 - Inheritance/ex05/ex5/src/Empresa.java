public class Empresa {
    public static void main(String[] args){
        int i, j, k, m, n;

        //crie um array para cada tipo de funcionario

        //array para chefes
        Chefe[] chefes = new Chefe[5];
        for(i=0; i<5; i++){
            chefes[i] = new Chefe("Chefe", "1/1/1990", 10000, 10000);
            System.out.println(chefes[i].salarioChefe());
        }

        //array para vendedores
        Vendedor[] vendedores = new Vendedor[5];
        for(i=0; i<5; i++){
            vendedores[i] = new Vendedor("Vendedor", "1/1/1990", 1000, 1000, 120, 5);
            System.out.println(vendedores[i].salarioVendedor());
        }
       
        //array para operarios
        Operario[] operarios = new Operario[5];
        for(i=0; i<5; i++){
            operarios[i] = new Operario("Operario", "1/1/1990", 0, 150, 25);
            System.out.println(operarios[i].salarioOperario());
        }

        //array para horistas
        Horista[] horistas = new Horista[5];
        for(i=0; i<5; i++){
            horistas[i] = new Horista("Horista", "1/1/1990", 0, 50, 160);
            System.out.println(vendedores[i].salarioVendedor());
        }
    }
}
