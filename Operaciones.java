import java.util.Scanner;
class Operaciones {
    public static void main(String[] args) {
        Scanner option = new Scanner(System.in);
        int a;
        do {
            System.out.println("\nIngresa la opcion correcta");
            System.out.println("1: suma "); 
            System.out.println("2: resta ");
            System.out.println("3: multiplicacion ");
            System.out.println("4: division ");
            System.out.println("5: modulo ");
            System.out.println("0: cerrar programa");
            a = option.nextInt();
            int b,c;
            switch (a) {
                case 1:
                    System.out.println("SUMA");
                    System.out.println("Ingresa un numero");
                    b=option.nextInt();
                    System.out.println("Ingresa otro numero");
                    c=option.nextInt();
                    System.out.print("El resultado de la suma es: ");
                    System.out.println(b+c);
                break;
                case 2:
                    System.out.println("RESTA");
                    System.out.println("Ingresa un numero");
                    b=option.nextInt();
                    System.out.println("Ingresa otro numero");
                    c=option.nextInt();
                    System.out.print("El resultado de la resta es: ");
                    System.out.println(b-c);
                break;
                case 3:
                    System.out.println("MULTIPLICACION");
                    System.out.println("Ingresa un numero");
                    b=option.nextInt();
                    System.out.println("Ingresa otro numero");
                    c=option.nextInt();
                    System.out.print("El resultado de la multiplicacion es: ");
                    System.out.println(b*c);
                break;
                case 4:
                    System.out.println("DIVISION");
                    System.out.println("Ingresa un numero");
                    b=option.nextInt();
                    System.out.println("Ingresa otro numero");
                    c=option.nextInt();
                    System.out.print("El resultado de la division es: ");
                    System.out.println(b/c);
                break;
                case 5:
                    System.out.println("MODULO");
                    System.out.println("Ingresa un numero");
                    b=option.nextInt();
                    System.out.println("Ingresa otro numero");
                    c=option.nextInt();
                    System.out.print("El resultado del modulo es: ");
                    System.out.println(b%c);
                break;
                default:
                    break;
            }
        } while (a>0);
    }
}