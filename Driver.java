package CurrDenom;
import java.util.Scanner;
import java.util.Arrays;


public class Driver {
	
	public static int[] reverse(int[] array)
    {

        int n = array.length;
 
        for (int i = 0; i < n / 2; i++) {
 
            int temp = array[i];
 
            array[i] = array[n - i - 1];
 
            array[n - i - 1] = temp;
            
        }
        return array;
    }

	public static void main(String[] args) {
		
		notesCount NotesCount = new notesCount();
		System.out.println("Enter the size of currency denominations:");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] notes = new int[size];
		System.out.println("Enter the currency denominations value:");
		for(int i=0; i<size;i++) {
			notes[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay :");
		int amount = sc.nextInt();
		 Arrays.sort(notes);
		int[] reversed = reverse(notes);
		
		NotesCount.notesCountapplication(reversed,amount);
		}

	}



