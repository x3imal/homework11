import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        task1();
        task2();


    }

    public static void task1(){
        System.out.println("Задача 1");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год ");
        enterYears(scanner.nextInt());
    }
    public static void enterYears (int year){
        //метод вычисления вида года к Задаче 1
        if ((year % 4 == 0) && ((year % 400 == 0) || (year % 100 != 0))) {
            System.out.println(+year+ " високосный год");
        } else {
            System.out.println(+year+ " не високосный год");
        }
    }

    public static void task2(){
        System.out.println("Задача 2");
        int ios = 1;
        int currentYear = LocalDate.now().getYear();
        enterOsOptionAndYears(ios, currentYear);

    }
    public static void enterOsOptionAndYears(int clientOs, int clientDeviceYear) {
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
}