package sample.ch1_4.usinglog;

import org.springframework.stereotype.Service;

/**
 * Created by Melvin on 2015. 12. 3..
 */

@Service
public class Test2 implements MessageBean{

    @Override
    public void sayHello() {
        System.out.println("Test2");
    }
}
