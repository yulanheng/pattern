package cn.ylh.pattern.proxy;

public class StaticProxy implements UserService{

	private UserService obj;
	public  StaticProxy(UserService userService) {
		this.obj=userService;
	}
	@Override
	public void say() {
		System.out.println("before");
		obj.say();
		System.out.println("end");
		
	}

	@Override
	public void hello() {
		System.out.println("before");
		obj.hello();
		System.out.println("end");
		
	}

	
}
