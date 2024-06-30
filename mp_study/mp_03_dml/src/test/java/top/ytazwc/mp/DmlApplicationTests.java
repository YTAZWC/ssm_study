package top.ytazwc.mp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.ytazwc.mp.dao.UserDao;
import top.ytazwc.mp.domain.User;

@SpringBootTest
class DmlApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testSave() {
        User user = new User();
//        user.setId(667L);
        user.setName("mjx");
        user.setPassword("lzy");
        user.setAge(22);
        user.setTel("13278786767");
        userDao.insert(user);
    }

    @Test
    void testDelete() {

    }

    @Test
    void testUserUpdate() {

    }

}
