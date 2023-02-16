package stepan.finproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import stepan.finproject.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
