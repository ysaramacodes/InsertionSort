package Arrayhw1;

//import java.util.Arrays;

//import java.util.Arrays;
public class InsertionSort {
	  
		  public void sort(Integer[] arrayToSort){
				 //int [] a = {23,1,10,5,2};
				 //int min =arrayToSort[0];
				 int temp=0;
				for(int i=1; i< arrayToSort.length;i++){
			      int j=i;
			      while(j>0 && arrayToSort[j] < arrayToSort[j-1]) {
			    	 temp=arrayToSort[j];
			    	  arrayToSort[j]=arrayToSort[j-1];
			    	  arrayToSort[j-1]=temp;
			    	  j--;
			      }
			       
			     //  System.out.println(Arrays.toString(a));
				} 
			    
				//System.out.println(Arrays.toString(a));
		    }
}
