package Z1_Z5;

import java.time.Duration;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Algorithms1 a = new Algorithms1();
        System.out.println("Wynik potęgowania: " + a.power(3,4));

        System.out.println("Suma cg: " + a.geoSequence(2,2,4));
        System.out.println("Suma ca: " + a.algSequence(2,2,4));
        System.out.println("Czy doskonała: " + a.perfectNum(11));
        System.out.println("Czy doskonała: " + a.perfectNum(28));
        System.out.println("NWD: " + a.getNWD(12, 9));
        System.out.println("NWD: " + a.getNWD(11, 13));
        System.out.println("NWD: " + a.getNWD(6, 12));
        System.out.println("DtB: " + a.decimalToBinary(12));
        System.out.println("DtB: " + a.decimalToBinary(17));
        System.out.println("BtD: " + a.binaryToDecimal("1100"));
        System.out.println("Primary: " + a.isPrimary(13));
        System.out.println("Primary: " + a.isPrimary(1));
        a.getPrimaryNumbers(10);
        LocalTime lt_start = LocalTime.now();
        System.out.println("Wynik silni: " + a.factorial(10));
        LocalTime lt_stop = LocalTime.now();
        LocalTime lt_start_r = LocalTime.now();
        System.out.println("Wynik silni rec: " + a.factorialRec(10));
        LocalTime lt_stop_r = LocalTime.now();
        System.out.println("TIME: " + Duration.between(lt_start,lt_stop));
        System.out.println("TIME REC: " + Duration.between(lt_start_r,lt_stop_r));


    }
}
