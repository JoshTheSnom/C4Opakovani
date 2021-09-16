import java.util.Scanner;

public class parsov {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean err = true;
        String input = "";
        System.out.println("Napiš text");

        input = sc.nextLine();
        input = input.replaceAll("\\D+","");

        int output = 0;
        for(int i = 0; i < input.length(); i++) {
            int a= Character.getNumericValue(input.charAt(i));
            output += a;
        }
        System.out.println(output);
    }
}
