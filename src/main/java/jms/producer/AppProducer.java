package jms.producer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author crazzy
 * @date 2018/3/25
 */
public class AppProducer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:producer.xml");
		ProducerService service = context.getBean(ProducerService.class);
		for (int i = 0; i < 100; i++) {
			service.sendMessage("消息" + i);
		}
		context.close();

	}
}
