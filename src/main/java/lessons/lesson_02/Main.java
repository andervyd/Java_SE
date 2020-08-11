//: 002 Lesson 2 Primitive Data Types.
// The concept of "variable".
// Numerals.
package lessons.lesson_02;

public class Main {
    public static void main(String[] args) {

        // Простые типы данных (primitive data types)
        // Структура: {тип данных - имя переменной = значение значения ;}

        // Численные (numeric)

        // Целые (integers)
        byte b1 = 10;                // 8 бит [-128; 127]
        byte b2 = -34;
        byte b3 = 126;

        short s1 = 5;                // 16 бит [-32768; 32767]
        short s2 = -10;
        short s3 = 0;

        int i1 = 34;                 // 32 бит [-2147483648; 2147483647]  !!!Default...........

        long l1 = 7890;              // 64 бит [-9223372036854775808; 9223372036854775807]
        long l2 = 1000000000L;
        long l3 = 21L;

        // Дробные (floating-point)
        float f1 = 3.14f;            // 32 бит [~1,4*10{-45}; ~3,4*10{38}]
        float f2 = 2.5f;
        float f3 = 20.0f;

        double d1 = 5.5;             // 64 бит [~4,9*10{-324}; ~1,8*10{308}] !!!Default............
        double d2 = 56.32;

        // Символьные (character)
        char c1 = 'A';               // 16 бит [0; 65535]
        char c2 = 'a';
        char c3 = '7';
        char c4 = ' ';

        char c5 = 216;              // UNICODE (Ø) DEC - десятеричная система
        char c6 = '\u1324';         // UNICODE (ጤ) HEX - шестнадцатиричная система

        // Логические (boolean)
        boolean bl1 ;               // [true; false]

        // Системы счислений

        int a1 = 60;          //  DEC - десятеричная [0 - 9]

        int a2 = 0B111100;    //  BIN - двоичная система [0, 1]  // добавляем 0b....
        int a3 = 0b111100;

        int a4 = 074;         //  OCT - восьмиричная система [0 - 7] // добавляем 0...

        int a5 = 0x3C;        //  HEX - шестнадцатиричная система [0 - F] // добавляем 0x..
        int a6 = 0X3c;

        // Underscore (нижнее подчеркивание)
        int a7 = 1_000_000;   // Разрешается разделять
    }
} /* NOT output *///:~