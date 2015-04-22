package SortBanglaWindow;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class WriteBangla {
	ArrayList<BengLines> bengLineList;
	public void WriteSortedFile (String fileName,ArrayList<BengLines> bengLineList) {
		try {
			 
			this.bengLineList = bengLineList;
 
			File file = new File(fileName);
 
			// if file does not exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			OutputStreamWriter fw =  new OutputStreamWriter(
					new FileOutputStream(file.getAbsoluteFile()), "UTF8");
			
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i=0;i<this.bengLineList.size();i++) {
				bw.write(bengLineList.get(i).getLine()+"\n");
			}
			
			bw.close();
 
			StatVariables.ErrorMessage = StatVariables.SORTING_DONE;
 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
