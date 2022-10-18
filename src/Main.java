import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] salary = generateRandomArray();
        System.out.println("Task №1:");
        System.out.printf("Сумма всех выплат за месяц равна: %d рублей \n, ", getSum(salary));
        System.out.println("Task №2:");
        System.out.println("Минимальная трата за месяц составила:" + minWaste(salary));
        System.out.println("Максимальная трата за месяц составила:" + maxWaste(salary));
        System.out.println("Task №3:");
        System.out.println("Средняя сумма трат за месяц равна: " + averageAmount(salary) + "рублей");
        System.out.println("Task №4:");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        reverse(reverseFullName);
        System.out.println();
    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    //task:1
    public static int getSum(int[] arr) {
    /* Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
    Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
    в формате: «Сумма трат за месяц составила … рублей». */
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //task:2
    /*Следующая задача — найти минимальную и максимальную трату за день.
    Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
    в формате: «Минимальная сумма трат за день составила … рублей.
    Максимальная сумма трат за день составила … рублей».*/
    public static int minWaste(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxWaste(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    //task:3
    //А теперь нам нужно понять, какую в среднем сумму наша компания
    // тратила в течение данных 30 дней.
    //Нужно написать программу, которая посчитает среднее значение
    // трат за месяц (то есть сумму всех трат за месяц поделить на количество дней),
    // и вывести в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
//**Важно помнить:** подсчет среднего значения может иметь остаток
// (то есть быть не целым, а дробным числом).
    public static double averageAmount(int[] arr) {
        double averageAmount = 0;
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            averageAmount = total / arr.length;
        }
        return averageAmount;
    }

    //task:4
    //В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф.И.О.
    // сотрудников начали отображаться в обратную сторону.
    // Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
    //Данные с именами сотрудников хранятся в виде массива символов (char[]).
    //Напишите код, который в случае такого бага будет выводить Ф. И. О.
    // сотрудников в корректном виде. В качестве данных для массива используйте:
    //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
    //В результате в консоль должно быть выведено "Ivanov Ivan".
    public static void reverse(char[] reverseFullName) {
        reverseFullName = new char[]{'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}







