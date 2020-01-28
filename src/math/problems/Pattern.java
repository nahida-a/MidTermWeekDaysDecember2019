package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */
		int number=100,x=1,y=1,m=1,n=1;
		for(int i=number;i>=1;i--){
			if(x<=10) {
				System.out.print(i + " ");
				x++;
			}
			else if(y<=10){
				System.out.print((i)+" ");
				i--;
				y++;
			}	else if(m<=10){
				System.out.print((i)+" ");
				i-=2;
				m++;
			}	else if(n<=10){
				System.out.print((i)+" ");
				i-=3;
				n++;
			}

		}


	}
}


	}
}
