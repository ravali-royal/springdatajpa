package info.ravali.entity.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import info.ravali.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Serializable>{

}
