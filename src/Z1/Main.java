package Z1;

public class Main {
    public static void main(String[] args) {
        Algorithms1 a = new Algorithms1();
        System.out.println("Wynik potęgowania: " + a.power(3,4));
        System.out.println("Wynik silni: " + a.factorial(4));
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
    }
}
