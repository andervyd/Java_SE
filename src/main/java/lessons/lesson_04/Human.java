package lessons.lesson_04;

public class Human {
    String name;
    CarCheck car;
    BunkAccount bA;

    void info () {
        System.out.println("Name: " + name + "; Color car: " + car.color + "; Balance: " + bA.balance + ".");
    }
}

class HumanID {
    public static void main(String[] args) {

        Human dataHuman = new Human();
        dataHuman.name = "Ivan";
        dataHuman.car = new CarCheck("black", "V8");
        dataHuman.bA = new BunkAccount(345, 134.45);
        dataHuman.info();

        dataHuman.bA.popolnenieScheta(50.12);
        dataHuman.info();

        dataHuman.bA.snytieSoScheta(10.34);
        dataHuman.info();

        dataHuman.bA.popolnenieScheta2(120);
        dataHuman.bA.snytieSoScheta2(24);
    }
} /* Output:
     Name: Ivan; Color car: black; Balance: 134.45.
     Name: Ivan; Color car: black; Balance: 184.57.
     Name: Ivan; Color car: black; Balance: 174.23.
     Баланс до пополнения: 174.23
     Баланс пополнения на: 120.0
     Баланс после пополнения: 294.23

     Баланс до снятия: 294.23
     Баланс снятия на: 24.0
     Баланс после снятия: 270.23
*///:~

class CarCheck {

    CarCheck (String colorCar, String engineCar) {
        color = colorCar;
        engine = engineCar;
    }
    String color;
    String engine;
}

class BunkAccount {
    BunkAccount (int idBunk, double balanceBunk) {
        id = idBunk;
        balance = balanceBunk;
    }
    int id;
    double balance;

    double popolnenieScheta (double pS) {
        balance += pS;
        return balance;
    }

    void popolnenieScheta2 (double sumPopolneniya) {
        System.out.println("Баланс до пополнения: "+ balance);
        System.out.println("Баланс пополнения на: "+ sumPopolneniya);
        balance += sumPopolneniya;
        System.out.println("Баланс после пополнения: "+balance);
        System.out.println();
    }

    double snytieSoScheta (double sSS) {
        balance -= sSS;
        return balance;
    }

    void snytieSoScheta2 (double sumSnatiya) {
        System.out.println("Баланс до снятия: "+ balance);
        System.out.println("Баланс снятия на: "+ sumSnatiya);
        balance -= sumSnatiya;
        System.out.println("Баланс после снятия: "+balance);
        System.out.println();
    }
}