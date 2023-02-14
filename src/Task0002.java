import java.util.Scanner;

/* Задача №2
Каждый следующий элемент ряда Фибоначчи получается при сложении двух предыдущих.
Начиная с 1 и 2, первые 10 элементов будут:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

Найдите сумму всех четных элементов ряда Фибоначчи,
которые не превышают заданного значения.
4_000_000 = 4613732


 */
public class Task0002 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите до какого числа считать: ");
        int limit = in.nextInt();
        int sum = 0;
        int num1 = 1;
        int num2 = 2;
        while (num2 <= limit) {
            if (num2 % 2 == 0) {
                sum += num2;
            }
            int transmission = num1 + num2;
                num1 = num2;
                num2 = transmission;
        }
        System.out.println("Ответ: " + sum);

    }
}
//