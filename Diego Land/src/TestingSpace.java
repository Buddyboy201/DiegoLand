public class TestingSpace {
	
	String name;
	int age;
	boolean run = true;
	
	TestingSpace(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	void Loop()
	{
		while (run) {
			
			System.out.println("loop");
			
		}
	}
	
	String getName()
	{
		return this.name;
	}
	
	public static void main(String[] args) {
		TestingSpace t = new TestingSpace("Anish", 100);
		t.Loop();
		
	}
	
}