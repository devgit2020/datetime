import java.util.Arrays;
import java.util.Collections;

public class SquareTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int axis[]  =  {10,6,5,5,5,3,3,3,2,2,2,2};
		
		
		
		int sum  =0;
        for (int i = 0; i < axis.length; i++) {  
           sum = sum + axis[i];  
        }  
        
        int result = sum / 4;
       
		
		
		Arrays.sort(axis);
		System.out.println(Arrays.toString(axis));

		int firstAxis = result;
		int axisCount = 1;
		
		for(int count = axis.length -1;count >= 0;count -- ) {
			if(axis[count ] == -1) continue;
			int tmp = 0;
			for(int count2 = count-1; count2 >=0 ;count2--) {
				if(axis[count2 ] == -1) continue;
				if(axis[count ] == firstAxis) {
					axisCount++;
					break;
				}else {
					tmp = axis[count] + axis[count2 ];
					if(tmp == firstAxis) {
						axisCount++;
						axis[count2 ] = -1;
						break;
					}else if(tmp > firstAxis) {
						tmp = tmp - axis[count2 ];
					}
				}
				
			}
		}
		if(axisCount == 4) {
			System.out.println("TRUE");
		}else {
			System.out.println(axisCount);
		}
		
			
		
	}
}
