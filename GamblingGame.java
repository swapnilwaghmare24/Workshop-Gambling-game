package Workshop2;
public class GamblingGame {
    void gameStart() {
        int totalWinLose = 0;
        for (int day = 1; day <= 20; day++) {
            int amount = 100;
            while (amount < 150 && amount > 50) {
                int winLose = (int) ((Math.random()) * 10) % 2;
                if (winLose == 1) {
                    amount = amount + 1;
                    totalWinLose = totalWinLose + 1;
                } else {
                    amount = amount - 1;
                    totalWinLose = totalWinLose - 1;
                }

            }
            System.out.println("Available Money on Day "+day+ " is " +amount);
        }
        System.out.println("Total winning or losing amount is " +totalWinLose);
    }
    public static void main(String[] args) {
        System.out.println("Welcome to gambling game program");
        GamblingGame gm = new GamblingGame();
        gm.gameStart();
    }

}