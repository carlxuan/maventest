package carlxuan.algorithm;

public class DecoratorTest {

	public static void main(String[] args) {
		Standard s = new Standard();
		Plugin p = new Queuing(new Sor(s));
		System.out.println(p.process());
	}

	static interface Plugin
	{
		String process();
	}
	
	static class Queuing implements Plugin
	{
		Plugin p;
		public Queuing(Plugin p)
		{
			this.p = p;
		}
		
		public String process()
		{
			
			return p.process()+" Queuing ";
		}
	}
	
	static class Sor implements Plugin
	{
		Plugin p;
		public Sor(Plugin p)
		{
			this.p = p;
		}
		
		public String process()
		{
//			p.process();
			return p.process()+" Sor ";
		}
	}
	
	static class Standard implements Plugin
	{	
		public String process()
		{
			return "Standard";
		}
	}

}
