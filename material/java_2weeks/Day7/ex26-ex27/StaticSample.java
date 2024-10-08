public class StaticSample {
	private static int count = 0;
	private int myNo = 0;
	public StaticSample(int no) {
		count++;
		this.myNo = no;
	}
	public void hello() {
		System.out.println("I'm " + myNo + "/" + count);
	}
}
