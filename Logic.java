import java.util.Random;

public class Logic {

    private int guess, balance, totalWon;
    private int ranNum1, ranNum2, ranNum3;
    private int roundWinnings;

    Random random = new Random();

    public Logic() {
        guess = 0;
        balance = 0;
        totalWon = 0;

        ranNum1 = 0;
        ranNum2 = 0;
        ranNum3 = 0;
    }

    // Setter for user bet
    public void setGuess(int guess) {
        this.guess = guess;
    }

    // Setting and adding balance to user account
    public void setBalance(int balanceInput) {
        this.balance += balanceInput;
    }

    // Generates three random numbers
    public void numbersGenerator() {
        ranNum1 = random.nextInt(5) + 1;
        ranNum2 = random.nextInt(5) + 1;
        ranNum3 = random.nextInt(5) + 1;
    }

    // Earnings multipler 
    public void numberMultiplier() { //TODO, IF HITS MORE THAN ONCE WILL ONLY GIVE AMOUNT FOR ONE (DOESNT ACCUMLATE 2/3)
        balance -= guess;
        roundWinnings = 0;
        if (guess == ranNum1) {
            roundWinnings = guess * ranNum1;
        } else if (guess == ranNum2) {
            roundWinnings = guess * ranNum2;
        } else if (guess == ranNum3) {
            roundWinnings = guess * ranNum3;
        }
        //if()
        totalWon += roundWinnings;
        balance += roundWinnings;
    }

    // Returning random generated slot numbers
    public int getRanNum1() {
        return ranNum1;
    }
    public int getRanNum2() {
        return ranNum2;
    }
    public int getRanNum3() {
        return ranNum3;
    }

    // Gets winnings for that round
    public int getRoundWinnings() {
        return roundWinnings;
    }

    // Gets total winnings so far
    public int getTotalWinnings() {
        return totalWon;
    }

    // Total balance of player
    public int getBalance() {
        return balance;
    }
}