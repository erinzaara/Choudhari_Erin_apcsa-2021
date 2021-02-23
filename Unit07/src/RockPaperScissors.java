//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import java.util.Random;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("R");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		
		Random rand = new Random();
		int num = rand.nextInt(3);
		if (num == 0) {
			compChoice = "R";
		}
		if (num == 1) {
			compChoice = "P";
		}
		if (num == 2) {
			compChoice = "S";
		}
	}

	public String determineWinner()
	{
		String winner="";
		
		if (compChoice == "R") {
			if (playChoice.equals("S")) {
				winner = "Computer";
			}
			if (playChoice.equals("P")) {
				winner = "Player";
			}
		}
		
		else if (compChoice == "P") {
			if (playChoice.equals("R")) {
				winner = "Computer";
			}
			if (playChoice.equals("S")) {
				winner = "Player";
			}
		}
		
		else if (compChoice == "S") {
			if (playChoice.equals("P")) {
				winner = "Computer";
			}
			if (playChoice.equals("R")) {
				winner = "Player";
			}
		}
		
		return winner;
	}

	public String toString()
	{
		String output="Player had " + playChoice + "\n" + "Computer had " + compChoice + "\n";
		
		if (determineWinner().equals("")){
			output += "!Draw game!";
		}
		if (determineWinner().equals("Computer")){
			if (compChoice  == "R") {
				output += "!Computer wins <<Rock Breaks Scissors>>! \n";
			}
			if (compChoice  == "P") {
				output += "!Computer wins <<Paper Covers Rock>>! \n";
			}
			if (compChoice  == "S") {
				output += "!Computer wins <<Scissors Cuts Paper>>! \n";
			}
		}
		if (determineWinner().equals("Player")){
			if (compChoice  == "R") {
				output += "!Player wins <<Rock Breaks Scissors>>! \n";
			}
			if (compChoice  == "P") {
				output += "!Player wins <<Paper Covers Rock>>! \n ";
			}
			if (compChoice  == "S") {
				output += "!Player wins <<Scissors Cuts Paper>>! \n";
			}
		}
		
		return output;
	}
}