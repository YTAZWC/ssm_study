package top.ytazwc.mp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.ytazwc.mp.dao.UserDao;
import top.ytazwc.mp.domain.User;

import java.util.List;

@SpringBootTest
class DmlApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testGet() {
        List<User> users = userDao.selectList(null);
        System.out.println(users);
    }

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
        // 多个删除
//        List<Long> ids = new ArrayList<>();
//        ids.add(1807379197159948289L);
//        ids.add(1807378883539267585L);
//        ids.add(1807352144939393026L);
//        userDao.deleteByIds(ids);
        userDao.deleteById(2L);
    }

    @Test
    void testUserUpdate() {
//        User user = new User();
//        user.setId(3L);
//        user.setName("good boy");
//        user.setVersion(1);
//        userDao.updateById(user);
        // 1. 先通过要修改数据的id将当前数据查询出来
        User user1 = userDao.selectById(5L);
        // 2. 将修改的属性逐一设置进去
        user1.setName("花木兰");
        // 3. 执行修改
        userDao.updateById(user1);
    }

    @Test
    void testUserUpdate2() {
        // 模拟秒杀场景
        User user1 = userDao.selectById(6L);    // version = 1
        User user2 = userDao.selectById(6L);    // version = 1

        user1.setName("秦良玉");
        userDao.updateById(user1);  // version = 2
        user2.setName("qly");
        userDao.updateById(user2);  // version = 1已经不成立
    }

}
