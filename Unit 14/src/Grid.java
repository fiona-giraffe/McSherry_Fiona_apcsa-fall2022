//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		grid = new String[rows][cols];
		for(int i=0; i < grid.length; i++) {
			for(int j=0; j < grid[i].length; j++) {
				int v = (int)(Math.random()*vals.length);
				String val = vals[v];
				grid[i][j] = val;
			}
		}
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
		int count = 0;
		for(int i=0; i < grid.length; i++) {
			for(int j=0; j < grid[i].length; j++) {
				if (grid[i][j] == val) count++;
			}
		}	
		return count;
	}
	
	public String Debugging(String[] vals) {
		String output = "";
		for(int k = 0; k < vals.length; k++) {
			output +=(vals[k] + " count is " + countVals(vals[k]) + "\n");
		}
		return output;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for(String[] row : grid) {
			for(String w : row) {
				output += w + " ";
			}
			output += "\n";
		}
		return output;
	}
}