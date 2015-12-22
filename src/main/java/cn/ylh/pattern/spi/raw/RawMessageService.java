package cn.ylh.pattern.spi.raw;
import cn.ylh.pattern.spi.MessageService;
public class RawMessageService implements MessageService{

	@Override
	public String getMessage() {
		  return "Raw message";  
	}

}
