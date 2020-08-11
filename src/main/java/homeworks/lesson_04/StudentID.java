/**
 * Вывести на экран среднюю арифметическую оценку каждого студента
 * СА оценка выводится: сумма всех чисел деленная на количество чисел
 */

package homeworks.lesson_04;

public class StudentID {
    public static void main(String[] args) {

        // Student 01
        Student studentAC = new Student();

        studentAC.studentIdNum = 374859;
        studentAC.firstName = "Alex";
        studentAC.lastName = "Cooper";
        studentAC.yearStudy = 1992;
        studentAC.averRatMath = 87.3;
        studentAC.averRatEconom = 76.5;
        studentAC.averRatLang = 94.2;

        //studentAC.arithmeticMean = (studentAC.averRatMath + studentAC.averRatEconom + studentAC.averRatLang) / 3;
        System.out.println("\t"+"Вариант один");
        System.out.printf("Средняя арифметическая оценка %.1f %n", studentAC.Student(87.3, 76.5, 94.2));
        System.out.println("\t"+"Вариант два");
        studentAC.sredArifOcenka(studentAC);
        System.out.println();

        // Student 02
        Student studentMJ = new Student();

        studentMJ.studentIdNum = 735723;
        studentMJ.firstName = "Miy";
        studentMJ.lastName = "Jaycobs";
        studentMJ.yearStudy = 1995;
        studentMJ.averRatMath = 97.8;
        studentMJ.averRatEconom = 86.5;
        studentMJ.averRatLang = 78.3;

        //studentMJ.arithmeticMean = (studentMJ.averRatMath + studentMJ.averRatEconom + studentMJ.averRatLang) / 3;
        System.out.println("\t"+"Вариант один");
        System.out.printf("Средняя арифметическая оценка %.1f %n", studentMJ.Student(97.8, 86.5, 78.3));
        System.out.println("\t"+"Вариант два");
        studentMJ.sredArifOcenka(studentMJ);
        System.out.println();

        // Student 03
        Student studentJH = new Student();

        studentJH.studentIdNum = 297457;
        studentJH.firstName = "Josh";
        studentJH.lastName = "Harris";
        studentJH.yearStudy = 1993;
        studentJH.averRatMath = 57.8;
        studentJH.averRatEconom = 78.6;
        studentJH.averRatLang = 97.8;

        //studentJH.arithmeticMean = (studentJH.averRatMath + studentJH.averRatEconom + studentJH.averRatLang) / 3;
        System.out.println("\t"+"Вариант один");
        System.out.printf("Средняя арифметическая оценка %.1f %n", studentJH.Student(57.8, 78.6, 97.8));
        System.out.println("\t"+"Вариант два");
        studentJH.sredArifOcenka(studentJH);
        System.out.println();
    }
} /* Output:
        Вариант один
     Средняя арифметическая оценка 86.0
        Вариант два
     Средняя оценка студента Alex Cooper: 86.0

        Вариант один
     Средняя арифметическая оценка 87.5
        Вариант два
     Средняя оценка студента Miy Jaycobs: 87.53333333333335

        Вариант один
     Средняя арифметическая оценка 78.1
        Вариант два
     Средняя оценка студента Josh Harris: 78.06666666666666
*///:~

class Student {

    double Student(double math, double econ, double lang) { // Вариант один

        double arithmeticMean = (math+econ+lang)/3;
        return arithmeticMean;
    }

    double sredArifOcenka(Student st) { // Вариант два

        double sredOcenka = (st.averRatMath + st.averRatEconom + st.averRatLang)/3;
        System.out.println("Средняя оценка студента " + st.firstName + " " + st.lastName + ": " + sredOcenka);
        return sredOcenka;
    }

    int studentIdNum;
    String university = "INTERNATIONAL UNIVERSITY";
    String firstName;
    String lastName;
    int yearStudy;

    // Среднее значение по 100 бальной шкале
    double averRatMath;
    double averRatEconom;
    double averRatLang;
}