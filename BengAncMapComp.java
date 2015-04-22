package SortBanglaWindow;

import java.util.Comparator;

public class BengAncMapComp implements Comparator <AncMappedLines>{
	@Override
	public int compare (AncMappedLines a1,AncMappedLines a2) {
		if (a1.getMappedLine().compareTo(a2.getMappedLine())>0)
		{
			return(1);
		}
		else 
		{
			return(-1);
		}
		
	}
	

}
