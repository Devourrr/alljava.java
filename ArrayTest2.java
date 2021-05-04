package week7day2;

public class ArrayTest2 {

	public static void main(String[] args) {
		int no=0;
		int[][][]a;
		a = new int[3][][];
		a[0] = new int[3][];
		a[1] = new int[3][];
		a[2] = new int[3][];
		
		a[0][0]= new int [3];
		a[0][1]= new int [3];
		a[0][2]= new int [3];
		a[1][0]= new int [3];
		a[1][1]= new int [3];
		a[1][2]= new int [3];
		a[2][0]= new int [3];
		a[2][1]= new int [3];
		a[2][2]= new int [3];
		

		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++) {
				no +=10;
//				a[i][j] = no;
				System.out.println("a[" + i +"]"+"["+j+"]="+a[i][j]);
				for(int k=0; k>a[j].length; k++) {
					no +=10;
					a[i][j][k] =no;
					System.out.println("a[" + i +"]"+"["+j+"]"+"["+k+"]="+a[i][j][k]);
				}
			}
			
			System.out.println();
		}
	}

}
