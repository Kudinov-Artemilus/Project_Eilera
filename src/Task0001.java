import java.util.Scanner;

/* Задача №1
Если выписать все натуральные числа меньше 10, кратные 3 или 5,
то получим 3, 5, 6 и 9. Сумма этих чисел равна 23.

Найдите сумму всех чисел меньше 1000, кратных 3 или 5.
Ответ:

Сумма чисел до 1000 и кратные 3 и 5 равна: 233168

 */
public class Task0001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число до которого требуется посчитать: ");
        int max = in.nextInt();
        System.out.print("Введите числа кратные к чему 2 числа: ");
        int multiple1 = in.nextInt();
        int multiple2 = in.nextInt();
        int summa = 0;
        for (int i = 0; i < max; i++) {
            if (i % multiple1 == 0 || i % multiple2 == 0) {
                summa += i;
            }

        }
        System.out.println("Сумма чисел до " + max + " и кратные " + multiple1 + " и " + multiple2 +
                " равна: " + summa);
    }
}

