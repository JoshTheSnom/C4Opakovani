import java.util.Scanner;

public class bank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean err = true;
        String input = "0";
        do {
            err = true;
            System.out.println("Napiš bankovní číslo bez kódu banky");

            input = sc.nextLine();
            if(input.matches("\\d+")) err = false;
            else System.out.println("Prosím napiš číslo");
        }while(err);
        int[] vahy = {6, 3, 7, 9, 10, 5, 8, 4, 2, 1};
        int kontr = 0;
        for(int i = input.length()-1; i >= 0; i--) {
            kontr += (input.charAt(i)-'0')*vahy[i];
        }
        if(kontr%11==0) System.out.println("Číslo je platné.");
        else System.out.println("Číslo je neplatné.");


    }
}
