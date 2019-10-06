
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printRules();

        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int[] params = new int[2];
        params[0] = a;
        params[1] = b;
        Calculator calculator = new Calculator();
        System.out.println("результат = " +  calculator.performOperation(Operation.of(operation), params));
    }

    private static void printRules()
    {
        System.out.println("Сложение 1");
        System.out.println("Вычитание 2");
        System.out.println("Умножение 3");
        System.out.println("Деление 4");
    }
}
