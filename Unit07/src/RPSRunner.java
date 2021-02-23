//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response = "Y";
		
		while (response.equals("Y")){
		
			String player = "";
		
			out.print("type in your prompt [R,P,S] :: ");
			String play = keyboard.next();
		
			RockPaperScissors game = new RockPaperScissors(play);
			out.print(game);
			
			out.print("Do you want to play again?(Y/N) ");
			response = keyboard.next();
		}
	}
}



