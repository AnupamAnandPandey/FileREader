import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileWriter1 {
	static BufferedReader in;
	static BufferedWriter out;
	public static void main(String [] args) throws IOException {
		List<String> payload 	= new ArrayList<String>();  // to store input
		String temp 			= null;
         try{
        	 out = new BufferedWriter(new FileWriter("/Users/anupam/Downloads/scm-ui-automation/data/CSVFiles/CreateOrderDataJSON.csv"));
        	 in = new BufferedReader(new FileReader("/Users/anupam/Downloads/scm-ui-automation/data/CSVFiles/CreateOrderDataJSON.csv"));
        	 while((temp=in.readLine()) != null){
				payload.add(temp);
 			}
        	 for(int i=0;i<payload.size();i++){
        		    System.out.println(payload.get(i));
        		} 
        	 for(int i=0; i<250; i++)
        	 {
        		 for(String str: payload) {
        			 
        			  
        			}
        	 }
         }
         finally {
			
		}
}
}
