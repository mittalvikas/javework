package com.mittalvk.learning.interviewquestions;

/*
 * split a string array into small chunk arrays 
 * 
 * 
 * Example:

[1,2,3,4,5]
if the chunk size is 1, [1,2,3,4,5]
if the chunk size is 2, [1,2] and [3,4] and [5]
if the chunk size is 3, [1,2,3] and [4,5]
if the chunk size is 4, [1,2,3,4] and [5]
 */

public class ArrayChunking {

	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,4,5};
		
		createChunk(arr,2);
		
	}

	private static void createChunk(int[] arr, int chunksize) {
		
		int chunks= arr.length;
		if(chunksize>1)chunks=arr.length%chunksize==0?arr.length/chunksize:((arr.length/chunksize)+1);
		
		System.out.println("Number of chunks:"+chunks);
		
		int[][] output=new int[chunks][];
		
		for(int i=0;i<chunks;i++) {
			int start=i*chunksize;
			int length = Math.min(arr.length - start, chunksize);
			int [] tmp=new int[length];
			System.arraycopy(arr, start, tmp, 0, length);
			output[i] = tmp;
		}
		
		
		
		for(int i=0;i<chunks;i++) {
			int[] tmp=output[i];
			for(int j=0;j<tmp.length;j++) {
				System.out.println("Chunk>>"+(i+1) +"and value is "+tmp[j]);
			}
		}
		
	}
	
}
