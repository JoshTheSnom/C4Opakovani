import java.util.Scanner;

public class coolsifra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean err = true;
        String input = "";
        String output = "";
        System.out.println("Napiš text");

        input = sc.nextLine();
        System.out.println(input.length());

        for(int i = 0; i < input.length()/2; i++) {
            char ch = input.charAt(i*2);
            output = output+ch;
        }

        System.out.println(output);
    }
}
