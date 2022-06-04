package by.epam.task06.logic;

public class Change{
    public static void changeHours(int h, int add_1) {
        int res1 = h + add_1;
        if(res1 <= 24) {
            System.out.println("Result: " + res1);
        } else {
            System.out.println(0);
        }
    }

    public static void changeMin(int m, int add_2) {
        int res2 = m + add_2;
        if(res2 <= 60) {
            System.out.println("Result: " + res2);
        } else {
            System.out.println(0);
        }
    }

    public static void changeSec(int s, int add_3) {
        int res3 = s + add_3;
        if(res3 <= 60) {
            System.out.println("Result:" + res3);
        } else {
            System.out.println(0);
        }
    }
}
