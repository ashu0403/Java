package com.jap.prime;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class PrimeCheckerImpl {
    public boolean primeNumberCheck(int number) {
        // write the logic here to check is a number is prime or not
        // int count = 0;
        // if (number == 0 || number == 1) {
        // return false;
        // }
        // for (int i = 2; i < number; i++) {
        // if (number % 2 == 0) {
        // count++;
        // }

        // }
        // if (count == 0) {
        // return true;
        // }
        // return false;
        IntPredicate isDivisible = index -> number % index == 0;
        return number > 1 && IntStream.range(2, number - 1).noneMatch(isDivisible);
    }

}
