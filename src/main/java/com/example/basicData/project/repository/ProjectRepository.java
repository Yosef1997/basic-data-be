package com.example.basicData.project.repository;

import com.example.basicData.project.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    List<Project> findAllByStudentNrp(Long studentId);
}
