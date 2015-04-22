package SortBanglaWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class BengAncillaryCharMap {
	
	private HashMap<Integer,String> BengAncillaryMap; 
	
	public HashMap<Integer,String> initBengAncillaryMap () {
		HashMap<Integer,String> bengAncMap = new HashMap<>();
		bengAncMap.put(0X2019,"000");
		bengAncMap.put(0X200C,"000");
		bengAncMap.put(0X0027,"000");
		bengAncMap.put(0X002E,"000");
		bengAncMap.put(0X003A,"000");
		bengAncMap.put(0X003B,"000");
		bengAncMap.put(0X003F,"000");
		bengAncMap.put(0X0021,"000");
		bengAncMap.put(0X0022,"000");
		bengAncMap.put(0X0027,"000");
		bengAncMap.put(0X0028,"000");
		bengAncMap.put(0X0029,"000");
		bengAncMap.put(0X002C,"000");
		bengAncMap.put(0X002D,"000");
		bengAncMap.put(0X0020,"000");
		bengAncMap.put(0X0020,"000");
		bengAncMap.put(0X0964,"000");
		bengAncMap.put(0X0000,"099");
		bengAncMap.put(0X09F9,"101");
		bengAncMap.put(0X09BE,"102");
		bengAncMap.put(0X09BF,"103");
		bengAncMap.put(0X09C0,"104");
		bengAncMap.put(0X09C1,"105");
		bengAncMap.put(0X09C2,"106");
		bengAncMap.put(0X09C3,"107");
		bengAncMap.put(0X09C7,"108");
		bengAncMap.put(0X09C8,"109");
		bengAncMap.put(0X09CB,"110");
		bengAncMap.put(0X09CC,"111");
		bengAncMap.put(0X09CD,"112");
		bengAncMap.put(0X0985,"113");
		bengAncMap.put(0X0986,"114");
		bengAncMap.put(0X0987,"115");
		bengAncMap.put(0X0988,"116");
		bengAncMap.put(0X0989,"117");
		bengAncMap.put(0X098A,"118");
		bengAncMap.put(0X098B,"119");
		bengAncMap.put(0X098F,"120");
		bengAncMap.put(0X0990,"121");
		bengAncMap.put(0X0993,"122");
		bengAncMap.put(0X0994,"123");
		bengAncMap.put(0X0982,"124");
		bengAncMap.put(0X0983,"125");
		bengAncMap.put(0X0981,"126");
		bengAncMap.put(0X0995,"127");
		bengAncMap.put(0X0996,"128");
		bengAncMap.put(0X0997,"129");
		bengAncMap.put(0X0998,"130");
		bengAncMap.put(0X0999,"131");
		bengAncMap.put(0X099A,"132");
		bengAncMap.put(0X099B,"133");
		bengAncMap.put(0X099C,"134");
		bengAncMap.put(0X099D,"135");
		bengAncMap.put(0X099E,"136");
		bengAncMap.put(0X099F,"137");
		bengAncMap.put(0X09A0,"138");
		bengAncMap.put(0X09A1,"139");
		bengAncMap.put(0X09DC,"140");
		bengAncMap.put(0X09A2,"141");
		bengAncMap.put(0X09DD,"142");
		bengAncMap.put(0X09A3,"143");
		bengAncMap.put(0X09CE,"144");
		bengAncMap.put(0X09A4,"145");
		bengAncMap.put(0X09A5,"146");
		bengAncMap.put(0X09A6,"147");
		bengAncMap.put(0X09A7,"148");
		bengAncMap.put(0X09A8,"149");
		bengAncMap.put(0X09AA,"150");
		bengAncMap.put(0X09AB,"151");
		bengAncMap.put(0X09AC,"152");
		bengAncMap.put(0X09AD,"153");
		bengAncMap.put(0X09AE,"154");
		bengAncMap.put(0X09AF,"155");
		bengAncMap.put(0X09DF,"156");
		bengAncMap.put(0X09B0,"157");
		bengAncMap.put(0X09B2,"158");
		bengAncMap.put(0X09B6,"159");
		bengAncMap.put(0X09B7,"160");
		bengAncMap.put(0X09B8,"161");
		bengAncMap.put(0X09B9,"162");
		bengAncMap.put(0X09BC,"163");
		bengAncMap.put(0X09E6,"164");
		bengAncMap.put(0X09E7,"165");
		bengAncMap.put(0X09E8,"166");
		bengAncMap.put(0X09E9,"167");
		bengAncMap.put(0X09EA,"168");
		bengAncMap.put(0X09EB,"169");
		bengAncMap.put(0X09EC,"170");
		bengAncMap.put(0X09ED,"171");
		bengAncMap.put(0X09EE,"172");
		bengAncMap.put(0X09EF,"173");
		
		this.BengAncillaryMap = bengAncMap;
		
		return(this.BengAncillaryMap); 
		
	}
	public boolean isModifier (int c) {
		List<Integer> modifierList = new ArrayList<Integer>();
		modifierList.add(0x09BE);
		modifierList.add(0x09BF);
		modifierList.add(0x09C0);
		modifierList.add(0x09C1);
		modifierList.add(0x09C2);
		modifierList.add(0x09C3);
		modifierList.add(0x09C7);
		modifierList.add(0x09C8);
		modifierList.add(0x09CB);
		modifierList.add(0x09CC);
		modifierList.add(0x09CD);
		modifierList.add(0x0982);
		modifierList.add(0x0983);
		modifierList.add(0x0981);
		modifierList.add(0x0000);
		
		if (modifierList.contains(c)) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
