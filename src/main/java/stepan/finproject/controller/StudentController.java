package stepan.finproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import stepan.finproject.model.Student;
import stepan.finproject.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @PostMapping("/save")
    public Student save(@RequestBody Student student){
        return studentRepository.save(student);
    }

    @GetMapping("/findById")
    public Optional<Student> findById(@RequestParam Integer id){
        return studentRepository.findById(id);
    }

    @GetMapping("/findAll")
    public List<Student> findAll(){
        List<Student> students = studentRepository.findAll();
        return students;
    }
}
