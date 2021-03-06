package uin.co.id.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uin.co.id.student.entity.Student;

import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Optional<Student> findByEmail(String email);
}