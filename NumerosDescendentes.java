import java.util.Scanner;
    class NumerosDescendentesr{
        public static void main(String[] args){
            Scanner op = new Scanner(System.in);
            int a;

           do{
               System.out.println("Ingresa la opcion correcta");
               System.out.println("1 = numero descendente");
               System.out.println("0 = cerrar prgrama");
               a = op.nextInt();
               int b,c,d;
               if (a==1) {
                   System.out.print("Introduce el primer numero: ");
                   b = op.nextInt();
                   System.out.print("Introduce el segundo numero: ");
                   c = op.nextInt();
                   System.out.print("Introduce el tercer numero: ");
                   d = op.nextInt();
                   System.out.print("los numeros ordenados de mayor a menor son: ");
                   if (b >= c && c >= d)
                   {
                    System.out.println(" " +b+ " " +c+ " " +d+ " ");
                   }
                   else if (b >= d && d >= c)
                   {
                    System.out.println(" " +b+ " " +d+ " " +c+ " ");
                   }
                   else if (c >= b && b >= d)
                   {
                    System.out.println(" " +c+ " " +b+ " " +d+ " ");
                   }
                   else if (c >= d && d >= b)
                   {
                    System.out.println(" " +c+ " " +d+ " " +b+ " ");
                   }
                   else if (d >= b && b >= c)
                   {
                    System.out.println(" " +d+ " " +b+ " " +c+ " ");
                   }
                   else
                   {
                    System.out.println(" " +d+ " " +c+ " " +b+ " ");
                   }              
            }
        }while(a>0);
    }
}