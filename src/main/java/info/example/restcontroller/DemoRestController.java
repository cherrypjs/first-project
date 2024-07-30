package info.example.restcontroller;

import info.example.DemoApplication;
import info.example.Entity.Student;
import info.example.repository.StudentDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping(value = "/rest")
public class DemoRestController {



        private static final Logger logger = LoggerFactory.getLogger(DemoRestController.class);

        //메인 페이지 이동
        @RequestMapping(value = "/main", method = RequestMethod.GET)
        public void mainPageGET() {

            logger.info("메인 페이지 진입");



    }
    private StudentDAO studentDAO;
    private Long newStudentId;

    @Autowired
    public DemoRestController(StudentDAO studentDAO){
        this.studentDAO =studentDAO;
    }
    @GetMapping("/insert")
    public String inStudent(){
        Student newStudent = new Student();
        newStudent.setName("홍길사");
        newStudent.setEmail("abc4@abc.com");
        newStudent.setPassword("1234");
        newStudent.setRegdate(LocalDateTime.now());
        newStudentId = studentDAO.insert(newStudent);
        return "inserted id" +  String.valueOf((newStudentId));
    }
}
