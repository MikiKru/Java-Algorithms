package Z1;

public class Algorithms1 {
    // algorytm potęgowania
    public int power(int x, int y){
        // 2
        int result = 1;
        // 3
        for(int i = 1; i <= y; i++ ){
            result = result * x;
        }
        return result;
    }
    // algorytm silnia z n
    public int factorial(int n){
        // 2
        int result = 1;
        // 3
        for(int i = n; i > 1; i--){
            result = result * i;
        }
        return result;
    }
    // algorytm ciągu geometrycznego
    public int geoSequence(int a0, int q, int n){
        int sum = 0;
        for(int i = 0; i <= n-1; i++){
            sum = sum + (a0 * power(q, i));
        }
        return sum;
    }
    // algorytm ciągu arytmetycznego
    public int algSequence(int a0, int r, int n){
        int sum = 0;
        for(int i = 0; i <= n-1; i++){
            sum = sum + (a0 + i*r);
        }
        return sum;
    }
    public boolean perfectNum(int num){
        int sum = 0;
        for (int i = 1; i < num; i++){
            if (num % i == 0){
                sum = sum + i;
            }
        }
        return num == sum ? true : false;
    }
    public int getNWD(int x, int y){
        // 1. sprawdzenie większej i mniejszej
        int less = x;
        int greather = y;
        if(x > y){
            less = y;
            greather = x;
        }
        // 2. Iterujemy w pętli i sprawdzamy czy dzielnik less
        // jest też dzielnikiem greather
        for(int i = less; less > 1; i--){
            if(less % i == 0 && greather % i == 0){
                return i;
            }
        }
        return 1;
    }
    public String decimalToBinary(int decimal){
        String binary = "";
        while (decimal >= 1){
            binary = binary.concat(String.valueOf(decimal % 2));
            decimal = decimal / 2;
        }
        // odwrócenie liczby
        // String Buffer pozwala na modyfikację zawartości tablicy String
//        StringBuffer sb = new StringBuffer(binary);
//        return sb.reverse().toString();
        return new StringBuffer(binary).reverse().toString();
    }

    public int binaryToDecimal(String binary){
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++){
            decimal = decimal + (((int)binary.charAt(i)-48) * power(2, (binary.length()-1) - i));
        }
        return decimal;
    }
    public boolean isPrimary(int number){
        // 1. Inicjalizacja licznika podzielników
        int counter = 0;
        // 2. W pętli for zliczamy wszystkie liczby naruralne do liczby number
        // Każdorazowo sprawdzając w instrukcji if czy te liczby są dzielnikami number
        // TAK - licznik ++
        // NIE - nic
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                counter++;
            }
        }
        // 3. zwracamy true jeżeli licznik == 0 : false jesżeli licznik > 0
        return counter == 0 ? true : false;
    }
}
