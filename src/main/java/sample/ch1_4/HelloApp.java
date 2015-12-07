package sample.ch1_4;

import org.springframework.beans.factory.annotation.Autowired;

import sample.ch1_4.usinglog.Test2;

/**
 * Created by Melvin on 2015. 12. 2..
 */
public class HelloApp {


    @Autowired
    LoggingSample loggingsample;

    @Autowired
    Test2 test2;
    public static void main(String[] args) {
//        BeanFactory factory = new FileSystemXmlApplicationContext("beans.xml");
//       MessageBean bean = (MessageBean)factory.getBean("targetBean");
//
//        bean.sayHello();

     Test2 test2 = new Test2();
        test2.sayHello();
    }
}
