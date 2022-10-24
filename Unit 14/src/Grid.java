//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		for()
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{
		int max = 1;
		int count = 0;
		String most = "";
		for(String s : vals) {
			for(String[] row : grid) {
				for(String w : row) {
					if(w.equals(s)) {
						count++;
					}
				}
			}
			if(max < count) {
				max = count;
				most = s;
			}
			count = 0;
		}
		return most;
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		return 0;
	}

	//display the grid
	public String toString()
	{
		String output="";
		return output;
	}
}