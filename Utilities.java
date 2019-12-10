import java.util.*;

public class Utilities {
	public static Object userInput() {
		Scanner input = new Scanner(System.in);
		Object result = input.nextLine();
		input.close();
		return result;
	}
	
	//public static double cantor(int x, int y) {
		//int xplusy = x + y;
		//int xplusyplus1 = xplusy + 1;
		//int toprow = xplusy * xplusyplus1;
		//double firstbit = toprow / 2;
		//double sum = firstbit + y;
		//return sum;
//}

	//public static int[] depair(int z) {
		//int [] toReturn = null;
		//int eighttimeszplusone = 8 * z + 1;
		//double root = Math.sqrt(eighttimeszplusone);
		//double rootminus1 = root - 1;
		//double divideby2 = rootminus1 / 2;
		//double w = Math.floor(divideby2);
		//double extrastuff = w * w + w;
		//double t = extrastuff / 2;
		//double y = z - t;
		//double x = w - y;
		//toReturn [0] = (int) x;
		//toReturn [1] = (int) y;
		//return toReturn;
//}

}
