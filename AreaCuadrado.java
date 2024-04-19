import java.util.Scanner;
    class AreaCuadrado{
        public static void main (String[] args){
        Scanner op = new Scanner (System.in);
            int a;
    
            do{
                System.out.println("Ingresa la opcion correcta ");
                System.out.println("1 = Area de un cuadrado ");
                System.out.println("0 = cerrar prgrama ");
                a = op.nextInt();
                double b;
                if (a==1) {
                    System.out.println("Ingresa un numero");
                    b = op.nextInt();
                    System.out.println("El resultado es ");
                    System.out.println(b*b);
                
                }
            } while(a>0);
        }
     }   
