package logger;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Melvin on 2015. 12. 3..
 */
public class test {

    @Autowired
    Logging logging;

    @Autowired
    MessageBean messageBean;

        public void ssd() throws Throwable{

        messageBean.sayHello();


    }
}
