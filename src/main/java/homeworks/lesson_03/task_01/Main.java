package homeworks.lesson_03.task_01;

public class Main {
    public static void main(String[] args) {

        int i1 = 5;
        int i2 = 11;
        double d1 = 5.5;
        double d2 = 1.3;
        long l = 20L;
        double result = d2%i1;

        result = i2 / d1 + d2 % i1 - l;
        System.out.println("result = " + result);
    }
} /* Output:
     result = -16.7
*///:~