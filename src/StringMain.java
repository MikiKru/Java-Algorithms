import controller.StringController;

public class StringMain {
    public static void main(String[] args) {
        StringController sc = new StringController();
        System.out.println("Contains a: " + sc.isCharacter('a'));
        System.out.println("Contains y: " + sc.isCharacter('y'));
        System.out.println("Number of i: " + sc.countAllCharacters('E'));
        // Napisz metodę, która zwraca ile jest wielkich liter w tekście
        // 65 - 90 ASCII
        System.out.println("Number of upper cases: " + sc.countUpperCases());
        // Napisz metodę reverse
        System.out.println("Reverse: " + sc.reverse());
    }
}
