import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //task1();
        //task2();
        task3();

    }


    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год: ");
        printIsLeapYear(scanner.nextInt());
    }

    public static void printIsLeapYear(int year) {
        //метод вычисления вида года к Задаче 1
        if ((year % 4 == 0) && ((year % 400 == 0) || (year % 100 != 0))) {
            System.out.println(+year + " високосный год");
        } else {
            System.out.println(+year + " не високосный год");
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        int ios = 1;
        int currentYear = LocalDate.now().getYear();
        versionСalculat(ios, currentYear);

    }

    public static void versionСalculat(int clientOs, int clientDeviceYear) {
        //метод вычисления версии OS
        if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Скачайте полную версию с AppleStore");
        } else if (clientOs == 0 && clientDeviceYear < 2015) {
            System.out.println("Скачайте облегченную версию с AppleStore");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Скачайте полную версию с GoogleMarket");
        } else if (clientOs == 1 && clientDeviceYear < 2015) {
            System.out.println("Скачайте облегченную версию с GoogleMarket");
        }
        System.out.println();
    }


    public static void task3() {
        System.out.println("Задача 3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дистанцию до Вас: ");
        //calculateDistance(scanner.nextInt());
        int deliveryDays = calculateDistance(scanner.nextInt());


    }

    public static int calculateDistance(int deliveryDistance) {

        int deliveryDays = 1;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (deliveryDays + 1));
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: " + (deliveryDays + 2));
        } else {
            System.out.println("Доставки нет");
        }
        return deliveryDays;
    }
}