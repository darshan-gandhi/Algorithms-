import java.io.*;

class nQueens
{
	static int d = 0;
	static int count = 0;
	static int cols[] = null;	//to keep a track of column in which queen at that index is inserted
	public static void printBoard()
	{
		System.out.println("One of the solutions is: ");
		System.out.print("{ ");
		for(int i = 0;i < d;i++)
			System.out.print("( " + (i+1) + "," + (cols[i]+1) + " )  ");
		System.out.println("}\nAnd the respective board is : ");
		for(int i = 0;i<d;i++)
		{
			for(int j = 0;j<d;j++)
				if(j == cols[i])
					System.out.print("Q  ");
				else
					System.out.print("*  ");
			System.out.println();
		}
	}
	static boolean safe(int row,int col)
	{
		for(int j = 0;j < row;j++)
			if( cols[j] == col || Math.abs(cols[j] - col) == Math.abs(j - row) )
				return false;
		return true;
	}
	static void fit(int k)//k --> Queen no
	{
		if(k == d)
		{
			printBoard();
			count++;
			return;
		}
		for(int i = 0;i<d;i++)
		{
			if( safe(k,i) )
			{
				cols[k] = i;
				fit(k+1);
			}
		}
		return;
	}
	public static void main(String args[]) throws IOException
	{
		BufferedReader input = new BufferedReader( new InputStreamReader(System.in) );
		System.out.print("Enter the dimension of board: ");
		d = Integer.parseInt(input.readLine());
		cols = new int[d];
		fit(0);
		System.out.println("Total solutions = " + count + "\nThank You!!");
	}
}