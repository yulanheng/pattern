package cn.ylh.pattern.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

public class MessageServiceDemo {

	public static void main(String[] args) {
		ServiceLoader<MessageService> serviceLoader =ServiceLoader.load(MessageService.class);
		 Iterator<MessageService> iterator=serviceLoader.iterator();
		 /**
		  * ServiceLoader先读取META-INF目录中sevices中和load接口类全名一致的文件
		  * 这里用的LazyIterator
		  * 先利用hasNext判断文件的类路径
		  * next时候利用Class.forName加载类到jvm
		  * 用foreach是一样的
		  */
		 while(iterator.hasNext()){
			 MessageService service=iterator.next();
			 System.out.println(service.getMessage());
		 }
	}
}
