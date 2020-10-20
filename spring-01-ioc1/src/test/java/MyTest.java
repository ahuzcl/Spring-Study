import com.cunliang.dao.UserDaoMysqlImpl;
import com.cunliang.service.UserService;
import com.cunliang.service.UserServiceImpl;

public class MyTest {

    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();

        userService.setUserDao(new UserDaoMysqlImpl());

        userService.getUser();


    }

}
