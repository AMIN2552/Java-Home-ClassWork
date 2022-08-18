import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
         System.out.println("Введите год в формате:уууу");
         Scanner scanner = new Scanner(System.in);
         int year = scanner.nextInt();
         if (year % 400 == 0){
             System.out.println("Результат вычисления: 366 дней - високосный год");
         } else if (year % 100 == 0){
             System.out.println("Результат вычисления: 365 дней - високосный год");
         } else if (year % 4 == 0){
             System.out.println("Результат вычисления: 366 дней - високосный год");
         } else {
             System.out.println("Результат вычисления: 365 дней - високосный год");
         }

    }

}
