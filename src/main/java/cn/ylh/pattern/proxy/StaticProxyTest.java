package cn.ylh.pattern.proxy;

public class StaticProxyTest {

	public static void main(String[] args) {
		UserService userService=new UserServiceImpl();
		StaticProxy proxy=new StaticProxy(userService);
		proxy.say();
		proxy.hello();
	}
}
