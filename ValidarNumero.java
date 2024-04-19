import java.util.Scanner;
class ValidarNumero{
    public static void main (String[] args){
        Scanner op = new Scanner (System.in);
        int a;

        do{
            System.out.println("Ingresa la opcion correcta");
            System.out.println("1 = validar, par o impar");
            System.out.println("0 = cerrar prgrama");
            a = op.nextInt();
            int b;
            if (a==1) {
                System.out.println("Ingresa un numero entero");
                b = op.nextInt();
                if (b % 2 == 0) {
                    System.out.println("El número es par.");
                } else {
                    System.out.println("El número es impar.");
                }
            }
        } while(a>0);
    }
 }