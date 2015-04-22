package SortBanglaWindow;
import java.io.IOException;
import java.util.ArrayList;


public class mainDriver {
	

	public boolean StartSort(String InFileName,String OutFileName) throws IOException {
		// TODO Auto-generated method stub
		
		//Read Bengali file into Arraylist
		
		ReadBangla readBang = new ReadBangla(InFileName);
		//ReadBangla readBang = new ReadBangla(args[0]);
		ArrayList<BengLines> BengLineList = new ArrayList<BengLines>();
		BengLineList = readBang.getBengLineList();

		//Map it to Anciliary values
		BengAncMappedLines bengMapLine = new BengAncMappedLines();
		
		
		//Sort the mapped values
		boolean CharMapped = bengMapLine.mapBengCharToAncMap(BengLineList);
		if (!CharMapped) {
			return false;
		}
		
		bengMapLine.sortBengAncMap();
		bengMapLine.getSortedOrigText();
		ArrayList<BengLines> SortedBengLineList = new ArrayList<BengLines>();
		
		SortedBengLineList = bengMapLine.getSortedBengText();

		//for (int mappedLine = 0;mappedLine<SortedBengLineList.size();mappedLine++) {
			
			
			//String s = SortedBengLineList.get(mappedLine).getLine();
			//System.out.println(s);
		//}
		WriteBangla wb = new WriteBangla();
		wb.WriteSortedFile(OutFileName,SortedBengLineList);
		//WriteBangla wb = new WriteBangla(args[1],SortedBengLineList);
		
		return true;
		
	}

}
