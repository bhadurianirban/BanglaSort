package SortBanglaWindow;

public class BengLines {
	private String line;
	private int[] lineInInt = new int[100];
	private int chapNumber;
	private int sectionNumber;
	private int lineNumber;
	private int subLineNumber;
	private int linePointer;
	public void setLine (String line) {
		this.line = line;
		
		
		char[] lineInChar = new char[StatVariables.LINE_SIZE];
		lineInChar = line.toCharArray();
		
		for (int i =0; i<line.length();i++) {
			this.lineInInt[i] = lineInChar[i];
		}
		
	}
	public String getLine () {
		return this.line;
	}
	public void setChapNumber (int chapNumber) {
		this.chapNumber = chapNumber;
	}
	public int getChapNumber () {
		return this.chapNumber;
	}
	public void setSectionNumber (int sectionNumber) {
		this.sectionNumber = sectionNumber;
	}
	public int getSectionNumber () {
		return this.sectionNumber;
	}	
	public void setLineNumber (int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public int getLineNumber () {
		return this.lineNumber;
	}		
	public void setSubLineNumber (int subLineNumber) {
		this.subLineNumber = subLineNumber;
	}
	public int getSubLineNumber () {
		return this.subLineNumber;
	}
	public int[] getLineInInt () {
		return this.lineInInt;
	}
	public int getLinePointer () {
		return this.linePointer;
	}
	public void setLinePointer (int linePointer) {
		this.linePointer = linePointer;
	}
}
