package logger;

/**
 * Created by Melvin on 2015. 12. 2..
 */
public class MessageBeanImpl implements MessageBean {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {

        System.out.println("Hello, !");
    }
}
