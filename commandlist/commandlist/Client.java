package commandlist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

	public static void main(String[] args)throws IOException {
		Invoker invoker = new Invoker();
		while(true) {
			System.out.println("#");
			
			String input = (new BufferedReader(new InputStreamReader(System.in))).readLine();
			
			if(input.equals("q") || input.equals("e")) {
				return ;
			}
			
			System.out.println(invoker.exec(input));
		}
	}
}
