package OddTask;

import java.util.Scanner;

public class OddTask {

    public static void main(String[] args) {

        int number;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.print("\nВведите целое число или для выхода введите 0.\n");
                System.out.print("Введите число: ");
                number = sc.nextInt();

                //Проверка результата
                if(number != 0)
                {
                    if (isOdd(number))
                        System.out.println("Вы ввели ЧЕТНОЕ число.\n");
                    else
                        System.out.println("Вы ввели НЕЧЕТНОЕ число.\n");
                }
                else
                    break;

            } catch (Exception e) {
                System.out.println("Сообщение об ошибке. " +
                        "\nВведено не корретное значение." +
                        "\nДопусткается ввод целых чисел.");
            }
        }while (true);
    }

    /**
     * Функция проверки числа четное/нечетное
     * @param number проверяемое целое число.
     * @return - Результат true четное иначе false
     */
    public  static boolean  isOdd(int number){

        boolean flag = false;
        int result;

        //Проверяем число нечетное/четное
        result = number % 2;
        if(result == 0)
            flag = true;

        return flag;
    }
}
