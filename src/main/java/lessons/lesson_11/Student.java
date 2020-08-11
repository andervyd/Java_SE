package lessons.lesson_11;

public class Student {

    public String name;
    public int course;
    public double grade;

    public Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public static void swap(Student s1, Student s2) {  // Метод по замены данных не подходит так как создаются копии,
                                                       // которы после работы метода умирают
        System.out.println("s2 до начала работы метода: "+s2.name);
        Student s3 = s1;
        s1 = s2;
        s2 = s3;
        System.out.println("s2 после начала работы метода: "+s2.name);
    }

    public static void changeName (Student s1) {
        s1.name = "Alex";
    }


    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 3, 87.5);
        System.out.println("Info student one: " + st1.name + st1.course + st1.grade);
        Student st2 = new Student("Petr", 2, 48.2);
        System.out.println("Info student two: " + st2.name + st2.course + st2.grade);

        swap(st1, st2); // не работает
        System.out.println("Change info student one: " + st1.name + st1.course + st1.grade);
        System.out.println("Change info student two: " + st2.name + st2.course + st2.grade);

        changeName(st1);
        System.out.println(st1.name);
    }
} /* Output:
     Info student one: Ivan387.5
     Info student two: Petr248.2
     s2 до начала работы метода: Petr
     s2 после начала работы метода: Ivan
     Change info student one: Ivan387.5
     Change info student two: Petr248.2
     Alex
*///:~


