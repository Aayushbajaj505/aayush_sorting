package aayush_sorting;
import java.util.Arrays;
public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {1,6,3,5,7,8,9,32,4,65,8,6,0,7,9,4};
		bubbleSort(number);
		System.out.println(Arrays.toString(number));
		

	}
	public static void bubbleSort(int[] array)
    {
        for (int x=0;x< array.length;x++){
            for (int y=1;y< array.length-x;y++)
            {
                if (array[y]<array[y-1]) {
                    var temp = array[y];
                    array[y]=array[y-1];
                    array[y-1]=temp;
                }
            }
        }

    }

}
