package ru.ls.qa.school.core.OddTask;

import java.util.Scanner;

public class OddTask {

    public static void main(String[] args) {

        int number;

        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("\nВведите целое число или для выхода введите 0.\n");
                System.out.print("Введите число: ");
                number = sc.nextInt();

            } catch (Exception e) {
                System.out.println("\n *** Сообщение об ошибке. ***" +
                        "\n * Введено не корретное значение." +
                        "\n * Допусткается ввод целых чисел.");
                number = -1;
            }

            //Проверка результата
            if(number != 0)
            {
                if(number == -1)
                    System.out.println("\nЧисло введено с ошибкой попробуйте еще раз.\n");
                else {
                    if (isOdd(number))
                        System.out.println("Вы ввели ЧЕТНОЕ число.\n");
                    else
                        System.out.println("Вы ввели НЕЧЕТНОЕ число.\n");
                }
            }
            else
                break;

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
