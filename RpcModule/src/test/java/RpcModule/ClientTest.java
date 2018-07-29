package RpcModule;

import Client.SocketClientProxy;
import Entity.Book;
import Entity.Student;
import Server.Server;
import service.StudentService;
import service.TeacherService;

import java.io.IOException;

/**
 * Created by lcc on 2018/7/29.
 *
 */
public class ClientTest {
    public static void main(String[] arg) {
        SocketClientProxy proxy = new SocketClientProxy();
        StudentService studentService = proxy.getProxy(StudentService.class);
        Book book1 = studentService.say("张三","你辛苦了");
        Book book2 = studentService.say("李四","我喜欢你");

        System.out.println(book1.getBelongWho()+"的"+book1.getBookName());
        System.out.println(book2.getBelongWho()+"的"+book2.getBookName());


        TeacherService teacherService = proxy.getProxy(TeacherService.class);
        teacherService.say("大家好，请坐下");

    }
}