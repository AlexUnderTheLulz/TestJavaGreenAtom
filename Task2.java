import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner nums = new Scanner(System.in);
        int num1 = nums.nextInt();
        int num2 = nums.nextInt();
        replacement(num1, num2);
    }
    
    public static void replacement(int a, int b){
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}
