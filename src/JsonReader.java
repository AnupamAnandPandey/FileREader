import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonReader {
	static BufferedReader in;
	public static void main(String [] args) throws IOException {
		List<String> jsonList 	= new ArrayList<String>();  // to store input
		String temp 			= null;
		try{
			in = new BufferedReader(new FileReader("/Users/anupam/Downloads/world_bank.json"));
			while((temp=in.readLine()) != null){
				System.out.println(temp);
				jsonList.add(temp);
			}	
			in.close();
		}
		finally {
			System.out.println("");
		}
	
}

}
