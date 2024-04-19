import java.util.Scanner;
    class Multiplicacion{

    public static void main (String[] args){
        Scanner option = new Scanner (System.in);
        int a,b;
        
    System.out.println("Ingresa un numero entero");
    a = option.nextInt();
    System.out.println("Ingresa otro numero entero");
    b = option.nextInt();

    System.out.print("El resultado es ");
    System.out.println(a*b);

    }
}

