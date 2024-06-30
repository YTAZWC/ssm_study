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
import java.util.Map;

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

    // 查询投影：不查询所有字段，只查询出指定内容的数据
    @Test
    void testGet() {
//        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
//        lambdaQueryWrapper.select(
//                User::getId,
//                User::getName,
//                User::getAge);
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
//        queryWrapper.select("id", "name", "age", "tel");
//        List<User> users = userDao.selectList(queryWrapper);
        queryWrapper.select("count(*) as count, tel");
        // 按电话分组
        queryWrapper.groupBy("tel");
        List<Map<String, Object>> users = userDao.selectMaps(queryWrapper);
        System.out.println(users);
    }

    @Test
    void testConditionEq() {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        // 等值=
        queryWrapper.eq(User::getName, "ytazwc").eq(User::getPassword, "ytazwc");
        // selectOne 查询单个
        User user = userDao.selectOne(queryWrapper);
        System.out.println(user);
    }

    @Test
    void testConditionScope() {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        // 范围查询 lt、le；gt、ge；eq；between
        queryWrapper.between(User::getAge, 10, 30);
        List<User> users = userDao.selectList(queryWrapper);
        System.out.println(users);
    }

    @Test
    void testConditionLike() {
        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        // 模糊查询 like
        queryWrapper.likeLeft(User::getName, "yt");
        List<User> users = userDao.selectList(queryWrapper);
        System.out.println(users);
    }

}
