import java.util.Scanner;

public class binary {

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
        String bin = "";
        do {
            bin += Integer.toString(val%2);
            if(val%2 != 0) val -= 1;
            val /= 2;
        }while(val != 0);

        System.out.println(bin);

    }
}
