import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int nums[] = {1,4, 3,2,5,9};

        Main main = new Main();
        int result = main.smallestPositiveUnOccurring(nums);
        System.out.println("The smallest positive integer missing in the array is: " + result);
    }

    public int smallestPositiveUnOccurring(int[] nums) {
        Stream<Integer> integerStream = Arrays.stream(nums).boxed();
        Set<Integer> sortedSet = integerStream.sorted().collect(Collectors.toCollection(LinkedHashSet::new));

        sortedSet.forEach(n -> System.out.print(n + " "));
        System.out.println();

        int x = 1;
        while (sortedSet.contains(x)) {
            x++;
        }
        return x;
    }
}
//
