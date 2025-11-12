public class CalcPi {
	public static void main(String [] args) { 
		int a = Integer.parseInt(args[0]);
		double count = 0.0;
		for (int i = 0; i<a; i++){
			double b = 2 * i + 1;
			double c = 1.0/b;
			if (i%2 == 0)
			 	count = count + c;
			else
				count = count - c;
		}
		double piApprox = count * 4;

		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + piApprox);

	}
}

