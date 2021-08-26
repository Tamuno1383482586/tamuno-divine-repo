//Author : Tamuno Gesiowei Divine 
//Matric Number : UG/17/1448
//Bubble sort in java without Stopping
class BubbleSort2 {
  void bubbleSort(int arr[]) {   //sorting method
    int size = arr.length;
    for (int i = 0; i < size - 1; i++) {
      boolean flag = true;
      for (int j = 0; j < size - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          flag = false;
        }
      } 
      if (flag == true)
        break;
    }
  }
 void display(int arr[]) {   //method for displaying the elements
     int size = arr.length;
	 for (int i = 0; i < size; i++)
		System.out.println(arr[i]+" ");	
   }
  public static void main(String args[]) {   //main method or driver method
    int[] arr = { -2, 45, 0, 11, -9 };
    BubbleSort2  bs = new BubbleSort2();
    System.out.println("Elements before Sorting:");
    bs.display(arr);
    bs.bubbleSort(arr);
    System.out.println("Elements after Sorting:");
    bs.display(arr);
  }
}
