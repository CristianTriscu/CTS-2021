package test;

public class test {

	public  int maxGap(String vector , int size) {
		int contor;
		int contor2=0;
		int maxGap = 0;
		for (int i = 0; i < size - 1; i++) {
			if (vector.charAt(i)=='1') {
				
				contor = 0;
				for (int j = i + 1; j < size; j++) {

					if (vector.charAt(j) == '0') {
						contor++;
						if (contor > maxGap)
							maxGap = contor;
					}
					else {
						contor2++;
						break;
					}

				}
			}

		}

		
		if(contor2>0)
			return maxGap;
		else
			return 0;
	}

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
			String test=Integer.toBinaryString(32);
			test test1=new test();
			System.out.println(test1.maxGap(test,test.length()));
	}

}
