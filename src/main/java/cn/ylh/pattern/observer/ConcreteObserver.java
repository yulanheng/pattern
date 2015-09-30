package cn.ylh.pattern.observer;
/**
 * 具体的观察者
 */
public class ConcreteObserver implements Observer{

	@Override
	public void update(Subject subject) {
		ConcreteSubject subject2=(ConcreteSubject) subject;
		System.out.println("被观察者对象状态变为："+subject2.getState());
		
	}

}
