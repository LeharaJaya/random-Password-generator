import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String pool = ("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789!@#$%^&*()?/.<>,");
        System.out.println("Enter here length: ");
        int length = input.nextInt();

        StringBuilder password = new StringBuilder();
         for (int i=1 ; i<=length; i++){
             int index = random.nextInt(pool.length());
             password.append(pool.charAt(index));
         }
        System.out.println("The Random generated password is : "+ password.toString());
    }
}

