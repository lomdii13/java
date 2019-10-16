package sachin;

public class arraydemo {

		public static void main(String[] args) {

		int arrayInpute[] = { 5, 6, 9, 10 };

		int arrayOutput[];

		arrayOutput = new int[4];

		for (int i = 0; i < arrayInpute.length; i++) {

		int resultArray = (arrayInpute[i]+1) * 10;

		arrayOutput[i] = resultArray;

		}

		for (int i=0;i<arrayInpute.length;i++) {

		System.out.print(" "+arrayOutput[i]);

		}

		}

}
