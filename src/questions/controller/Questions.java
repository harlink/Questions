package questions.controller;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Questions 
{
	private Scanner myScanner;
	
	public Questions()
	{
		myScanner = new Scanner(System.in);
		
	}
	
	public void start()
	{
		askQuestionsGUI();
		askQuestions();
		
	}
	
	private void askQuestions()
	{
		//System.out.println("Hello");
		//System.out.println("What do you like to do for fun?");
		//String answer = myScanner.nextLine();
		//System.out.println("That's cool");
		//System.out.println("Do you have a favorite food?");
		//myScanner.nextLine();
		//if (answer.contentEquals("yes"))
		//{
		//	System.out.println("What's your favorite food?");
		//}
		//else
		//{
		//	System.out.println("oh that's lame");
			
	}
	 private void askQuestionsGUI()
	 {
		 JOptionPane.showMessageDialog(null, "Hello, what do you like for breakfast?");
		 String myAnswer = JOptionPane.showInputDialog(null, "Hello, what do you like for brealfast?");
		 JOptionPane.showMessageDialog(null, "oh I don't really like " + myAnswer + " but that's just my opinion");
		 myAnswer = JOptionPane.showInputDialog(null, "What's your favorite food?");
		 myAnswer = JOptionPane.showInputDialog(null, "I like " + myAnswer + " as well");
	 }
}
