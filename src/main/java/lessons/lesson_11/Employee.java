package lessons.lesson_11;

public class Employee {  // Primitive data types (примитивные методы данных)

    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double multySalary(double a) { // работа со значением
        a *= 2;
        return a;
    }

    public double multySalary2() { // работа с зпрплатой
        salary *= 2;
        return salary;
    }

}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 1200); // Назначаем
        double d = emp1.multySalary(emp1.salary);
        System.out.println("Умноженная зарплата: "+d);
        // emp1.salary = d;
        System.out.println("Начальная зарплата: "+emp1.salary);
        emp1.multySalary2();
        System.out.println(emp1.salary);
    }
} /* Output:
     Умноженная зарплата: 2400.0
     Начальная зарплата: 1200.0
     2400.0
*///:~