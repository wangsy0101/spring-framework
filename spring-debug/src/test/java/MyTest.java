import cn.debug.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wangsy on 2021/5/4
 */
public class MyTest {


	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = ac.getBean("userService", UserService.class);
		System.out.println(userService.getName());
	}
}
