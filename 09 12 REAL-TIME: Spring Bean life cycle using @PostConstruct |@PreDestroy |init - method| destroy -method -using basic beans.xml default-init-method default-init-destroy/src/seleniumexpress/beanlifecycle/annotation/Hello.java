package seleniumexpress.beanlifecycle.annotation;

public class Hello {
	
	public void init()
	{
		System.out.println("inside hellow class init method");
	}
	
	public void destroy()
	{
		System.out.println("inside hellow class destroy method");
	}

}
