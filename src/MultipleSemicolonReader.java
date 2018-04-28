    import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;


	public class MultipleSemicolonReader {
		static BufferedReader in;
		public static void main(String [] args) throws IOException {
			List<String> listOfQueries 	= new ArrayList<String>();  // to store input
			StringBuilder queryStr 	= new StringBuilder();
			String temp 			= null;
			try{
				in = new BufferedReader(new FileReader("/Users/anupam/Downloads/LK_WALLETErrorneous.sql"));
				while((temp=in.readLine()) != null){
					//System.out.println(temp);
					int queryEnd = temp.lastIndexOf(";");
					if(queryEnd == -1) {
						temp = temp.replaceAll("( )+",	 " ");
						temp = temp.replaceAll("\n", " ");
						
						temp = temp.trim();
						queryStr.append(temp);
					}
					else {
						queryStr.append(temp);
						listOfQueries.add(queryStr.toString());
						queryStr.delete(0, queryStr.length());
					}
				}
				System.out.println("Actual Output");
				for(String query : listOfQueries) {

					System.out.println(query);

				}
				System.out.println(listOfQueries.size());
			}
			finally {
				in.close();
			}
		}
	}


