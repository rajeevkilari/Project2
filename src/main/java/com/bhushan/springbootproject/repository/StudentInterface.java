package com.bhushan.springbootproject.repository;
import com.bhushan.springbootproject.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentInterface extends JpaRepository<StudentEntity, Integer> {

}
