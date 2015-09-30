package cn.ylh.pattern.observer;

public class ObserverTest {

	public static void main(String[] args) {
		//创建主题对象
		ConcreteSubject subject=new ConcreteSubject();
		//创建观察者对象
		Observer observer=new ConcreteObserver();
		//将观察者对象关联到主题对象
		subject.attach(observer);
		//主题对象改变状态
		subject.change("cccccc");
		
	}
}
