import java.util.Scanner;

public class atbas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean err = true;
        String input = "0";
        do {
            err = true;
            System.out.println("Napiš text");

            input = sc.nextLine();
            if(input.matches("[a-zA-Z ]+")) err = false;
            else System.out.println("Prosím napiš pouze písmena bez diakritiky");
        }while(err);

        for(int i = 0; i < input.length(); i++) {
            int ch = /*(int)*/ input.charAt(i);
            if(ch >= 65 && ch <= 90) ch = (90-(ch-65));
            else if(ch >= 97 && ch <= 122) ch = (122-(ch-97));
            input = input.substring(0,i)+(char)ch+input.substring(i+1);
        }

        System.out.println(input);



    }
}
