package stepan.finproject.service;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import stepan.finproject.model.Student;
import stepan.finproject.repository.StudentRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

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
