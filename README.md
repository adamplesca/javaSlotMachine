# Simple Java Slot Machine Game

I realized I was getting rusty with Java and wanted to make a project to remove that rust. Always wanted to make a mini slot machine so I did. I also wanted to get better at documentation.

***
# **HOW TO PLAY**

**Welcome to the Java Slot Machine Game! Here's a quick guide to get you started:**

1. **Enter your starting balance**  

   ![Enter amount to gamble with](https://github.com/adamplesca/javaSlotMachine/assets/116078864/14332d68-bc6b-4f20-b485-18396239e0ce)  
   When you start the game, you'll be prompted to enter the amount of money you want to gamble with. This sets your initial balance.

2. **Place your bet**  

   ![Enter bet amount](https://github.com/adamplesca/javaSlotMachine/assets/116078864/9fee3ef7-bc18-4c80-9916-5f5dac0da9ee)  
   Next, you'll enter the amount you want to bet on a number between 2 and 10. Make sure to keep your bet within this range.

3. **No hit**  

   ![No hit](https://github.com/adamplesca/javaSlotMachine/assets/116078864/3c069a28-d093-48f6-a13f-2dbd10c6c52d)  
   If the number you bet on doesn't match any of the randomly generated numbers, you don't win anything for that round.

4. **1 Hit**  

   ![1 Hit](https://github.com/adamplesca/javaSlotMachine/assets/116078864/eabd5500-e39a-4e63-b3a6-0a9f449072be)  
   If your bet matches one of the three randomly generated numbers, you win an amount equal to the bet divided by 2.5, so you don't get completely crazy payouts 

5. **2 Hits**  

   ![2 Hits](https://github.com/adamplesca/javaSlotMachine/assets/116078864/2d041ed7-2129-4fac-b573-62e03ac3b498)  
   If your bet matches two of the three randomly generated numbers, you win an amount equal to your bet multiplied by both of those numbers.

6. **No hits & no more money in balance**  

   ![No hits & no more money in balance](https://github.com/adamplesca/javaSlotMachine/assets/116078864/8cb9bab0-87ff-4d2f-ba4f-d659a362b345)  
   If you run out of money and have no more funds in your balance, the game will prompt you to add more money if you want to continue playing.

7. **User can't play unless more funds are allocated**  

   ![User can't play unless more funds are allocated](https://github.com/adamplesca/javaSlotMachine/assets/116078864/4b3dafc4-1847-43e5-82e6-cea52a352e2a)  
   If you choose not to add more money, the game will end, and you won't be able to place any more bets.


    <h3>Enjoy the game and good luck! 🎰<h3>
    
***
## All versions of the game throughout production
### Version 1 
**Date:** 08/07/2024

Completed the bare bones of the **slot machine**, filled with plenty of logic bugs but had the foundation marked and set to start making it.

### Version 2
**Date:** 09/07/2024

Corrected and fine-tuned more of the game, making the code more streamlined. Some bugs were fixed but still are more to be addressed.

### Version 3
**Date:** 10/07/2024

Fixed minor and major bugs to the game. I could leave this project as is since it is now fully working how I envisioned it. Can make some more quality of life changes which I may do.

##### Bugs Fixed
- Payout calculation: player will be rewarded correctly based on their bet and if they won. *(Major)*
- Player **Bank account** fixed: will correctly take out bets player makes and give back winnings to bank. *(Major)*
- Fixed betting glitch: player can no longer bet more than the slot machine number rolls since this is how the player can win the bets.

### Version 4
**Date** 11/07/2024

##### Bugs Fixed
- Made player payouts more realistic since from playing you would win a considerable amount fairly easy.
- Also made betting €1 restricted since payouts wouldn't occur if it hit.
- Added game tutorial info
