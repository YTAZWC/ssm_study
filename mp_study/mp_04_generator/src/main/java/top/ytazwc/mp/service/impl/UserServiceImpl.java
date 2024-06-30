package top.ytazwc.mp.service.impl;

import top.ytazwc.mp.domain.User;
import top.ytazwc.mp.dao.UserDao;
import top.ytazwc.mp.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 花木凋零成兰
 * @since 2024-06-30
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {

}
