
public class name {
	
	private int num;
	private int avg;
	private long bon;
		
	public name(int number) {
		num = number;
	}
	
	public void average() {
		avg = num/2;
		System.out.println("average is" +avg);
	}
	public void bonus() {
		bon =  avg + num;
		System.out.println("Bonus is " +bon);
		
	}
	

}
