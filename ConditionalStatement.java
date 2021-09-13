import java.util.Scanner;
import static java.lang.Math.*;

public class ConditionalStatement {
    public static void main(String[] args) throws java.io.IOException {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Введите Ваш возраст:");
        int age = scanner.nextInt();
        if (age > 20) {
            System.out.println("Вам больше 20");
        }

        System.out.println("Введите М если Вы мужчина или Ж если женщина:");
        char gender = scanner.next().charAt(0);
        boolean isGender = gender == 'M';
        if (isGender) {
            System.out.println("Вы мужчина");
        }
        if (!isGender) {
            System.out.println("Вы женщина");
        }

        System.out.println("Введите Ваш рост:");
        double height = scanner.nextDouble();
        if (height <= 1.8) {
            System.out.println("Ваш рост меньше 1 метра 80 сантиметров");
        } else {
            System.out.println("Ваш рост больше 1 метра 80 сантиметров");
        }

        System.out.println("Введите первую букву Вашего имени:");
            char name = (char) System.in.read (); 
            if (name == 'M') {
            System.out.println("Вас могут звать Mikle");
            } else if (name == 'I') {
            System.out.println("Вас могут звать Ilya");
            } else {
            System.out.println("Вас могут звать как угодно");
            }
    }
}