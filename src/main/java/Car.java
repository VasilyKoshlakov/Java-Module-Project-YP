public class Car {
    private String name;
    private int speed;

    public Car(String name, int speed) { // создаем конструктор для автомобилей
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }



    public double calculateDistance(int hours) { // метод подсчета дистанции
        return speed * hours;
    }
}
