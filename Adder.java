import java.util.Scanner;
class Adder {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Input Numer 1 = ");int a = sc.nextInt();
        System.out.print("Input Numer 2 = ");int b = sc.nextInt();

        int sum = a+b;
        
        System.out.println("Result Combination = "+sum);

    }
}