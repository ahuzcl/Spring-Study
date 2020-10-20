import com.cunliang.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        //获取spring上下文对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        //对象在spring中管理
        Hello hello = (Hello) applicationContext.getBean("hello");
        System.out.println(hello.toString());


    }
}
