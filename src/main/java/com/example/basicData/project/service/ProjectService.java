package com.example.basicData.project.service;

import com.example.basicData.project.dto.ProjectDto;
import com.example.basicData.project.dto.ProjectResponseDto;
import com.example.basicData.project.entity.Project;

import java.util.List;

public interface ProjectService {
    List<ProjectResponseDto> getProjectsByStudentNrp(Long studentNrp);

    ProjectResponseDto createProject(ProjectDto projectDto);

    Project getProjectById(Long id);
}
