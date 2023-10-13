import java.util.Scanner;
public class Notas{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        double nota;
        System.out.print("Dime tu nota: ");
        
        while(!teclado.hasNextDouble() || (nota = teclado.nextDouble()) < 0 || nota > 10){
            teclado.nextLine();
            System.out.println("ERROR");
            System.out.print("Dime tu nota: ");
        }
        teclado.nextLine();
        if(nota < 5){
            System.out.println("Suspenso");
        }
        else if(nota < 6){
            System.out.println("Aprobado");
        }
        else if(nota < 7){
            System.out.println("Bien");
        }
        else if(nota < 9){
            System.out.println("Notable");
        }
        else{
            System.out.println("Sobresaliente");
        }
    }
}