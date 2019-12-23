import javax.swing.JOptionPane;

public class TestClass {

	public static void main(String[] args) {
		Name name = new Name("Brandon", "M", "Blake", null); //My personal signature, very professional.
		Date date = new Date(6, 29, 17);

		int x = 0;
		int choice;
		String input;
		Player[] player = new Player[50]; //Hand create 50 Player Objects.

		player[0] = new Player("Aunt Vera", "Jan. 7th.", 100);
		player[1] = new Player("George Tomacloty", "Apr. 12th.", 59);
		player[2] = new Player("Senator Burns", "May 21st.", 250);
		player[3] = new Player("Poor Man Joe", "Oct. 25th.", 4);
		player[4] = new Player("Very Poor Man Joe", "Oct. 26th.", 1);
		player[5] = new Player("Carl Wheezer", "Jun. 5th.", 20);
		player[6] = new Player("A Rich Dog", "Mar. 18th.", 400);
		player[7] = new Player("A Man With No Kids and 3 Money", "May 12th.", 3);
		player[8] = new Player("Aunt Vera's Evil Clone", "Jan. 7th.", 101);
		player[9] = new Player("Your Neighbor", "Dec. 12th.", 28);
		player[10] = new Player("Senator John Jackson", "Jul. 23rd.", 150);
		player[11] = new Player("Senator Jack Johnson", "Jul. 23rd.", 150);
		player[12] = new Player("Richard Nixon", "Jan. 9.", 147);
		player[13] = new Player("Doctor Zoidberg", "Feb. 16th.", 6);
		player[14] = new Player("Phillip J. Fry", "Jun. 4th.", 15);
		player[15] = new Player("Turanga Leela", "Sept. 21st.", 40);
		player[16] = new Player("Bender Bending Rodriguez", "Apr. 1st.", 300);
		player[17] = new Player("Nibbler", "The day the universe was made.", 156);
		player[18] = new Player("The Professor", "Nov. 14th.", 99);
		player[19] = new Player("Amy Wong", "Apr. 7th.", 1000);
		player[20] = new Player("Hermes Conrad", "Aug. 17th.", 58);
		player[21] = new Player("Mom Santo", "Jan. 25th.", 736);
		player[22] = new Player("Scruffy", "Apr. 27th.", 124);
		player[23] = new Player("A Guy Really Pulling For Names", "Apr. 7th.", 36);
		player[24] = new Player("Tom the Cat", "Aug. 21st.", 26);
		player[25] = new Player("Jerry the Mouse", "Sept. 14th.", 54);
		player[26] = new Player("Spike the Dog", "Dec. 5th.", 72);
		player[27] = new Player("Mr. Orange", "Jul. 8th.", 142);
		player[28] = new Player("Mr. Blue", "Jun. 27th.", 122);
		player[29] = new Player("Mr. White", "Aug. 1st.", 160);
		player[30] = new Player("Mr. Blonde", "Nov. 17th.", 79);
		player[31] = new Player("Mr. Pink", "Jan. 21st.", 20);
		player[32] = new Player("Mr. Brown", "Mar. 23rd", 98);
		player[33] = new Player("An Actual Fish", "Sept. 7th.", 14);
		player[34] = new Player("An Elephant", "Dec. 12th.", 25);
		player[35] = new Player("Random Name", "Oct. 7th.", 177);
		player[36] = new Player("Luckiest Person Alive", "May 18th.", 777);
		player[37] = new Player("The Monopoly Guy", "May 14th.", 2500);
		player[38] = new Player("Your Greatest Enemy", "Feb. 17th.", 200);
		player[39] = new Player("Random Name's Friend", "Feb. 25th.", 153);
		player[40] = new Player("T.V Show Reference", "Oct. 27th.", 28);
		player[41] = new Player("Aunt Vera's Evil Clone's Evil Clone", "Jan. 7th", 102);
		player[42] = new Player("Shane", "Jul. 8th", 48);
		player[43] = new Player("Anthony", "Aug. 13th.", 26);
		player[44] = new Player("Tina", "Dec. 26th.", 162);
		player[45] = new Player("A Guy Officially Out of Names", "Apr. 7th.", 36);
		player[46] = new Player("A Bench", "Sept. 2nd.", 384);
		player[47] = new Player("A Painting", "Nov. 1st.", 251);
		player[48] = new Player("A Table", "Apr. 3rd.", 494);
		player[49] = new Player("A Cloud", "Jan. 7th.", 10);

		JOptionPane.showMessageDialog(null, "Time to pick your Player!");

		do { // Have user cycle through which player they want to use.

			input = JOptionPane.showInputDialog("Player Name: " + player[x].name + ", Birthday: " + player[x].birthday
					+ ", Money: " + player[x].moneyBalance + ".", "1 for next, 2 to pick this player.");
			choice = Integer.parseInt(input);

			switch (choice) {

			case 1:
				if (x == 49) {
					break;
				}

				x++;

			default: // Repeat loop if 1 or 2 isn't input.
				break;
			}

		} while (choice != 2); // End of Do loop
		
		SlotMachine lucky777 = new SlotMachine("Lucky 777", 5000, 0, 10000, 5000, 0, 10, 5); // Create 3 SlotMachine objects.
		SlotMachine luckyLotto = new SlotMachine("Lucky Lotto", 55000, 0, 100000, 75000, 0, 50, 25);
		SlotMachine purplePeopleEater = new SlotMachine("Purple People Eater", 1000, 0, 50, 40, 0, 5, 2);
		int beginning; // For before the dollar is given to machine.
		int ending; // For after dollar is given to machine.
		int jackpot; // To test for jackpot.
		int win; // To test for regular win.
		
		JOptionPane.showMessageDialog(null, "Time to play! Each spin costs $1.");

		do {

			input = JOptionPane.showInputDialog("0: Quit" + "\n1: " + lucky777.machineName + "\n2: " + luckyLotto.machineName
					+ "\n3: " + purplePeopleEater.machineName, "Put number of slot machine here.");
			choice = Integer.parseInt(input); // Let user pick their machine.

			switch (choice) {

			case 1:
				if(lucky777.machineBalance == 0){ // Test if machine is out of money and if it is, send back to beginning.
					JOptionPane.showMessageDialog(null, "This machine is out of money!");
					break;
				}
				
				beginning = player[x].moneyBalance;
				player[x].moneyBalance--; // Take a dollar from player.
				lucky777.machineBalance++; // Give a dollar to machine.
				jackpot = (int) (Math.random() * lucky777.jackpotOdds + 1); // Generate random number between 1 and lucky777's jackpot odds.
				win = (int) (Math.random() * lucky777.regularWinOdds + 1); // Generate random number between 1 and lucky777's regular win odds.
				
				if(jackpot == 777){ // Jackpot wining number.
					if(lucky777.jackpotPay > lucky777.machineBalance){ // See if the pay will be more than the machine has, if so give whatever the machine has and set balance to 0.
						player[x].moneyBalance = player[x].moneyBalance + lucky777.machineBalance;
						lucky777.machineBalance = 0;
						ending = player[x].moneyBalance;
						JOptionPane.showMessageDialog(null, "Jackpot! You've emptied the machine! Your starting money was $" + beginning + " and now your money is $" + ending);
						break;
					}
					else{ // If pay isn't more than machine has, give player jackpot pay.
						player[x].moneyBalance = player[x].moneyBalance + lucky777.jackpotPay;
						lucky777.machineBalance = lucky777.machineBalance - lucky777.jackpotPay;
						ending = player[x].moneyBalance;
						JOptionPane.showMessageDialog(null, "Jackpot! Your starting money was $" + beginning + " and now your money is $" + ending);
						break;
					}
				}
				if(win == 7){ // Regular wining number.
					if(lucky777.regularPay > lucky777.machineBalance){ // See if pay is more than the machine has, if so give whatever machine has and set balance to 0.
						player[x].moneyBalance = player[x].moneyBalance + lucky777.machineBalance;
						lucky777.machineBalance = 0;
						ending = player[x].moneyBalance;
						JOptionPane.showMessageDialog(null, "Win! You've emptied the machine! Your starting money was $" + beginning + " and now your money is $" + ending);
						break;
					}
					else{ // If pay isn't more than the machine has, give player regular pay.
						player[x].moneyBalance = player[x].moneyBalance + lucky777.regularPay;
						lucky777.machineBalance = lucky777.machineBalance - lucky777.regularPay;
						ending = player[x].moneyBalance;
						JOptionPane.showMessageDialog(null, "Win! Your starting money was $" + beginning + " and now your money is $" + ending);
						break;
					}
				}
				ending = player[x].moneyBalance; // If player doesnt win jackpot or regular, display a losing screen.
				JOptionPane.showMessageDialog(null, "Lose! Your starting money was $" + beginning + " and now your money is $" + ending);
				break;
				
			case 2: // Essentially the same as case 1, just different objects.
				if(luckyLotto.machineBalance == 0){
					JOptionPane.showMessageDialog(null, "This machine is out of money!");
					break;
				}
				
				beginning = player[x].moneyBalance;
				player[x].moneyBalance--;
				luckyLotto.machineBalance++;
				jackpot = (int) (Math.random() * luckyLotto.jackpotOdds + 1);
				win = (int) (Math.random() * luckyLotto.regularWinOdds + 1);
				
				if(jackpot == 56789){
					if(luckyLotto.jackpotPay > luckyLotto.machineBalance){
						player[x].moneyBalance = player[x].moneyBalance + luckyLotto.machineBalance;
						luckyLotto.machineBalance = 0;
						ending = player[x].moneyBalance;
						JOptionPane.showMessageDialog(null, "Jackpot! You've emptied the machine! Your starting money was $" + beginning + " and now your money is $" + ending);
						break;
					}
					else{
						player[x].moneyBalance = player[x].moneyBalance + luckyLotto.jackpotPay;
						luckyLotto.machineBalance = luckyLotto.machineBalance - luckyLotto.jackpotPay;
						ending = player[x].moneyBalance;
						JOptionPane.showMessageDialog(null, "Jackpot! Your starting money was $" + beginning + " and now your money is $" + ending);
						break;
					}
				}
				if(win == 23){
					if(luckyLotto.regularPay > luckyLotto.machineBalance){
						player[x].moneyBalance = player[x].moneyBalance + luckyLotto.machineBalance;
						luckyLotto.machineBalance = 0;
						ending = player[x].moneyBalance;
						JOptionPane.showMessageDialog(null, "Win! You've emptied the machine! Your starting money was $" + beginning + " and now your money is $" + ending);
						break;
					}
					else{
						player[x].moneyBalance = player[x].moneyBalance + luckyLotto.regularPay;
						luckyLotto.machineBalance = luckyLotto.machineBalance - luckyLotto.regularPay;
						ending = player[x].moneyBalance;
						JOptionPane.showMessageDialog(null, "Win! Your starting money was $" + beginning + " and now your money is $" + ending);
						break;
					}
				}
				ending = player[x].moneyBalance;
				JOptionPane.showMessageDialog(null, "Lose! Your starting money was $" + beginning + " and now your money is $" + ending);
				break;
				
			case 3: // Essentially the same as Case 1, just different objects.
				if(purplePeopleEater.machineBalance == 0){
					JOptionPane.showMessageDialog(null, "This machine is out of money!");
					break;
				}
				
				beginning = player[x].moneyBalance;
				player[x].moneyBalance--;
				purplePeopleEater.machineBalance++;
				jackpot = (int) (Math.random() * purplePeopleEater.jackpotOdds + 1);
				win = (int) (Math.random() * purplePeopleEater.regularWinOdds + 1);
				
				if(jackpot == 28){
					if(purplePeopleEater.jackpotPay > purplePeopleEater.machineBalance){
						player[x].moneyBalance = player[x].moneyBalance + purplePeopleEater.machineBalance;
						purplePeopleEater.machineBalance = 0;
						ending = player[x].moneyBalance;
						JOptionPane.showMessageDialog(null, "Jackpot! You've emptied the machine! Your starting money was $" + beginning + " and now your money is $" + ending);
						break;
					}
					else{
						player[x].moneyBalance = player[x].moneyBalance + purplePeopleEater.jackpotPay;
						purplePeopleEater.machineBalance = purplePeopleEater.machineBalance - purplePeopleEater.jackpotPay;
						ending = player[x].moneyBalance;
						JOptionPane.showMessageDialog(null, "Jackpot! Your starting money was $" + beginning + " and now your money is $" + ending);
						break;
					}
				}
				if(win == 5){
					if(purplePeopleEater.regularPay > purplePeopleEater.machineBalance){
						player[x].moneyBalance = player[x].moneyBalance + purplePeopleEater.machineBalance;
						purplePeopleEater.machineBalance = 0;
						ending = player[x].moneyBalance;
						JOptionPane.showMessageDialog(null, "Win! You've emptied the machine! Your starting money was $" + beginning + " and now your money is $" + ending);
						break;
					}
					else{
						player[x].moneyBalance = player[x].moneyBalance + purplePeopleEater.regularPay;
						purplePeopleEater.machineBalance = purplePeopleEater.machineBalance - purplePeopleEater.regularPay;
						ending = player[x].moneyBalance;
						JOptionPane.showMessageDialog(null, "Win! Your starting money was $" + beginning + " and now your money is $" + ending);
						break;
					}
				}
				ending = player[x].moneyBalance;
				JOptionPane.showMessageDialog(null, "Lose! Your starting money was $" + beginning + " and now your money is $" + ending);
				break;
				
			default:
				break;
			}

		} while (choice != 0 && player[x].moneyBalance != 0); // End of Do loop when 0 is chosen or player's money is 0.
	}

}
