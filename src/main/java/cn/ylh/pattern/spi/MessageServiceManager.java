package cn.ylh.pattern.spi;
import java.util.Iterator;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;

public class MessageServiceManager {

	private final static ConcurrentHashMap<String, MessageService> services=new ConcurrentHashMap<String, MessageService>(); 
	
	static{
		loadInitialMessageServices();
	}
	public static MessageService getMessageService(String url){		
		
		return services.get(url);
	}
	public static synchronized void registerMessageService(MessageService messageService){
		if(messageService!=null){
			services.put(messageService.getClass().getName(), messageService);
		}else{
			throw new NullPointerException();
		}
	}
	private static void loadInitialMessageServices(){
		 /**
		  * ServiceLoader先读取META-INF目录中sevices中和load接口类全名一致的文件
		  * 这里用的LazyIterator
		  * 先利用hasNext判断文件的类路径
		  * next时候利用Class.forName加载类到jvm 并利用反射newInstance
		  * 如果不想用这个实例(想进行更多的赋值检测)可以在加载后具体的实现类执行自己的static代码块
		  * 调用MessageServiceManager.registerMessageService
		  * 将自己添加到MessageServiceManager的services中
		  * 用foreach是一样的
		  */
		ServiceLoader<MessageService> serviceLoader=ServiceLoader.load(MessageService.class);
		Iterator<MessageService> iterator=serviceLoader.iterator();
		while(iterator.hasNext()){
			MessageService service=iterator.next();
			services.put(service.getClass().getName(), service);
		}
	}
}
