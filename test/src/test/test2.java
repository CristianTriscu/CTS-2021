package test;

import java.util.HashMap;
import java.util.Map;

public class test2 {
	
	 public int solution(int[] A) {
	        // write your code in Java SE 8
		 int solution=0;
	     Map<Integer, Integer> hm=new HashMap<>();;
	     for(int i=0;i<A.length;i++) {
	    	 
	    	 if(hm.get(A[i])==null)
	    	 hm.put(A[i], 1);
	    	 else
	    		 hm.put(A[i], hm.get(A[i])+1);
	     }
	     
	     
	     for(Map.Entry<Integer, Integer> val: hm.entrySet()) {
	    	 if(val.getValue()==1) {
	    		 solution=val.getKey();
	    	 }
	     }
	     return solution;
	 } 
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
			String test=Integer.toBinaryString(32);
			test2 test1=new test2();
			int [] solution= {9,3,9,3,9,7,9,3,2,1,3,2,4,21,4,21,31,231,31,3,2,1,2,3,21,23,33,3,3};
			System.out.println(test1.solution(solution));
	}
}
