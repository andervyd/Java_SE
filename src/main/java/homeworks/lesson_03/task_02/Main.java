package homeworks.lesson_03.task_02;

public class Main {
    public static void main(String[] args) {

        int a = 5;
        int aR = a-- - --a + ++a + a++ +a; // 5 - 3 + 4 + 4 + 5 = 15
        System.out.println("Result aR = " + aR);

        int b = 8;
        int bR = ++b - b++ + ++b - --b; // 9 - 9 + 11 - 10 = 1
        System.out.println("Result bR = " + bR);
    }
} /* Output:
     Result aR = 15
     Result bR = 1
*///:~