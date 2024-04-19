import java.util.Scanner;
    class NumerosIguales{
        public static void main (String[] args){
            Scanner op = new Scanner (System.in);
            int a;
    
            do{
                System.out.println("Ingresa la opcion correcta");
                System.out.println("1 = numeros iguales");
                System.out.println("0 = cerrar prgrama");
                a = op.nextInt();
                int b,c;
                if (a==1) {
                    System.out.println("Ingresa un numero");
                    b = op.nextInt();
                    System.out.println("Ingresa otro numero");
                    c = op.nextInt();
                    if (b == c) {
                        System.out.println("Los números son iguales.");
                    } else {
                        System.out.println("Los números no son iguales.");
                    }
                
                }
            } while(a>0);
        }
     }
    