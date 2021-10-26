import com.wei.dao.UserDaoImpl;
import com.wei.dao.UserDaoMySQLImpl;
import com.wei.service.UserService;
import com.wei.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//        ((UserServiceImpl) userService).setUserDao(new UserDaoImpl());
//        userService.getUser();
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService= (UserService) context.getBean("userServiceImpl");
        userService.getUser();

    }
}
