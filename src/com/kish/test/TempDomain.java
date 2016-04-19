package com.kish.test;

import java.util.ArrayList;
import java.util.List;

public class TempDomain {
	
	
	private String column1;
	private String column2;
	private String column3;
	
	private String column4;
	private String column5;
	private String column6;
	
	private String column7;
	private String column8;
	private String column9;
	private String column10;
	
	private List<TempDomain> tempDomainList = new ArrayList<TempDomain>();
	
	
	
	public String getColumn1() {
		return column1;
	}
	public void setColumn1(String column1) {
		this.column1 = column1;
	}
	public String getColumn2() {
		return column2;
	}
	public void setColumn2(String column2) {
		this.column2 = column2;
	}
	public String getColumn3() {
		return column3;
	}
	public void setColumn3(String column3) {
		this.column3 = column3;
	}
	
	public String getColumn4() {
		return column4;
	}
	public void setColumn4(String column4) {
		this.column4 = column4;
	}
	public String getColumn5() {
		return column5;
	}
	public void setColumn5(String column5) {
		this.column5 = column5;
	}
	public String getColumn6() {
		return column6;
	}
	public void setColumn6(String column6) {
		this.column6 = column6;
	}
	public String getColumn7() {
		return column7;
	}
	public void setColumn7(String column7) {
		this.column7 = column7;
	}
	public String getColumn8() {
		return column8;
	}
	public void setColumn8(String column8) {
		this.column8 = column8;
	}
	public String getColumn9() {
		return column9;
	}
	public void setColumn9(String column9) {
		this.column9 = column9;
	}
	public String getColumn10() {
		return column10;
	}
	public void setColumn10(String column10) {
		this.column10 = column10;
	}
	
	
	public int getRowSize(List<String> list){
		
		
		return (int) Math.ceil(list.size()/10);
		
	}
	
	
	public List<TempDomain> populatedomain(List<String> list){
		int size = getRowSize(list);
		int fromIndex =0;
		int toIndex = 10;
		
		for(int i=0; i<size;i++){
			
			List<String> subList = list.subList(fromIndex, toIndex);
			
			String[]  array =	(String[]) subList.toArray(new String[subList.size()]);
			
			TempDomain tempDomain = new TempDomain();
			
			tempDomain.setColumn1(array[0]);
			tempDomain.setColumn2(array[1]);
			tempDomain.setColumn3(array[2]);
			tempDomain.setColumn4(array[3]);
			tempDomain.setColumn5(array[4]);
			tempDomain.setColumn6(array[5]);
			tempDomain.setColumn7(array[6]);
			tempDomain.setColumn8(array[7]);
			tempDomain.setColumn9(array[8]);
			tempDomain.setColumn10(array[9]);
			
			tempDomainList.add(tempDomain);
			fromIndex = toIndex;
			toIndex = toIndex + 10;
			
		}
		
		
		return tempDomainList;
		
		
		
	}
	
	public List<TempDomain> addLastRow(List<String> list,List<TempDomain> tempDomainList, int fromIndex){
		if(fromIndex == list.size())
			return tempDomainList;
		
		List<String> subList = list.subList(fromIndex, list.size());
		String[]  array =	(String[]) subList.toArray(new String[subList.size()]);
		
		TempDomain tempDomain = new TempDomain();
		
		tempDomain.setColumn1(array[0]);
		tempDomain.setColumn2(array[1]);
		tempDomain.setColumn3(array[2]);
		tempDomain.setColumn4(array[3]);
		tempDomain.setColumn5(array[4]);
		tempDomain.setColumn6(array[5]);
		tempDomain.setColumn7(array[6]);
		tempDomain.setColumn8(array[7]);
		tempDomain.setColumn9(array[8]);
		tempDomain.setColumn10(array[9]);
		return tempDomainList;
		
		
		
	}
	

}
