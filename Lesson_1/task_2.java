import java.util.ArrayList;
import java.util.List;

public class task_2 {
    public static void main(String[] args) {
        System.out.print("\033\143"); // Очистка консоли

        List<Integer> primes = new ArrayList<>();

        // Перебираем каждое число
        for (int i = 2; i <= 1000; i++) {
            // Флаг
            boolean isPrimeNumber = true;

            // Является ли число простым
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            // Добавим в лист число, если оно является простым
            if (isPrimeNumber) {
                primes.add(i);
            }
        }
        //String s = primes.toString().replace("[", "").replace("]", "");
        System.out.println("Число простых чисел: " + primes.size() + "\n\nВесь список чисел: " + primes);
    }
}