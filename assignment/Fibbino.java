package week1day2.assignment;

public class Fibbino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0,num2=1;
		for(int i=1;i<=11;i++) {
			int sum=num+num2;
			System.out.println(sum);
			num=num2;
			num2=sum;
			
			
		}
		}

	}


