package jms.consumer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author crazzy
 * @date 2018/3/25
 */
public class AppConsumer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");

	}
}
