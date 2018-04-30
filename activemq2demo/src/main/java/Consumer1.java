import javax.jms.*;

/**
 * Function Desc: TODO
 * Date:2018/4/29 19:17
 * author:jun.chen02@hand-china.com
 */
public class Consumer1 implements MessageListener {
    @Override
    public void onMessage(Message message) {
        try {
            User msg = (User)(((ObjectMessage) message).getObject());
            System.out.println("Consumer1:" + msg);
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
}
