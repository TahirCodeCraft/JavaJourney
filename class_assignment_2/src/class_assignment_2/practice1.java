package class_assignment_2;

import java.util.Scanner;

public class practice1 {

    static int isvalid(int number) {
        int clear = 0;
        if (getsize(number) >= 13 && getsize(number) <= 16) {
            clear = 1;
        }
        return clear;
    }

    static int getsize(int number) {
        String size = number + "";
        int len = size.length();
        return len;
    }

    static int prefixmatched(int num1, int num2) {
        int clear = 0;
        if (num1 == 5 || num1 == 4 || num1 == 6 || num2 == 37) {
            clear = 1;

        }
        return clear;
    }

    static int sumofdoubleevenplace(int number) {
        String s = number + "";
        int sum = 0;
        int len = s.length();
        for (int i = 0; i < len; i = i + 2) {
            String s1 = s.charAt(i) + "";
            int s2 = Integer.parseInt(s1) * 2;
            String s3 = s2 + "";
            if (s3.length() == 2) {
                String a = s3.charAt(0) + "";
                String b = s3.charAt(1) + "";
                int A = Integer.parseInt(a);
                int B = Integer.parseInt(b);
                sum = sum + A + B;
            } else {
                sum = sum + s2;
            }
        }
        return sum;
    }

    static int sumofoddplaces(int number) {
        int sum = 0;
        String s = number + "";
        for (int i = 1; i < s.length(); i = i + 2) {
            String A = s.charAt(i) + "";
            int B = Integer.parseInt(A);
            sum = sum + B;
        }
        return sum;
    }

    static int getdigit(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    static void getprefix(int num1, int num2, int num3) {
        String s = num3 + "";
        String a1 = s.charAt(0) + "";
        int a2 = Integer.parseInt(a1);
        String b1 = s.substring(0, 2);
        int b2 = Integer.parseInt(b1);
        prefixmatched(a2, b2);

    }

    static int verify(int check, int check4) {
        int sum = check + check4;
        int clear = 0;
        if (sum % 10 == 0) {
            clear = 1;
        }
        return clear;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter visa card number:");
        int A = 0;
        int B = 0;
        int number = input.nextInt();
        int check1 = isvalid(number);
        if (check1 == 1) {
            getprefix(A, B, number);
            int check2 = prefixmatched(A, B);
            if (check2 == 1) {
                int check3 = sumofdoubleevenplace(number);
                int check4 = sumofoddplaces(number);
                int check5 = getdigit(check3, check4);
                int check6 = verify(check3, check4);
                if (check6 == 1) {
                    System.out.println("This is valid!");
                } else {
                    System.out.println("invalid!");
                }

            } else {
                System.out.println("invalid!");
            }
        } else {
            System.out.println("invalid!");
        }
    }
}
