package SortBanglaWindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class BengAncMappedLines {
	private ArrayList<AncMappedLines> bengAncMapped;
	private ArrayList<BengLines> origBengText;
	private ArrayList<BengLines> sortedBengText;
	

	public boolean mapBengCharToAncMap (ArrayList<BengLines> origBengText) {
		
		this.origBengText = origBengText;
		ArrayList<AncMappedLines> bengAncMapped = new ArrayList<AncMappedLines>();
		int [] lineInChar = new int[StatVariables.LINE_SIZE];
		BengAncillaryCharMap bac = new BengAncillaryCharMap();
		HashMap<Integer,String> bengAncMap = new HashMap<>();
		bengAncMap = bac.initBengAncillaryMap();
		for (int i=0;i<origBengText.size();i++) {
			AncMappedLines ancMapLine = new AncMappedLines();
			
			String mappedLine = "";
			BengLines bengLine = new BengLines();
			bengLine = origBengText.get(i);
			
			for (int lineInCharCounter = 0;lineInCharCounter<lineInChar.length;lineInCharCounter++)
				lineInChar[lineInCharCounter] =  0;
			lineInChar =  bengLine.getLineInInt();
			
			boolean insertNullMod = false;
			int prevChar = 0;
			int presentChar = 0;
			String mappedChar = "";
			for (int lineInCharCounter = 0;lineInCharCounter<lineInChar.length;lineInCharCounter++) {
				if (lineInChar[lineInCharCounter] != 0 && lineInChar[lineInCharCounter]!=65279) {
					presentChar = (int)lineInChar[lineInCharCounter];
					//System.out.print("!!"+lineInChar[lineInCharCounter]+"!!"+(char)presentChar);
					
					mappedChar = bengAncMap.get(lineInChar[lineInCharCounter]);
					if (mappedChar == null) {
						System.out.println((char) presentChar);
						StatVariables.ErrorMessage = "Character ' "+ (char) presentChar +" ' not a bengali character." ;
						return false;
					}
					//System.out.print("origchar"+(char)presentChar + "mapchar"+mappedChar);
					if (!mappedChar.equals("000")) {
						insertNullMod = false;
						//System.out.println("testestest"+bac.isModifier(presentChar));	
						if (!bac.isModifier(presentChar)) {
							if (!bac.isModifier(prevChar)) {
								insertNullMod = true;
								//System.out.print("prev"+(char)prevChar+"pres"+(char)presentChar);
							}
						}
						if (insertNullMod) {
							mappedLine = mappedLine + bengAncMap.get(0);
						}
						mappedLine = mappedLine + mappedChar;
						prevChar = presentChar;
						
					}
					
					
				}
				
			}
			//System.out.println();
			//System.out.println(mappedLine);
			ancMapLine.setLineIndex(i);
			ancMapLine.setMappedLine(mappedLine);
			bengAncMapped.add(ancMapLine);
			
		}
		
		
		this.bengAncMapped = bengAncMapped;
		return true;
	}
	public void sortBengAncMap () {
		
		Collections.sort(this.bengAncMapped,new BengAncMapComp());
	}
	
	public ArrayList<AncMappedLines> getBengAncMapped()
	{
		return this.bengAncMapped;
	}
	public ArrayList<BengLines> getOrigBengText()
	{
		return this.origBengText;
	}
	public void getSortedOrigText() {
		ArrayList<BengLines> sortedBengText = new ArrayList<BengLines>();
		ArrayList<AncMappedLines> bengAncMapped = new ArrayList<AncMappedLines>();
		bengAncMapped = this.bengAncMapped;
		
		
		
		for (int mappedLine = 0;mappedLine<bengAncMapped.size();mappedLine++) {
			BengLines bengLine = new BengLines();
			bengLine.setLine(this.origBengText.get(bengAncMapped.get(mappedLine).getLineIndex()).getLine());
			bengLine.setLineNumber(mappedLine);
			sortedBengText.add(bengLine);
		}
		this.sortedBengText = sortedBengText;
	}
	public ArrayList<BengLines> getSortedBengText()
	{
		return this.sortedBengText;
	}

}
