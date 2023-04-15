package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        } else {
            int loop = 0;
            long result = 1;
            System.out.println(1);
            while(loop < power) {
                    result = 2 * result;
                    loop++;
                System.out.println(result);
            }
        }
    }
}
