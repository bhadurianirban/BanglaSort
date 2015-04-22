package SortBanglaWindow;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;



public class ReadBangla {

	ArrayList<BengLines> bengLineList;
	
	ReadBangla (String fileName) throws IOException
	{
		File f = new File (fileName);
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f),"UTF8"));
		ArrayList<BengLines> bengLineList = new ArrayList<BengLines>();
		String bengTextLine = br.readLine();
		
		int lineCounter = 1;
		int textLineNumber = 1;
		int textSubLineNumber = 1;
		if (bengTextLine.startsWith(StatVariables.UTF8_BOM)) {
			bengTextLine.substring(1);
		}
		
		while (bengTextLine != null) {
			BengLines bengLineElem = new BengLines();
			//System.out.println("t"+bengTextLine);
			bengLineElem.setLine(bengTextLine);
			bengLineElem.setLineNumber(textLineNumber);
			bengLineElem.setSubLineNumber(textSubLineNumber);
			bengLineElem.setLinePointer(lineCounter);
			bengLineElem.setChapNumber(1);
			bengLineElem.setSectionNumber(1);
			
			if (lineCounter%2 != 0)
			{
				textSubLineNumber = 1;
			}
			else
			{
				textSubLineNumber = 2;
				textLineNumber++;
			}
			lineCounter++;
			bengLineList.add(bengLineElem);
			bengTextLine = br.readLine();
			//System.out.println(bengTextLine);
			
		}
		br.close();
		this.bengLineList = bengLineList;
	}
	public ArrayList<BengLines> getBengLineList () {
		return(this.bengLineList);
	}
}
