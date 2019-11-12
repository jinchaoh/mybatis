package proxy;

/**
 * Created by huangjinchao on 19-11-11.
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        System.out.println("hello" + name);
    }
}
