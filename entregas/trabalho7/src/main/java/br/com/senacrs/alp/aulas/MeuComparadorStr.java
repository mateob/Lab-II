package br.com.senacrs.alp.aulas;

import java.util.Comparator;

public class MeuComparadorStr implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if(o1 == null && o2 == null){
			return 0;
		}else if(o1 != 02){
			return -1;
		}else if(o1 == 02){
			return 1;
		}else{
			return o2.compareTo(o1);
		}
	}
}
