package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int fact = 1;
        int multi = 1;
        while (multi < printToInclusive) {
            fact*=multi;
            multi++;
            System.out.println(fact + '\n');
        }
    }
}
