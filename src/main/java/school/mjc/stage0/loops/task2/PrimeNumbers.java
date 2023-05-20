package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number = 0;
        while (number <= printToInclusive) {
            int i = 2;
            boolean isPrime = true;
            while (i < number && isPrime) {
                if (number % i == 0) isPrime = false;
                i++;
            }
            if (isPrime && number >= 2) System.out.println(number);
            number++;
        }
    }
}
