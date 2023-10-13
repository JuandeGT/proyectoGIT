import java.util.Scanner;
public class Operacion{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        double num1, num2;
        System.out.print("Dime un número: ");
        num1 = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Dime otro número: ");
        num2 = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Que operación quieres realizar: 1:suma, 2:resta, 3:multiplicación, 4:división: ");
        int operacion = teclado.nextInt();
        teclado.nextLine();
        switch(operacion){
            case 1: double suma = num1 + num2;
                System.out.println("La suma es: " + suma);
                break;
            case 2: double resta = num1 - num2;
                System.out.println("La resta es: " + resta);
                break;
            case 3: double multiplicacion = num1 * num2;
                System.out.println("La multiplicación es: " + multiplicacion);
                break;
            case 4: double division = num1 / num2;
                System.out.println("La división es: " + division);
                break;
            default: System.out.println("Error");
        }
    }
}
