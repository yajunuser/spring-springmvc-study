import com.javasoso.service.MyService;
import com.yajunsoso.service.impl.MyServiceImpl;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
@RunWith(JUnit4.class)

public class MyTestService extends TestCase {

    private MyService myService = new MyServiceImpl();

    @Test
    public void testDemo() {
        myService.save();
    }
}
