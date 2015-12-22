package cn.ylh.pattern.spi;

public class Demo {

	public static void main(String[] args) {
		MessageService service=MessageServiceManager.getMessageService("cn.ylh.pattern.spi.raw.RawMessageService");
		System.out.println(service.getMessage());
	}
}
