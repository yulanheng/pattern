package cn.ylh.pattern.observer;

public interface Observer {

	/**
	 * 更新
	 * @param subject 传入被观察者对象
	 */
	public void update(Subject subject);
}
