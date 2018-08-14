import com.jxufe.dao.UserDAO;
import com.jxufe.entity.User;
import com.jxufe.entity.UserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author cgg 891842749@qq.com
 * @Date 2018-08-02 14:52:56
 * @Description gitee:www.gitee.com/cgggitee/
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/ApplicationContext.xml")
public class TestMain {

    @Autowired
    private UserDAO userDAO;

    @Test
    public  void testUserDAO1(){
       userDAO.selectByExample(new UserExample());
    }

    @Test
    public  void testUserDAO2(){
        userDAO.selectByPrimaryKey(1);
    }

    @Test
    public  void testUserDAO3(){
        User user=new User();
        user.setuName("cggtest");
        user.setPassword("123456");
        user.setRoleid(1);
        user.setScore(100);
        userDAO.insertSelective(user);
    }
}
