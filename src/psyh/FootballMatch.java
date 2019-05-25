package psyh;

public class FootballMatch {

    static int resultOfFM (int firstGame, int secondGame, int firstRate, int secondRate) {
        return firstGame == firstRate && secondGame == secondRate ? 2 :
               firstGame > secondGame && firstRate > secondRate ||
               firstGame < secondGame && firstRate < secondRate ||
               firstGame == secondGame && firstRate == secondRate ? 1 : 0;
    }
    //We could communicate, but there wasn't this task and I don't want to do copy/paste operations. So, next time!
    public static void main(String[] args) {
        System.out.println("Result of your rate for this football match is: " +
                " " + resultOfFM(4,1, 7, 2 ));
    }
}
