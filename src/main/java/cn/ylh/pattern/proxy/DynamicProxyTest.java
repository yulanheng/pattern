package cn.ylh.pattern.proxy;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {

	public static void main(String[] args) {
		UserService userService=new UserServiceImpl();
		DynamicProxy proxy=new DynamicProxy(userService);
		UserService us=(UserService) proxy.getProxy();
		us.say();
	}
	public void writeProxyClassToHardDisk(){
		
	}
}
