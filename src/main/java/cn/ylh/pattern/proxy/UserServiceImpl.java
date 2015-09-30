package cn.ylh.pattern.proxy;

public class UserServiceImpl implements UserService{

	@Override
	public void say() {
		System.out.println("say.....");
		
	}

	@Override
	public void hello() {
		System.out.println("hello....");
		
	}

}
