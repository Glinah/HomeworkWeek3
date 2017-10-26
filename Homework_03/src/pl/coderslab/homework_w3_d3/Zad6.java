package pl.coderslab.homework_w3_d3;

import java.util.ArrayList;
import java.util.List;

public class Zad6 {

	public List<String> addToList(List<String> list, String str){
		if(list==null) {
			list = new ArrayList<>();
		}
		list.add(str);
		return list;
	}
	
}
