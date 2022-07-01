package streams;

import java.util.List;
import java.util.ArrayList;

public class Streams01 {
    
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(7);
        numbers.add(9);
        numbers.add(4);
        numbers.add(6);
        numbers.add(3);
        numbers.add(12);
        numbers.add(888);

        numbers.stream().limit(5).filter(number -> number % 2 == 0).forEach(System.out::println);

    }
}
