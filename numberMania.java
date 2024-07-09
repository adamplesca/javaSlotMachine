import javax.swing.JOptionPane;

public class numberMania {
    public static void main(String[] args) {

        int userGuess, balanceInput;
        Logic myLogic = new Logic();
       
        // make so user cant bet higher then random number 
        balanceInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your starting balance:"));
        myLogic.setBalance(balanceInput);

        while (true) {
            if (myLogic.getBalance() <= 0) {
                int addMore = JOptionPane.showConfirmDialog(null, "Your balance is zero. Do you want to add more money?", "Add Balance", JOptionPane.YES_NO_OPTION);
                if (addMore == JOptionPane.YES_OPTION) {
                    balanceInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the amount to add to your balance:"));
                    myLogic.setBalance(balanceInput);
                } else {
                    JOptionPane.showMessageDialog(null, "You ran out of money, brokie ");
                    break;
                }
            }

            userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Pick a number between 1-10"));
            myLogic.setGuess(userGuess);

            myLogic.numbersGenerator();
            myLogic.numberMultiplier();

            JOptionPane.showMessageDialog(null, "Your bet was:  €"
                    + userGuess
                    + "\n "
                    + "------------- |"
                    + myLogic.getRanNum1()
                    + "|"
                    + myLogic.getRanNum2()
                    + "|"
                    + myLogic.getRanNum3()
                    + "|------------- "
                    + "\n "
                    + "You won:  €" + myLogic.getRoundWinnings()
                    + "\n "
                    + "Your total winnings so far:  €" + myLogic.getTotalWinnings()
                    + "\n "
                    + "Your balance remaining:  €" + myLogic.getBalance());

            int continueGame = JOptionPane.showConfirmDialog(null, "Do you want to play again?", "Continue?", JOptionPane.YES_NO_OPTION);
            if (continueGame == JOptionPane.NO_OPTION) {
                break;
            }
        }
    }
}