package chapter03;

import common.Log;

import java.util.Scanner;

public class Code_n06p91s01_Gugudan {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Gugudan Input:");
        int dan = Integer.parseInt(in.nextLine());
        for (int row = 1; row <= 9; row++) {
            Log.d(dan + " * " + row + " = " + dan * row);
        }
        in.close();
    }
}
