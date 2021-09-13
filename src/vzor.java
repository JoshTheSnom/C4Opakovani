import java.util.Scanner;

public class vzor {

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

        for(int i = input.length(); i > 0; i--) {
            System.out.println(input);
            input = input.substring(0, input.length()-1);
        }

    }
}
