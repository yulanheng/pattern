package cn.ylh.pattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy {

	private Object obj;
	public DynamicProxy(Object o){
		this.obj=o;
	}
	public Object getProxy(){
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println("begin...");
				Object result= method.invoke(obj, args);
				System.out.println("end...");
				return result;
			}
		});
	}
}

