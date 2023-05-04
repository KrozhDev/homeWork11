import java.time.LocalDate;

public class Main {

    static int year = 2021;
    static int clientOS = 1;

    static int clientDeviceYear = LocalDate.now().getYear();

    static int distance = 25;


    public static void main(String[] args) {

        isVisYear(year);

        versDefiner(clientOS, clientDeviceYear);

        howManyDaysDelivery(distance);
    }

    private static void howManyDaysDelivery(int distance) {
        if (distance <= 20) {
            System.out.println("Потребуется дней " + 1);
        } else if (distance <= 60) {
            System.out.println("Потребуется дней " + 2);
        } else if (distance <= 100) {
            System.out.println("Потребуется дней " + 3);
        } else {
            System.out.println("Доставки нет");
        }
    }

    private static void versDefiner(int clientOS, int clientDeviceYear) {

        if (clientDeviceYear >= 2015) {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            if (clientOS ==0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }

    }

    private static void isVisYear(int year) {
        if ((year % 400 == 0) | ((year % 4 ==0) && (year % 100 != 0))) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
}