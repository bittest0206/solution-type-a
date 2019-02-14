package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		
		
		int res , numberof369 =0;
		
			if(number>=1&&number<=99) {
			res = number %10;
			if((res==3)||(res==6)||(res==9))
				numberof369++;
			res = number/10;
			if((res==3)||(res==6)||(res==9))
				numberof369++;
			if(numberof369==1)
				System.out.println(number+"짝");
			else if(numberof369 ==2)
				System.out.println(number+"짝짝");
		}
	
		return 0;
	}
}