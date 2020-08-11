package lessons.lesson_04;

public class Car { // Класс Car

    // Car(){}   // Конструктор пустой (default) изначально создается компилятором

    Car (String wheel, String transmission) { // Конструктор с параметрамы для передачи значений в классе

        wheelD = wheel;
        trCar = transmission;
    }
    String color = "red";
    String engine = "V6";
    String wheelD;
    String trCar;
}

class Car2 {
    Car2 () { // Пустой конструктор выполняющий код ("Empty")
        System.out.println("Empty");
    }
}

class Car3 {
    Car3 () { // В конструкторе определяются значения изначально
        color = "red";
        engine = "V4";
    }
     String color;
     String engine;
}

class Car4 {
    Car4 (String colorCar, String engineCar) { // Заполненый метод с выводом информации
        color = colorCar;
        engine = engineCar;

        System.out.println("Color car: " + color + "; Engine car: " + engine + ".");
    }
    String color;
    String engine;
}

class Car01 {
    public static void main(String[] args) {
        Car car01 = new Car("26", "automatic");

        System.out.println("Color car: " + car01.color + " Engine car: " + car01.engine);

        car01.color = "black";
        car01.engine = "V8";

        System.out.println("Color change car: " + car01.color + " Engine change car: " + car01.engine);

        Car car02 = new Car("28", "manual");
        System.out.println("Мотор: " + car02.engine + "; Коробка передач: "+ car02.trCar + "; Цвет: " + car02.color + "; Размер колес: " + car02.wheelD + ".");

        // Не имеет значения но код выполняет
        Car2 car03 = new Car2();

        // Значения передаются обоим объектам с возможностью изменения
        Car3 car04 = new Car3();
        System.out.println(car04.color + "\t" + car04.engine);
        Car3 car05 = new Car3();
        System.out.println(car05.color + "\t" + car05.engine);

        Car3 car06 = new Car3();
        car06.color = "black";
        car06.engine = "V8";
        System.out.println(car06.color + "\t" + car06.engine);

        Car4 car07 = new Car4("white", "V12"); // Заполнение конструктора и вывод на экран
        Car4 car08 = new Car4("black", "V8"); // Заполнение конструктора и вывод на экран
    }
} /* Output:
     Color car: red Engine car: V6
     Color change car: black Engine change car: V8
     Мотор: V6; Коробка передач: manual; Цвет: red; Размер колес: 28.
     Empty
     red	V4
     red	V4
     black	V8
     Color car: white; Engine car: V12.
     Color car: black; Engine car: V8.
*///:~