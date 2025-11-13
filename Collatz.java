// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int n=Integer.parseInt(args[0]);
		String v_OR_c=args[1];
		if(v_OR_c.equals("v")){
			for(int i=1;i<=n;i++){
			int t=i,count=1;
			System.out.print(i);
			do { 
				if(t%2==0)
					t=t/2;
				else t=(t*3)+1;
				System.out.print(" "+ t);
				count++;
			} while (t>1);
			System.out.println(" ("+count+")");
		}	
		}
	
		System.out.println("Every one of the first "+ n +" hailstone sequences reached 1.");
	}

}
