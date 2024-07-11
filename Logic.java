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
        ranNum1 = random.nextInt(10) + 1;
        ranNum2 = random.nextInt(10) + 1;
        ranNum3 = random.nextInt(10) + 1;
    }

    // Earnings multipler/calculator
    public void numberMultiplier() {
        balance -= guess;
        roundWinnings = 0;
        if (guess == ranNum1 && guess == ranNum2 && guess == ranNum3) {  //all hit :0
            roundWinnings = guess * ranNum1 * ranNum2 * ranNum3;
        } else if (guess == ranNum1 && guess == ranNum2) {   //2 hits :)
            roundWinnings = guess * ranNum1 * ranNum2;
        } else if (guess == ranNum1 && guess == ranNum3) {
            roundWinnings = guess * ranNum1 * ranNum3;
        } else if (guess == ranNum2 && guess == ranNum3) {
            roundWinnings = guess * ranNum2 * ranNum3;
        } else if (guess == ranNum1) {  //only 1 hits 
            roundWinnings = guess * ranNum1;
        } else if (guess == ranNum2) {
            roundWinnings = guess * ranNum2;
        } else if (guess == ranNum3) {
            roundWinnings = guess * ranNum3;
        }
        //So the house wins in the end >:) 
        if(roundWinnings <= 10){
            totalWon += roundWinnings;
            balance += roundWinnings;
        }else{
            totalWon += roundWinnings / 2.5; 
            balance += roundWinnings / 2.5;
        }
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
        return (int)(roundWinnings / 2.5);
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