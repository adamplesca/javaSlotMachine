import javax.swing.JOptionPane;

public class numberMania {
    public static void main(String[] args) {
        
        int userGuess;
        int balance = 0;

        Logic myLogic = new Logic();

        if(balance <= 0){
            balance = Integer.parseInt(JOptionPane.showInputDialog(null, "You have " + balance + "in your account"));
            myLogic.setBalance();
        }
        userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Pick a number between 1-10"));
        myLogic.setGuess(userGuess);

        myLogic.numbersGenerator();

        //myLogic.numberMultiplier();

        System.out.println("Number you  was: " + myLogic.getWinnings());

        JOptionPane.showMessageDialog(null,"Your guess was: " + userGuess + "\n " + "|"  + myLogic.getRanNum1() + "|" + myLogic.getRanNum2() + "|" +  myLogic.getRanNum3() + "|" + "\n " +  "Your total winnings so far : " + myLogic.getWinnings() + "\n " +  "Your balance remaining : " + myLogic.getBalance());
    }
}
