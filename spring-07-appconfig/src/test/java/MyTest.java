import com.cunliang.config.Myconfig;
import com.cunliang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {


    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class);
        User user = (User) context.getBean("getUser");
        System.out.println(user.getName());
    }

}
