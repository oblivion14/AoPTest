package sample.ch1_4.usinglog;

import org.springframework.stereotype.Service;

/**
 * Created by Melvin on 2015. 12. 2..
 */

@Service
public class MessageBeanImpl implements MessageBean {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {

        System.out.println("Hello, " + name + "!");
    }
}
