import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		
		int houers =0;
		int minutes =0;
		
		
		while (!input.equalsIgnoreCase("End")) {
			
			String [] tokens = input.split(":");
			
			houers+= Integer.parseInt(tokens[0]);
			minutes+= Integer.parseInt(tokens[1]);
			
			input = br.readLine();
			
		}
		
		if (minutes>=60) {
			houers+= (minutes/60);
			minutes= minutes%60;
		}
		

			System.out.printf("%d:%02d", houers, minutes);

		

	}

}
