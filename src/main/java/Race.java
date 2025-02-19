public class Race {
    private Car[] cars;

    public Race(Car[] cars) { // конструктор для гонки
        this.cars = cars;
    }

    public Car determineLeader() { // метод определения лидера гонки
        Car leader = cars[0];
        for (Car car : cars) {
            if (car.calculateDistance(24) > leader.calculateDistance(24)) {
                leader = car;
            }
        }
        return leader;
    }
}
