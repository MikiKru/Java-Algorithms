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
}
