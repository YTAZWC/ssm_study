package top.ytazwc.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import top.ytazwc.spring.dao.BookDao;

/**
 * @author yt
 * 2024/6/11
 */
public class AppForBeanFactory {
    public static void main(String[] args) {
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory bf = new XmlBeanFactory(resource);
        BookDao bookDao = bf.getBean("bookDao", BookDao.class);
        bookDao.save();
    }
}
