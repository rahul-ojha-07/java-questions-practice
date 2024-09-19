package in.rahulojha.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

    public JavaStreams() {
        List<Integer> numbers = IntStream.rangeClosed(1,10).boxed().toList();
        List<Integer> midNumbers = numbers.stream().map(num -> num * 2).toList();
        List<String> strings = List.of("this", "is", "a", "sample", "string");
//        q1(numbers);
        q2(numbers);
        q3(strings);
        q4(numbers);
        q5(strings);
        q6(numbers.stream());
        q7(strings.stream());
        q8(numbers);
        q8(midNumbers);
        q9();
        q10_1();
        q10_2();
    }



    /***
     * Create a Stream from a List of integers and print each element.
     */
    public void q1(List<Integer> numbers) {

        numbers.stream().forEach(System.out::println);
    }


    /***
     * Filter a Stream of integers to only include even numbers.
     */
    public void q2(List<Integer> numbers) {
        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0)
                .toList();
        printList(evenNumbers);
    }

    /**
     * Convert a Stream of strings to uppercase.
     */
    public void q3(List<String> strings) {
        List<String> capsStrings = strings.stream()
                .map(String::toUpperCase)
                .toList();
        printList(capsStrings);
    }


    /***
     * Find the first element in a Stream of integers.
     */
    public void q4(List<Integer> numbers) {
        Optional<Integer> first = numbers.stream()
                .findFirst();
        if (first.isPresent()) {
            printValue(first.get());
        } else {
            printValue("No Value");
        }
    }


    /***
     * Sort a Stream of strings in alphabetical order.
     */
    public void q5(List<String> strings) {
        List<String> sortedStrings = strings.stream().sorted(String::compareTo).toList();
        printList(sortedStrings);

    }

    /***
     * Convert a Stream of integers to a List.
     */
    public void q6(Stream<Integer> numberStream) {
        List<Integer> numbers = numberStream.toList();
        printList(numbers);
    }


    /***
     * Count the number of elements in a Stream of strings.
     */
    public void q7(Stream<String> stringStream) {
        long count = stringStream.count();
        printValue(count);
    }

    /***
     * Check if any element in a Stream of integers is greater than 10.
     */
    public void q8(List<Integer> numbers) {
        boolean isGreaterThan10 = numbers.stream().anyMatch(num -> num > 10);
        printValue(isGreaterThan10);
    }

    /***
     * Create a Stream from an array of integers and sum all the elements.
     */
    public void q9() {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int sum = Arrays.stream(arr).sum();
        printValue(sum);
    }

    /***
     * Generate a Stream of the first 10 natural numbers.
     */

    public void q10_1() {
        IntStream intStream = IntStream.rangeClosed(1,10);
        printList(intStream.boxed().toList());
    }
    public void q10_2() {
        Stream<Integer> numberString = Stream.iterate(1, n -> n+1)
                        .limit(10);
        printList(numberString.toList());
    }


    /***
     *  print a given list
     * @param list
     * @param <T>
     */
    public <T> void printList(List<T> list) {
        StringBuilder stringBuilder = new StringBuilder();
        for (T item: list) {
            stringBuilder.append(item.toString()).append(" ");
        }
        System.out.println(stringBuilder.toString());
    }

    /***
     *  print a given value
     * @param value
     */
    public <T> void printValue(T value) {
        System.out.println(value);
    }
}
