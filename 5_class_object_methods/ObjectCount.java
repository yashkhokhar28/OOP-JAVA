class countobj {
	static int totalcount = 0;

	public countobj ( ) {
		this.totalcount++;
	}

	public void printtotalcount ( ) {
		System.out.println ( totalcount );
	}
}

public class ObjectCount {
	public static void main ( String[] args ) {
		countobj co1 = new countobj ( );
		countobj co2 = new countobj ( );
		countobj co3 = new countobj ( );
		countobj co4 = new countobj ( );
		countobj co5 = new countobj ( );

		co5.printtotalcount ( );

	}
}
