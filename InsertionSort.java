import java.util.*; 
class InsertionSort { 
    //method for sorting the elements   
    void insertionSort(int arr[]) { 
        int size = arr.length;   
        for (int i = 1; i < size; i++) {    
            int tmp = arr[i];   
            int j = i - 1;    
            while (j >= 0 && tmp < arr[j]) {   
                arr[j + 1] = arr[j];  
                --j;   
                }    
                arr[j + 1] = tmp;   
                } 
                } 	 
                // method for printing the elements  
                void display(int arr[]) {  
                    int size = arr.length; 
                    for (int i = 0; i < size; i++) 	
                    System.out.print(arr[i]+" "); 
                    System.out.println();
                    
                } // Main method or driver method  
                public static void main(String args[]) { 
                    int[] arr = { 9, 5, 1, 4, 3 };   
                    InsertionSort  ob = new InsertionSort(); 
                    System.out.println("Elements before sorting: ");     
                    ob.display(arr);   
                    ob.insertionSort(arr);   
                    System.out.println("Elements after sorting: ");  
                    ob.display(arr); 
                    } 
    }  
