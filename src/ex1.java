public class ex1 {
    public static void main(String[] args){
        int [] numbers = {1, 2, 3, 4, 7, 9, 11};
        System.out.println(sum_el(numbers, 0));

    }
    public static int sum_el(int [] numbers, int element) {
        if (element + 1 == numbers.length) {
            return numbers[element];
        }
        return numbers[element] + sum_el(numbers, element + 1);
    }
}
