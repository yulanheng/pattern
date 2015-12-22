package cn.ylh.pattern.spi.formatted;
import cn.ylh.pattern.spi.MessageService;
public class FormattedMessageService implements MessageService {  
    public String getMessage() {  
        return "Formatted message";  
    }  
}  