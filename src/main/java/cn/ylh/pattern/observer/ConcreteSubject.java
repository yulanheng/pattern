package cn.ylh.pattern.observer;
/**
 *真正被观察的对象
 */
public class ConcreteSubject extends Subject{

	private String state;
	public String getState() {
		return state;
	}
	public void change(String state){
		System.out.println("状态改变");
		this.state=state;
		this.notifyObservers();
	}
}
