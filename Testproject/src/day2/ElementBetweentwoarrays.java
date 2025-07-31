package day2;



import java.util.Arrays;  
public class ElementBetweentwoarrays {

	public static void main(String[] args) {
		
		      int[] array1 = {1,3,5,7,9,2}; 
		      int[] array2 = {2,4,6,8,10}; 
		       System.out.println("Array1 : "+Arrays.toString(array1)); 
		       System.out.println("Array2 : "+Arrays.toString(array2)); 
		        for (int i = 0; i < array1.length; i++) 
		        { 
		            for (int j = 0; j < array2.length; j++) 
		            { 
		                if(array1[i] == (array2[j])) 
		                { 
		          System.out.println("Common element is : "+(array1[i])); 
		                 } 
		            } 
		        } 
		     } 
		

	}
