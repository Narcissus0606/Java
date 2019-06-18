public class PrintPrimeNum{
	public static void main(String[] args){
		int num = 0;
		for(int i = 2;i <=100;i++)
		{
			int count = 0;
			for(int j = 1;j <= i;j++)
			{	
				if(i % j == 0)
				{
					count++;
				}
			}
			if(count <= 2)
			{
				num++;
				System.out.print(i+" ");
				if(num % 5 == 0)
				{
					System.out.println();
				}					
			}			
		}
		System.out.println("There are "+num+" prime number!");
	}
}