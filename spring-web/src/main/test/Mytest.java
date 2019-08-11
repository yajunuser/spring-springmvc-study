import com.javasoso.service.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(JUnit4.class)
public class Mytest {
    @Autowired
    private MyService myService;
    @Test
    public void demo(){
        myService.save();
    }
}
