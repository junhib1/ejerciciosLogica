import java.util.Scanner;
     class NumeroMayor{
        public static void main(String[] args){
             Scanner op = new Scanner(System.in);
             int a;

            do{
                System.out.println("Ingresa la opcion correcta");
                System.out.println("1 = numero mayor");
                System.out.println("0 = cerrar prgrama");
                a = op.nextInt();
                int b,c;
                if (a==1) {
                    System.out.println("Introduce el primer numero: ");
                    b = op.nextInt();
                    System.out.println("Introduce el segundo numero: ");
                    c = op.nextInt();
                    if (b > c) {
                        System.out.println(b + " es mayor que " + c);
                    } else if (c > b) {
                        System.out.println(c + " es mayor que " + b);
                    } else {
                        System.out.println("Los numeros son iguales.");
                    }       
            }
        } while(a>0);
    }
 }