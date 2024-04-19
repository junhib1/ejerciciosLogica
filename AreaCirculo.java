import java.util.Scanner;
    class AreaCirculo{
        public static void main (String[] args){
        Scanner op = new Scanner (System.in);
            int a;
            double PI = 3.1416;
                
            do{
                System.out.println("Ingresa la opcion correcta ");
                System.out.println("1 = Area de un circulo ");
                System.out.println("0 = cerrar prgrama ");
                a = op.nextInt();
                double radio;
                if (a==1) {
                    System.out.println("Ingresa un numero");
                    radio = op.nextInt();
                    System.out.println("El resultado es ");
                    System.out.println(PI*radio*radio);
                
                }
            } while(a>0);
        }
     }