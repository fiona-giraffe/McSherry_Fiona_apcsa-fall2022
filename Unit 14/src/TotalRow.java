//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	//add code here
    	int count = 0;
    	ArrayList<Integer> arr = new ArrayList<Integer>();
    	for(int i = 0; i < m.length; i++) {
    		for(int j = 0; j < m[i].length; j++) {
    			count += m[i][j];
    		}
    		arr.add(count);
    		count = 0;
    	}
		return arr;
    }
}
