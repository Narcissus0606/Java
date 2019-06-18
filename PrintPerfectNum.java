public class PrintPerfectNum{
	public static void main(String[] args){
		int num = 0;
		for(int i = 1;i <= 100;i++)
		{
			int sum = 0;
			for(int j = 1;j < i;j++)
			{	
				if(i % j == 0)
				{
					sum = sum + j;
				}
			}
			if(i == sum)
			{
				num++;
				System.out.print(i+" ");
				if(num % 5 == 0)
				{
					System.out.println();
				}					
			}
		}
		System.out.println("There are "+num+" perfect number!");
	}
}