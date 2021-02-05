package aayush_sorting;
import java.util.Arrays;
public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = {1,6,3,5,7,8,9,32,4,65,8,6,0,7,9,4};
		insertionSort(number);
		System.out.println(Arrays.toString(number));
		

	}
	public void static insertionSort(int[] array)
    {
        int current;
        for (int x=1;x< array.length;x++)
        {
            current= array[x];
            var y=x-1;
            while (y>=0 &&array[y]>current){
                array[y+1]=array[y];
                y--;
            }
            array[y+1]=current;
        }
    }

}
