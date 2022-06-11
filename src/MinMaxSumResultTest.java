import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MinMaxSumResultTest {

    public void result(List<Integer> arr) {
        Collections.sort(arr);

        long max = (long)arr.get(4)+ arr.get(3)+ arr.get(2)+ arr.get(1);
        long min = (long)arr.get(0)+ arr.get(1)+ arr.get(2)+arr.get(3);
        System.out.println(min + " " + max);

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

//        List<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(3);
//        arr.add(5);
//        arr.add(7);
//        arr.add(9);
        System.out.println(arr);
        MinMaxSumResultTest minMaxSumResult = new MinMaxSumResultTest();
        minMaxSumResult.result(arr);

    }
}
