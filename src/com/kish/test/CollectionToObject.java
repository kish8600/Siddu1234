package com.kish.test;

import java.util.ArrayList;
import java.util.List;

public class CollectionToObject {
	
	
	
	
	public static void main(String[] args){

		List<String>  test = new ArrayList<String>();

		for(int i=0; i<121; i++){

			test.add("Orange"+i);
		}

		TempDomain domain = new TempDomain();
		System.out.println("RowSize:"+domain.getRowSize(test)); 
		
		List<TempDomain> tempDomainList = domain.populatedomain(test);
		
		System.out.println("Size"+tempDomainList.size());




	}
	
	
	
	
	
	
	
	
	
	

}
