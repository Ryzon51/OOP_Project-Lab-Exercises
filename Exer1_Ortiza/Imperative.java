import java.util.ArrayList;
import java.util.List;

public class Imperative {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = new ArrayList<>();

   
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

 
        for (int even : evenNumbers) {
            System.out.println(even);
        }
    }
}
