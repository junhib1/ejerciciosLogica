import java.util.Scanner;
class ModuloRecursivo{
    public static void main (String[] args){
        Scanner option = new Scanner (System.in);
        int a;

        do{
            System.out.println("Ingresa la opcion correcta");
            System.out.println("1 = modulo");
            System.out.println("0 = cerrar prgrama");
            a = option.nextInt();
            int b,c;
            if (a==1) {
                System.out.println("Ingresa un numero");
                b = option.nextInt();
                System.out.println("Ingresa otro numero");
                c = option.nextInt();
                System.out.println("El resultado es ");
                System.out.println(b%c);
            
            }
        } while(a>0);
    }
 }
