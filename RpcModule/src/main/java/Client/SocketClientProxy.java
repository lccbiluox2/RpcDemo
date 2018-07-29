package Client;

import Entity.Request;
import service.StudentService;
import service.TeacherService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SocketClientProxy {
    private socketClient sock = new socketClient();


    public  <T> T getProxy(Class<T> clazz){
        // 加入这一段可以在磁盘中生成 代理类，让我们看到代理类的真面目
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");


        ClassLoader classLoder = Thread.currentThread().getContextClassLoader();
        Class[] classInterfaceArr = new Class[]{StudentService.class, TeacherService.class};

        InvocationHandler invocationHandler = new InvocationHandler(){
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Request request = new Request();
                request.setClassName(method.getDeclaringClass().getName());
                request.setMethodName(method.getName());
                request.setParamTypes(method.getParameterTypes());
                request.setParams(args);
                return  sock.invoke(request,"127.0.0.1",12000);
            }
        };

         return (T) Proxy.newProxyInstance(classLoder, classInterfaceArr, invocationHandler);
    }
}
