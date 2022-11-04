import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        int count = 0;

        for (int i = 0;i <= num; i++) {
            var strNum = String.valueOf(i);
            if (strNum.length() != 0) {
                if (i % 2 ==0) {
                    count++;
                    System.out.println(i);
                }

            }
        }
    }
}