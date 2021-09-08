import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {

        int [] numbers = {1, 2, 19, 3, 23, 45, 4, 67, 2, 6};
        int[] cutNumbers = Arrays.copyOfRange(numbers, 0, numbers.length);
        int s = numbers[numbers.length- 1];

        for(int x: cutNumbers){
            if (x > s * s){
                System.out.println(x);
            }
        }
    }
}


