import java.util.Scanner;

public class tools {
    /**
     * print a line on the scree
     * 
     * @param num how many times print charactor str
     * @param str the charactor for print
     */
    // method1
    public static void printLine(int num, String str) {
        for (int i = 0; i < num; i++) {
            System.out.print(str);
        }
        System.out.println();
    }

    // method2
    public static void printSquare(int width, int length, String str) {
        for (int r = 0; r < width; r++) {
            printLine(length, str);
        }
    }

    // method3
    public static void printRectangle(int num, String str) {
        for (int i = 0; i < num; i++) {
            printLine(num, str);

        }
    }

    // get an integer from user input
    public static int getInt() {
        System.out.println("Enter an integer: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }

    public static int getInt(String str) {
        System.out.println(str);
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        return num;
    }

    // get a String
    public static String getStr() {
        System.out.println("Enter a String: ");
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void modify(int a) {// local variable
        a = 5;
    }

    public static int change(int a) {// return a new value
        return a - 5;
    }

    public static String weekday(int today) {
        if (today == 1) {
            return "Monday";
        } else if (today == 2) {
            return "Tuesday";
        } else if (today == 3) {
            return "Wednesday";
        } else if (today == 4) {
            return "Thursday";
        } else if (today == 5) {
            return "Friday";
        } else if (today == 6) {
            return "Saturday";
        } else if (today == 7) {
            return "Sunday";
        } else {
            return "wrong";
        }
    }

    /**
     * display the pattern 1 12 123
     */
    public String numTran(int n) {
        String tmp = "";
        for (int i = 0; i < 3; i++) {
            for (int j = i; j < 3; j++) {
                tmp += 1;
            }
            tmp += "/n";
        }
        return tmp;
    }