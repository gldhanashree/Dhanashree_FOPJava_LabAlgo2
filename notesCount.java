package CurrDenom;

public class notesCount {
	public void notesCountapplication(int[] notes, int amount)  {
		int[] noteCounter = new int[notes.length];
		
		try {
			for(int i=0; i< notes.length; i++) {
				if(amount >= notes[i]) {
					noteCounter[i] = amount / notes[i];
					amount = amount - (noteCounter[i] * notes[i]);
				}
			}
			if(amount < 0) {
				System.out.println("exact amount cannot be given with highest denomination");
			}
			else {
				System.out.println("You will require notes for payment in the denomination as :");
				for(int i=0; i< notes.length; i++) {
					if(noteCounter[i] != 0) {
						System.out.println(notes[i] + ":"+ noteCounter[i]);
					}
				}
			}}
			catch(ArithmeticException e) {
				System.out.println(e + "Note denomination 0 is invalid");
			}
		}
	}


