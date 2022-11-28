import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        System.out.print("\033\143"); // Очистка консоли

        double num_1;
        double num_2;
        double result;
        char op;
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        num_1 = scan.nextDouble();

        System.out.println();

        System.out.print("Введите второе число: ");
        num_2 = scan.nextDouble();

        System.out.println();

        System.out.print("Введите оператор (+, -, *, /): ");
        op = scan.next().charAt(0);

        scan.close();

        switch (op) {
            case '+':
                result = num_1 + num_2;
                break;
            case '-':
                result = num_1 - num_2;
                break;
            case '*':
                result = num_1 * num_2;
                break;
            case '/':
                result = num_1 / num_2;
            default:
                System.out.println("Используйте корректный оператор!");
                return;
        }

        System.out.printf(num_1 + " " + op + " " + num_2 + " = " + result);
    }
}
