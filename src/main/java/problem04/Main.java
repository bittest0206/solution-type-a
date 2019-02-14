package problem04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		

			int com[] = new int[3]; 
			int user[] = new int[3]; 
			int ch = 0; 
			int counter = 0; 

			boolean randomball = true; 

			while (randomball) { 
			
				for (int i=0; i<com.length; i++) { 
			
				com[i] = (int)(Math.random() * 9) + 1; 
			
			} 
			
				if (com[0] != com[1] && com[0] != com[2] && com[1] != com[2]) 
			
			{ 
			
					randomball = false; 
			} 
			} 
			
			randomball = true; 

			
			while (randomball) { 
			
				int strike = 0; 
			
				int ball = 0;
				int out = 0;
			System.out.println("숫자입력"); 
			Scanner kk = new Scanner(System.in); 

			
			for (int i=0; i < user.length; i++) { 
			
				try { 
			ch = kk.nextInt(); 
			user[i] = ch; 
			
			if (ch > 10 || ch < 0) { 
			System.out.println(">"); 
			} 
			} 
				catch (Exception e) { 
			System.out.println("잘못입력"); 
			} 
			} 
			
			for (int i=0; i<com.length; i++)
			{ 
			
				for (int j=0; j<user.length; j++) { 
			
				
				if (com[i] == user[j] && i == j)
			
				{ 
			strike++; 
			} 
				else if (com[i] == user[j] && i != j) 
			{ 
			ball++; 
			} 

			} 
			} 
			System.out.println(" S "+strike + "B"+ball +"o"+out); 
			if (strike == 3) 
			{ 
			randomball = false; 
			} 
			counter++; 
			} 
	
			System.out.println("종료");
			} 

			
	}




	
		

