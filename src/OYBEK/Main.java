package OYBEK;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int array1[][] = {{1,2,3,4,5,6,7,8,9,10},{11,12,13,14,15,16,17,18,19,20}};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                if (i % 5 == 0 && j % 7 == 0) {
                    count++;
                    System.out.println();
                    System.out.print("5 ga bo`linadigan sonlar soni: " + i);
                    System.out.println();
                    System.out.print("7 ga bo`linadigan sonlar soni: " + array1[j]);

                }

            }

        }
    }
}
