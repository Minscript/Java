import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        System.out.print("\033\143"); // Очистка консоли

        // Ввод
        System.out.println("Введите число N: ");
        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        int n_num = Integer.parseInt(n);
        scan.close();

        // Вывод
        System.out.printf("Треугольное число n = %d: %d\n", n_num, n_number_amount(n_num));
        System.out.printf("Факториал числа n = %d: %d", n_num, n_number_product(n_num));
    }

    // Треугольное число
    public static int n_number_amount(int value) {
        return (value * (value + 1) / 2);
    }

    // Факториал
    public static int n_number_product(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result = result * i;
        }
        return result;
    }
}