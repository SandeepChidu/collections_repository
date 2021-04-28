package com.createiq.collections;

import java.util.Comparator;

public class NumberDESComparator implements Comparator<Integer> {

@Override
public int compare(Integer o1,Integer o2) {
//	if(o1>o2) {
//		return 1;//true(positive value place right side in list)
	
//	}
//	if(o1<o2) {
//		return -1;//false(negative value place left side in list)
//	}
//	return 0;
	return(o2.compareTo(o1));//compare o2 to o1: 2-1=1 postive value(Descending order)
//	return(o1.compareTo(o2));//compare o1 to o2: 1-2=-1 nagative value(ascending order)
	
	
  }

}
