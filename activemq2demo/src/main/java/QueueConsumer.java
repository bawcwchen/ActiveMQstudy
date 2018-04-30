import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

/**
 * Function Desc: TODO
 * Date:2018/4/29 16:01
 * author:jun.chen02@hand-china.com
 */
public class QueueConsumer {
    private static JmsTemplate jt = null;

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        //获取JmsTemplate对象
        jt = (JmsTemplate) ctx.getBean("jmsTemplate");
        //接收消息
        String msg = (String) jt.receiveAndConvert();
        System.out.println("receive msg = " + msg);
    }
}
