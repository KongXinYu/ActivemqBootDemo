import com.wzy.topic.durable.activemq.TopicDurableMain;
import com.wzy.topic.durable.activemq.topic.TopicDurableProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@SpringBootTest(classes= TopicDurableMain.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestActiveMQ {

    @Autowired
    private TopicDurableProducer topicDurableProducer;

    @Test
    public void testSend(){
        topicDurableProducer.producerMsg();
    }


}
