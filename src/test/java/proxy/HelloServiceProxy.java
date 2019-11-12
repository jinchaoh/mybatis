package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by huangjinchao on 19-11-11.
 */
public class HelloServiceProxy implements InvocationHandler {

    private Object target;

    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("jdk动态代理 invoke");
        Object result = null ;
        System.out.println("反射方法前调用");
        result = method.invoke(target, args);
        System.out.println("反射方法后调用");
        return null;
    }
}
