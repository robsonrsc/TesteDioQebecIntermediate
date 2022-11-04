package Teste1;

import java.util.Scanner;

public class QebecDio1 {
    public static void main(String[] args) {

        {
            int num = Integer.parseInt(new Scanner(System.in).nextLine());
            var step = 0;

// TODO: Implemente uma condição onde seja possível reduzir o número até 0:

            while (num !=0) {

                if (num % 2==0) {

                    int div = num/2;

                    /*System.out.println("Etapa "+step+") " +num+ " é par; divida por 2 e obtenha "+div+". \n"
                            );*/
                    num = div;
                } else {

                    int subt = num-1;
                   /* System.out.println("Etapa "+step+") " +num+ " é impar; subtraia 1 e obtenha "+subt+". \n"
                            );*/
                    num=subt;

                }

/*
                if ((num & 1) == 1) {
                    step++;
                }
                num /= 2;
                step++;
*/
                step++;
            }
            System.out.println(step);



        }
    }
}
