package by.epam.task06.view;

import java.util.Scanner;

public class Output{
    public Scanner getScanner() {
        Scanner sc = new Scanner(System.in);
        return sc;
    }

    public int inputHours(int h) {
        // Scanner sc = new Scanner(System.in);
        System.out.println("Input  hours");
        h = getScanner().nextInt();
        if(h <= 24) {
            return h;
        } else {
            return 0;
        }
    }

    public int inputMinutes(int m) {
        System.out.println("Input minutes");
        m = getScanner().nextInt();
        if(m <= 60) {
            return m;
        } else {
            return 0;
        }
    }

    public int inputSec(int s) {
        System.out.println("Input seconds");
        s = getScanner().nextInt();
        if(s <= 60) {
            return s;
        } else {
            return 0;
        }
    }
}
