import java.util.Random;

public class Logic {
    
    private int guess, userInput,  balance,  totalWinnings;
    private int ranNum1, ranNum2, ranNum3;

    Random random = new Random();

    public Logic(){
        guess = 0;
        balance = 0;
        totalWinnings = 0;

        ranNum1 = 0;
        ranNum2 = 0;
        ranNum3 = 0;
    }

    //setter for user guess
    public void setGuess(int guess){
        this.guess = guess;
    }

    //setting and adding balance to user app
    public void setBalance(int balance){
        this.balance = balance;
    }
    public int addBalance(){
        balance = balance + userInput;
        return balance;
    }

    // Generates three random numbers
    public void numbersGenerator(){
        ranNum1 = random.nextInt(10) + 1;
        ranNum2 = random.nextInt(10) + 1;
        ranNum3 = random.nextInt(10) + 1;
    }

    //number multiplyer
    public void numberMultiplier(){
            if(guess == ranNum1){
                guess *= ranNum1;
            }else if(guess == ranNum2){
                guess *= ranNum2;
            }else if(guess == ranNum3){
                guess *= ranNum3;
            }
    }

    //returning random generated numbers
    public int getRanNum1(){
        return ranNum1;
    }
    public int getRanNum2(){
        return ranNum2;
    }
    public int getRanNum3(){
        return ranNum3;
    }


    public int getWinnings(){
        return totalWinnings;
    }
    public int getBalance(){
        return balance;
    }
}