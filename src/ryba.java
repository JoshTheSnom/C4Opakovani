import java.util.Scanner;

public class ryba {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean err = true;
        String input = "0";
        do {
            err = true;
            System.out.println("Kolik ryb si dáš k večeři?");

            input = sc.nextLine();
            if(input.matches("\\d+")) err = false;
            else System.out.println("Prosím napiš číslo");
        }while(err);

        int val = Integer.parseInt(input);

        for(int i = 0; i < val; i++) {
            System.out.println("<° )))-<");
        }

    }
}
