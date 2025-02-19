import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car[] cars = new Car[3]; // создаем массив из 3 автомобилей

        for (int i = 0; i < 3; i++) { // цикл ввода названия и скорости для каждого автомобиля
            System.out.println("Введите данные для автомобиля " + (i + 1));

            String name;
            int speed;

            // Ввод названия автомобиля
            while (true) { // проверка корректности ввода названия автомобиля
                System.out.print("Название автомобиля: ");
                name = scanner.nextLine();
                if (name == null || name.trim().isEmpty()) {
                    System.out.println("Ошибка: название автомобиля не может быть пустым. Попробуйте снова.");
                } else {
                    break;
                }
            }

            // Ввод скорости автомобиля
            while (true) { // проверка корректности ввода скорости автомобиля
                System.out.print("Скорость автомобиля (км/ч): ");
                String speedInput = scanner.nextLine();
                try {
                    speed = Integer.parseInt(speedInput);
                    if (speed <= 0 || speed > 250) {
                        System.out.println("Ошибка: скорость должна быть в диапазоне от 1 до 250 км/ч. Попробуйте снова.");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка: введите целое число для скорости. Попробуйте снова.");
                }
            }

            cars[i] = new Car(name, speed); //присваиваем введенные параметры каждому автомобилю в массиве
        }

        // Определение лидера гонки
        Race race = new Race(cars);
        Car leader = race.determineLeader();

        System.out.println("Самая быстрая машина: " + leader.getName());
    }
}
