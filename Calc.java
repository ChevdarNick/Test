import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Введите первое число");
        a = sc.nextInt();//считываем первое число
        System.out.println("Введите второе число");
        b = sc.nextInt();//второе
        c = a + b;
        System.out.println("c = "+c);
        return;
    }
}