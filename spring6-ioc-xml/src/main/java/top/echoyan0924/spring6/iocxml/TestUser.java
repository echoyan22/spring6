package top.echoyan0924.spring6.iocxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User) context.getBean("user");
        System.out.println("1 根据id获取bean:"+user);

        User user1 = context.getBean(User.class);
        System.out.println("2 根据类型获取bean:"+user1);

        User user2 = context.getBean("user", User.class);
        System.out.println("3 根据id+类型获取bean:"+user2);
    }

}
