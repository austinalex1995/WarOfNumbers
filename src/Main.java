import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[] {
                1,2,3,4,5,7,9
        };
        int[] array2 = new int[] {
                1,2,3,4,5,6,7,8,9,10
        };
        int[] array3 = new int[] {
                4,6,8,10,11,13,15
        };
        System.out.println(evenOddsWar(array3));

    }

    private static int evenOddsWar(int[] arr) {

        ArrayList<Integer> evens = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        for (int i : arr) {
            if (i % 2 == 0) {
                evens.add(i);
            } else {
                odds.add(i);
            }
        }

        int sumOfEvens = 0;
        for (Integer i : evens) {
            sumOfEvens += i;
        }
        int sumOfOdds = 0;
        for (Integer i : odds) {
            sumOfOdds += i;
        }

        return (sumOfEvens - sumOfOdds);

    }

}