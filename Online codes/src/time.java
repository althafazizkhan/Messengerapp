import java.util.Formatter;

public class time {

	public static class hour {
		private int hour;
		private int minute;
		private int second;

		public hour(int h, int m, int s) {
			hour = (h >= 0 && h <= 24 ? h : 0);
			minute = (m >= 0 && m <= 60 ? m : 0);
			second = (s >= 0 && s <= 60 ? s : 0);
		}
		
		

		public void display() {
		System.out.println("time is " + hour + ":" + minute + ":" +second);
		
		}
	}

	public static void main(String[] args) {

	 final Formatter x;
	 try {
		 x = new Formatter("Khan.txt");
		 
		 
	 }
	 catch(Exception e) {
		 System.out.println("failed!!!");
	 }
	 
	 
	}

}
