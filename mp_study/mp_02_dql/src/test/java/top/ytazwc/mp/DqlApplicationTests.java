package top.ytazwc.mp;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import top.ytazwc.mp.dao.UserDao;
import top.ytazwc.mp.domain.User;
import top.ytazwc.mp.domain.query.UserQuery;

import java.util.List;

@SpringBootTest
class DqlApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    void testGetAll() {
        // 方式一：按条件查询对应的操作
        QueryWrapper<User> queryWrapper1 = new QueryWrapper<>();
        queryWrapper1.lt("age", 18);
        List<User> users = userDao.selectList(queryWrapper1);
        System.out.println(users);

        // 方式二：使用Lambda格式按条件查询
        QueryWrapper<User> queryWrapper2 = new QueryWrapper<>();
        queryWrapper2.lambda().lt(User::getAge, 18);
        List<User> userList = userDao.selectList(queryWrapper2);
        System.out.println(userList);

        // 方式三：Lambda格式按条件查询
        LambdaQueryWrapper<User> lambdaQueryWrapper = new LambdaQueryWrapper<>();
//        // ＜ 10 and ＞ 30
//        lambdaQueryWrapper
//                .lt(User::getAge, 30)
//                .gt(User::getAge, 10);
        // < 10 or > 30
        lambdaQueryWrapper
                .lt(User::getAge, 10)
                .or()
                .gt(User::getAge, 30);
        List<User> list = userDao.selectList(lambdaQueryWrapper);
        System.out.println(list);
    }

    @Test
    void testGetAllAndNull() {
        // 模拟页面查询条件
        UserQuery query = new UserQuery();
        // 下限
//        query.setAge(10);
        // 上限
        query.setAgeUpper(30);
        // null判断
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.lt(null != query.getAgeUpper(), User::getAge, query.getAgeUpper())
                    .gt(null != query.getAge(), User::getAge, query.getAge());
        List<User> users = userDao.selectList(queryWrapper);
        System.out.println(users);
    }

}
