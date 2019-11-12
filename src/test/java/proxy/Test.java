package proxy;

/**
 * Created by huangjinchao on 19-11-11.
 */
public class Test {
    public static void main(String[] args) {

        HelloServiceProxy helloServiceProxy = new HelloServiceProxy();
        HelloService helloService = (HelloService) helloServiceProxy.bind(new HelloServiceImpl());
        helloService.sayHello("张三");


        HelloServiceCgLib helloServiceCgLib = new HelloServiceCgLib();
        HelloServiceImpl helloService1 = (HelloServiceImpl) helloServiceCgLib.getInstance(new HelloServiceImpl());
        helloService1.sayHello("李四");
    }
}
