package OddTask;

import java.util.Scanner;

public class OddTask {

    public static void main(String[] args) {

        int number;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите целое число: ");
            number = sc.nextInt();

            //Проверка результата
            if(isOdd(number))
                System.out.println("Вы ввели ЧЕТНОЕ число.");
            else
                System.out.println("Вы ввели НЕЧЕТНОЕ число.");


        } catch (Exception e) {
            System.out.println("Сообщение об ошибке. " +
                    "\nВведено не корретное значение." +
                    "\nДопусткается ввод целых чисел.");
        }

    }

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
