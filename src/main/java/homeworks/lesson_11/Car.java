package homeworks.lesson_11;

public class Car {

    String color;
    String engine;
    int doorNum;

    public Car(String color, String engine, int doorNum) {
        this.color = color;
        this.engine = engine;
        this.doorNum = doorNum;
    }
}

class CarTest {

    void changeNumDoor(Car door, int change) { //Усовершенствованный метод
        door.doorNum = change;
    }

    public static void changeColor(Car c1, Car c2) {
        String colorTemp = c1.color;
        c1.color = c2.color;
        c2.color = colorTemp;
    }

    public static void main(String[] args) {
        CarTest st0 = new CarTest();
        Car car1 = new Car("Red", "V6", 4);
        System.out.println("Цвет авто car1 до модернизации: " + car1.color);
        Car car2 = new Car("Black", "V12", 3);
        System.out.println("Цвет авто car2 до модернизации: " + car2.color);

        // Change doors
        System.out.println("Кол-во дверей car1 до модернизации: " + car1.doorNum);
        st0.changeNumDoor(car1, 5);
        System.out.println("Кол-во дверей car1 после модернизации: " + car1.doorNum);

        changeColor(car1, car2);
        System.out.println("Цвет авто car1 после модернизации: " + car1.color);
        System.out.println("Цвет авто car2 после модернизации: " + car2.color);
    }
} /* Output:
     Цвет авто car1 до модернизации: Red
     Цвет авто car2 до модернизации: Black
     Кол-во дверей car1 до модернизации: 4
     Кол-во дверей car1 после модернизации: 5
     Цвет авто car1 после модернизации: Black
     Цвет авто car2 после модернизации: Red
*///:~










