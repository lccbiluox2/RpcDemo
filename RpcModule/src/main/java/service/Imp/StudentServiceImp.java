package service.Imp;

import Entity.Book;
import Entity.Student;
import service.StudentService;

public class StudentServiceImp implements StudentService {
    @Override
    public Book say(String studentName,String str) {
        System.out.print("学生"+studentName+"对老师说："+str);
        Book stu = new Book();
        stu.setBookName("马克思理论");
        stu.setBelongWho(studentName);
        return stu;
    }

}
