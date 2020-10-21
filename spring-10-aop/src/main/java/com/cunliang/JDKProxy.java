package com.cunliang;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    /**
     * 创建接口实现类代理对象
     */
    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
        UserDao instance = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(new UserDaoImpl()));
        int add = instance.add(1, 2);
        System.out.println("result:" + add);
    }

}

//创建对象代码
class UserDaoProxy implements InvocationHandler {

    //需要传递代理的对象！就是我们代理的东西

    private Object obj;
    //使用有参构造传递
    public UserDaoProxy(Object obj){
        this.obj = obj;
    }

    //增强的逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //写增强逻辑
        //方法之前处理
        System.out.println("方法之前处理"+method.getName() + ":传递的参数 "+ Arrays.toString(args));

        //被增强的方法被执行
        Object res = method.invoke(obj, args);

        //方法之后
        System.out.println("方法之后执行..."+obj);
        return res;
    }
}
