package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int skippedSum = 0, countedSum = 0;
        if (lastInRow >= 0 ) {
            if (numberToSkip <= lastInRow) {
                for (int i = 1; i <= lastInRow; i++) {
                    if (i <= numberToSkip)
                        skippedSum += i;
                    else
                        countedSum += i;
                }
                System.out.println("skipped sum is " + skippedSum);
                System.out.println("counted sum is " + countedSum);
            } else
                System.out.println("number to skip is bugger then the last");
        } else
            System.out.println("last number in row is negative");
    }
}
