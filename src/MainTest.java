import java.time.*;

public class MainTest {
    public static void main(String[] args) {
        String[] sa = {"tom ", "jerry "};
        for (int x = 0; x < 3; x++) {
//            System.out.println("\nIndex x: " + x);
            for (String s : sa) {
                System.out.print(x + " " + s);
                if (x == 1) {
                    break;
                }
            }
        }
        System.out.println();
        String [] names = {"Ala", "Ola", "Ela"};
        for (String n : names){
            System.out.println(n);
        }

        LocalDate date1 = LocalDate.of(2016, Month.JANUARY, 1);
        LocalDateTime date2 = LocalDateTime.of(2017, Month.JANUARY, 1, 1, 1);
        LocalDateTime date3 = LocalDateTime.of(2014, Month.JUNE, 10, 1, 1);
        System.out.println(date1);
        System.out.println(date2);
//        Period p = Period.between(date1, date2); --> LocalDate
//        Duration d = Duration.between(); --> LocalTime
        System.out.println(date2.compareTo(date3));

        StringBuilder s1 = new StringBuilder("Java");
        String s2 = "Love";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.append(s2));
        System.out.println(s1);
        // 0: J , 1: a, 2: v, 3: a, 4: L, 5: o, 6: v, 7:e
        String fragment = s1.substring(4);
        System.out.println(fragment);
        System.out.println(s1);

        int foundAt = s1.indexOf(s2);
        System.out.println(foundAt);





    }
}
