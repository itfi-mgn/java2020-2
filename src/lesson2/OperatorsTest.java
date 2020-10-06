package lesson2;

public class OperatorsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int		x, y, z;
		
		x = 0;
		x += 10;	// x = x + 10;
		x++; ++x;	// x += 1;
		--x; --x;	// x -= 1;
		
		if (x > 0) {
		}
		else {
			y = 10;
		}
		
		while (x > 0) {
			x--;
		}

		do {
			x--; 
		} while (x > 0); 
		
		for (int i = 0; i < 10; i++) {
			//  sdklfjsdfjklsdjfklj
			x = i;
		}
		
		int i = 0;
		while (i < 10) {
			// 	sdklfjsdfjklsdjfklj
			i++;
		}
		
		int[]	array = null;
		
		int sum = 0;
		for (int item : array) {
			// ......
			sum += item;
		}

//		for (int i = 0; i < array.length; i++) {
//			int	item = array[i];
//			// ......
//		}

label1:	while (x > 0) {
			if (x % 2 == 0) {
				continue;	// goto Label1;
			}
			if (x % 3 == 0) {
				break;	// goto Label2;
			}
			// .......
		}
Label2: ;
		
		for (int i = 0; i < 10; 
Label3:				
				i++) {
			if (x % 2 == 0) {
				continue;	// goto Label3;
			}
			if (x % 3 == 0) {
				break;	// goto Label4;
			}
			// .......
		}
Label4:		

	
	int i = 0;
	while (i < 10) {
		// 	sdklfjsdfjklsdjfklj
		if (x % 2 == 0) {
			continue;	// goto Label5;
		}
		if (x % 3 == 0) {
			break;	// goto Label6;
		}
Label5:	i++;
	}
Label6:	;
	
L1:	
Label11:	
	while(x > 0) {
		while(y > 0) {
			if (x > y) {
				break L1;	// goto Label10:
				continue L1;	// goto Label11:
			}
		}
	}
Label10: ;	
	
//		break;
//		continue;
	
		switch (x) {	// byte short char int
			case 0:			// case 0 -> y = 1;
				y = 1;
				break;	// goto Label100
			case 1:			// case 1,4 -> y = 2; 
			case 4: 
				y = 2;
				break;	// goto Label100
			case 2:
				y = 3;
				break;	// goto Label100
			default :
				y = 4;
		}
Label100:;
		
		return;
	}

}
