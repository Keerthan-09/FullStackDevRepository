class Average
{
	static double avg(int k[])
	{
		double sum=0;
		for(int i=0;i<k.length;i++) {
			sum=sum+k[i];
		}
		return (sum/k.length);
	}
}
public class Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double k=Average.avg(new int[]{1,2,3,4});
		System.out.println(k);

	}

}
