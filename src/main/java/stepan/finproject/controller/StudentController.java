package stepan.finproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import stepan.finproject.model.Student;
import stepan.finproject.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/api/student/save")
    public Student save(Student student){
        return studentRepository.save(student);
    }

    @GetMapping("/api/student/findById")
    public Optional<Student> findById(Integer id){
        return studentRepository.findById(id);
    }

    @GetMapping("/api/student/findAll")
    public List<Student> findAll(){
        List<Student> students = studentRepository.findAll();
        return students;
    }
}
