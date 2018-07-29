package RpcModule;

import Client.SocketClientProxy;
import Entity.Student;
import Server.Server;
import service.StudentService;

import java.io.IOException;

/**
 * Created by lcc on 2018/7/29.
 *
 */
public class ClientTest {
    public static void main(String[] arg) {
        SocketClientProxy proxy = new SocketClientProxy();
        StudentService studentService = proxy.getProxy(StudentService.class);
        Student student = studentService.getInfo();
        System.out.println(student.getName());
    }
}