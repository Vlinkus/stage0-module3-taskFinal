package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int result = number % 10 * 100 + number / 10 % 10 * 10 + number / 100 ;
        System.out.println(result);
    }
}
