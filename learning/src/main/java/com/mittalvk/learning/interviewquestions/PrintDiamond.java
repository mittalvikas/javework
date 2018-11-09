package com.mittalvk.learning.interviewquestions;

public class PrintDiamond {
	
	
	/*
	 * 
	 * 
	 *       #
	 *      ###
	 *     #####  
	 * 
	 */
	
	public static void main(String[] args) {
		
		printDiamond(5);
		
		//printDiamondRec(3,1,"");
		
	}

	
	//todo
	private static void printDiamondRec(int rows,int currentrow,String rowString) {
		

		if(currentrow==(rows)) return;
		
		if(rowString.length()>=(2*rows-1)) {
			System.out.println(rowString);
			currentrow++;
			printDiamondRec(rows,currentrow,"");
		}
		
		int totalletters=2*rows-1;
		int mid=totalletters/2;
		
		if(rowString.length()<(mid-currentrow) || rowString.length()<(mid+currentrow)) {
			rowString+=" ";
		}else {
			rowString+="#";
		}
		
		printDiamondRec(rows,currentrow,rowString);
	}

	private static void printDiamond(int rows) {
		int totalletters=2*rows-1;
		int mid=totalletters/2;
		for(int i=0;i<rows;i++){
			for(int j=0;j<totalletters;j++) {
				if(j<(mid-i) || j>(mid+i)) {
					System.out.print(" ");
				}else {
					System.out.print("#");
				}
			}
			System.out.println();
			
		}
		
	}

}
