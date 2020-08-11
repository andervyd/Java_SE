package homeworks.lesson_02.task_01;

public class Main {
    public static void main(String[] args) {

        // byte = 12 (DEC, BIN, OCT, HEX)
        byte bt1 = 12;
        byte bt2 = 0b1100;
        byte bt3 = 014;
        byte bt4 = 0xC;
        System.out.println("DEC: " + bt1 + " BIN: " + bt2 + " OCT: " + bt3 + " HEX: " + bt4);

        // short = -1300 (DEC, BIN, OCT, HEX)
        short st1 = -1300;
        short st2 = -0b10100010100;
        short st3 = -02424;
        short st4 = -0x514;
        System.out.println("DEC: " + st1 + " BIN: " + st2 + " OCT: " + st3 + " HEX: " + st4);

        // int = 0 (DEC, BIN, OCT, HEX)
        int it1 = 0;
        int it2 = 0b0;
        int it3 = 00;
        int it4 = 0x0;
        System.out.println("DEC: " + it1 + " BIN: " + it2 + " OCT: " + it3 + " HEX: " + it4);

        // long = 123456789 (DEC, BIN, OCT, HEX)
        long lg1 = 123456789L;
        long lg2 = 0b111010110111100110100010101L;
        long lg3 = 0726746425L;
        long lg4 = 0x75BCD15L;
        System.out.println("DEC: " + lg1 + " BIN: " + lg2 + " OCT: " + lg3 + " HEX: " + lg4);
    }
} /* Output:
     DEC: 12 BIN: 12 OCT: 12 HEX: 12
     DEC: -1300 BIN: -1300 OCT: -1300 HEX: -1300
     DEC: 0 BIN: 0 OCT: 0 HEX: 0
     DEC: 123456789 BIN: 123456789 OCT: 123456789 HEX: 123456789
*///:~