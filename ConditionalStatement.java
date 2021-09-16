import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Введите Ваш возраст:");
        int age = scanner.nextInt();
        if (age > 20) {
            System.out.println("Вам больше 20");
        }

        System.out.println("Введите Ваш пол:");
        char gender = scanner.next().charAt(0);
        if (gender == 'M') {
           System.out.println("Вы мужчина");
       } else  if (gender != 'M') {
           System.out.println("Вы женщина");
       }

        System.out.println("Введите Ваш рост:");
        double height = scanner.nextDouble();
        if (height < 1.8) {
            System.out.println("Ваш рост меньше 1 метра 80 сантиметров");
        } else {
            System.out.println("Ваш рост больше 1 метра 80 сантиметров");
        }

        System.out.println("Введите первую букву Вашего имени:");
        char name = scanner.next().charAt(0);
        if (name == 'M') {
            System.out.println("Вас могут звать Mikle");
        } else if (name == 'I') {
            System.out.println("Вас могут звать Ilya");
        } else {
            System.out.println("Вас могут звать как угодно");
            }
    }
}