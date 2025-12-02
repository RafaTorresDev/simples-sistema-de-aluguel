import classes.Estudantes;

import java.util.Locale;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Estudantes[] quartos = new Estudantes[10];

        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++){
            System.out.println("Rent #" + (i + 1) + ": ");

            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Email: ");
            String email = sc.nextLine();


            System.out.println("Room: ");
            int room = sc.nextInt();
            sc.nextLine();

            quartos[room] = new Estudantes(name, email);
        }
        System.out.println();
        System.out.println("Busy Room: ");

        for(int i=0; i < 10; i++){
            if(quartos[i] != null){
                System.out.println(i + ": " + quartos[i]);
            }
        }
        sc.close();
   }
}