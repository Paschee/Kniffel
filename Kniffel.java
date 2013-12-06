// Kniffel.java © Maurice Paschke
// Version: v.-
// Date of first release: --/--/--
// Latest update: 07.12.13
// Changelog: 

import java.io.*;

public class Kniffel {

	/**
	 * @param args, Spielregeln, ISR1, BR1
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception 
	{
		String Spielregeln, TEST;
		System.out.println("\t\t\t\t\t========= KNIFFEL ========\n\n");
		
		// Spielregeln (Ja/Nein) - Internetverbindung vorrausgesetzt
		InputStreamReader ISR1 = new InputStreamReader(System.in);
		BufferedReader BR1 = new BufferedReader(ISR1);
		System.out.println("Spielregeln lesen [J/N] ?\nAchtung ! Internetverbindung benötigt:");
		Spielregeln = BR1.readLine();
		
		// Call Spielregeln
		if(Spielregeln.equals("J"))
		{
			Kniffel Jump = new Kniffel();
			Jump.Regeln();
		}
		TEST = BR1.readLine();
		System.out.println("Kam an.");
		
	}

	public void Regeln() throws Exception
	{
		// Hat einen Temporären Gyazolink, dass muss geändert werden.
		System.out.println("in Spielregeln angekommen.");
		Runtime.getRuntime().exec( "rundll32 url.dll,FileProtocolHandler " + "http://www.codeavengers.com/c/paschee/test.html");
		return;
	}
}

