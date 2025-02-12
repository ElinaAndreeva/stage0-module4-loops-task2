package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 0;
        int primeCheckNumber;
        int divisibleCount;
        while (counter <= printToInclusive) {
            divisibleCount = 0;
            primeCheckNumber = 2;
            while (primeCheckNumber <= counter / 2) {
                if (counter % primeCheckNumber == 0) {
                    divisibleCount++;
                    break;
                }
                primeCheckNumber++;
            }
            if (divisibleCount == 0 && counter != 1 && counter !=0) {
                System.out.print(counter);
            }
            counter++;
        }
    }
}
