public class TwelveInts {
    public static void main(String args[]){
        int[] numbers = {21,44,63,34,23,56,43,22,65,55,76,85,45};

        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        for (int a = 12; a <= numbers.length; a--){
            System.out.print(numbers[a] + " ");
        }
    }
}
