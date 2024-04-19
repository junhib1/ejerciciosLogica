import java.util.Scanner;
    class NumerosEnBucleDesc{
    public static void main(String[] args){
        Scanner op = new Scanner(System.in);
        int a, i;
        
        do{
            System.out.println("Ingresa la opcion correcta");
            System.out.println("1 = numeros en bucle ");
            System.out.println("0 = cerrar prgrama");
            a = op.nextInt();
            int b;
            if (a==1) {
                System.out.println("Ingresa un numero");
                b = op.nextInt();
                if (b < 0) {
                }
                for (i = b; i >= 0; i--) {
                    System.out.println(i);
                }
            }   
        }while(a>0);
    }
}