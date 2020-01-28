package math.problems;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */
		int maxNumber=100,k=0;
		int primeStatus = 1;
		int num = 3;
		int []dbArray=new int[maxNumber];

		if (maxNumber >= 1)
		{
			System.out.println("Enter "+maxNumber+" prime numbers are:");
			System.out.println(2+" ");
			dbArray[k]=2;
			k++;
		}

		for ( int i = 2 ; i <=maxNumber ;  )
		{
			for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
			{
				if ( num%j == 0 )
				{
					primeStatus = 0;
					break;
				}
			}
			if ( primeStatus != 0 )
			{
				System.out.print(num+" ");
				dbArray[k]=num;
				k++;

				i++;
			}
			primeStatus = 1;
			num++;
		}

		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		connectToSqlDB.insertDataFromArrayToSqlTable(dbArray, "PrimeNumber", "Numbers");
		List<String> numbers = connectToSqlDB.readDataBase("PrimeNumber", "Numbers");



	}

}
