package javaPracticeQuestions;

import java.util.Scanner;

public class twoSumTarget {
		
	public int [] twoSum(int[] Sum, int target) {
       
        int []index= new int[2];        
		for(int i=0; i<Sum.length; i++){
          for (int j=i+1; j<Sum.length; j++){
                if (Sum[i]+ Sum[j] == target){               	
                index[0]=i;
                index[1]=j;
                }
            }
        }
	
     return index;	  
    }
	
			
	public static void main(String[] args) {
		
        System.out.println("Give size of an array");
        Scanner s = new Scanner (System.in);
        int size = s.nextInt();
        int [] Sum = new int[size];
        System.out.println("Write " + size+ " Elements");
        
        for (int i=0;i<size;i++){
            Sum[i] = s.nextInt(); 
            
        }
        int target = 10;
        twoSumTarget s1 = new twoSumTarget();
        
        
        int []index2= new int[2]; 
        
        
        index2 = s1.twoSum(Sum,target);
        for(int i=0;i<index2.length;i++){
        	System.out.println(index2[i]);
        }
        
 
	}

}
