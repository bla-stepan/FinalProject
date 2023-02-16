package stepan.finproject.service;

import org.springframework.stereotype.Service;
import stepan.finproject.model.Student;
import stepan.finproject.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    public StudentService(final StudentRepository studentRepo) {
        studentRepository = studentRepo;
    }

    public Student save(Student student){
        return studentRepository.save(student);
    }

    public Optional<Student> findById(Integer id){
        return studentRepository.findById(id);
    }

    public List<Student> findAll(){
        List<Student> students = studentRepository.findAll();
        return students;
    }

}
