import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean err = true;
        String input = "0";
        do {
            err = true;
            System.out.println("Napiš číslo");

            input = sc.nextLine();
            if(input.matches("\\d+")) err = false;
            else System.out.println("Prosím napiš číslo");
        }while(err);

        int val = Integer.parseInt(input);
        int fact = 1;
        for(int i = 1; i <= val; i++) {
            fact=fact*i;
        }

        System.out.println(fact);

    }
}
