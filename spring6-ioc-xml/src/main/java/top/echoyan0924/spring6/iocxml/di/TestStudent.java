package top.echoyan0924.spring6.iocxml.di;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student student = context.getBean(Student.class);

        System.out.println(student);


    }

    @Test
    public void testStudent(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Student student1 = context.getBean("student1", Student.class);
        System.out.println(student1);
    }
}
