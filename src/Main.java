import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        task1();


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


    }
}