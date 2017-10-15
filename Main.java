import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		/*Scanner in = new Scanner(System.in);
		String a = null;

		StringBuffer fileData = new StringBuffer();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("distances.txt"));
			char[] buf = new char[1024];
			int numRead=0;
			while((numRead=reader.read(buf)) != -1){
				String readData = String.valueOf(buf, 0, numRead);
				fileData.append(readData);
			}
			reader.close();
			a = fileData.toString();
	
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String[] b = a.split("\n");
		String[] c = new String[10];
		String[][] d = new String[a.length()/2][a.length()/2];
		int currentDI=0;

		for(int i = 0; i<b.length; i++) {
			c =  b[i].split(" ");
			currentDI=0;

			for(int j = 0; j<c.length; j++) {
				if(!c[j].equals(" "))  {
					d[i][j-currentDI] =  c[j];
					
				}
				else {currentDI++;
					//System.out.println("currentID:"+currentDI);
				}
				System.out.println(d[i][j]);
			}
		}
		*/
		
	
		
	
		double temp= 10.0	;
		double cool= 1000.0;
		SimulatedAnnealing lol= new SimulatedAnnealing();
		lol.simulateAnnealing(temp, 1000, cool);
		
		
		
		
		
		
		
		
	}
	
}
