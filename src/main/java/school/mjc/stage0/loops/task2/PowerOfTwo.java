package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        } else {
            int multi = 0;
            while (multi <= power) {
                System.out.println(2 ^ multi);
                multi++;
            }
        }
    }
}
