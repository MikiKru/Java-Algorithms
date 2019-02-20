package Z1;

public class Main {
    public static void main(String[] args) {
        Algorithms1 a = new Algorithms1();
        System.out.println("Wynik potęgowania: " + a.power(3,4));
        System.out.println("Wynik silni: " + a.factorial(4));
        System.out.println("Suma cg: " + a.geoSequence(2,2,4));
        System.out.println("Suma ca: " + a.algSequence(2,2,4));
    }
}
