package top.ytazwc.mp;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.ytazwc.mp.dao.UserDao;
import top.ytazwc.mp.domain.User;

import java.util.List;

@SpringBootTest
class QuickstartApplicationTests {
    @Autowired
    private UserDao userDao;

    @Test
    void testSave() {
        User user = new User();
        user.setName("name_bbf737a68ff5");
        user.setPassword("password_51456f17ddd4");
        user.setAge(22);
        user.setTel("tel_5a67b613bfa8");
        userDao.insert(user);
    }

    @Test
    void testDelete() {
        userDao.deleteById(1806971312790990849L);
    }

    @Test
    void testUpdate() {
        User user = new User();
        user.setName("yt");
        user.setPassword("yt");
        user.setAge(22);
        user.setTel("15634348888");
        user.setId(1806971917282467842L);
        userDao.updateById(user);
    }

    @Test
    void testGetById() {
        User user = userDao.selectById(1806971917282467842L);
        System.out.println(user);
    }

    @Test
    void testGetAll() {
        List<User> users = userDao.selectList(null);
        System.out.println(users);
    }

    @Test
    void testGetByPage() {
        IPage<User> page = new Page<>(2, 3);
        userDao.selectPage(page, null);
        System.out.println("当前页码值: " + page.getCurrent());
        System.out.println("每页显示数: " + page.getSize());
        System.out.println("一共多少页: " + page.getPages());
        System.out.println("一共多少条数据: " + page.getTotal());
        System.out.println("数据: " + page.getRecords());
    }

}
