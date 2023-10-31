import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int secInStep = 10;
        int floor = 7;
        int stepInStraith = 15;
        int straightInFloor = 2;
        int result;

        Scanner scanner = new Scanner(System.in);

        System.out.println("программа позволяет понять на сколько секунд увеличилась ваша жизнь при подъеме на " + floor +  " этажей");

        System.out.println("Введите номер этажа, на который вы хотите подняться: ");

        floor = scanner.nextInt();

        result = secInStep * stepInStraith * straightInFloor * floor;

        System.out.print("Ваша жизнь увеличилась на " + result + " секунд");



    }
}