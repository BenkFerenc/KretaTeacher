package org.vasvari.kreta.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vasvari.kreta.model.Teacher;
import org.vasvari.kreta.repo.interfaces.TeacherRepository;


import java.util.ArrayList;
import java.util.List;

@Service
public class TeacherService {
    @Autowired
    TeacherRepository teacherRepository;

    public List<Teacher> getAllTeacher() {
        List<Teacher> teachers = new ArrayList<Teacher>();
        teacherRepository.findAll().forEach(teacher -> teachers.add(teacher));
        return teachers;
    }

    public Teacher getSubjectById(Long id) {
        return teacherRepository.findById(id).get();
    }

    public void saveOrUpdate(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    public void delete(Long id) {
       teacherRepository.deleteById(id);
    }

    public void update(Teacher teacher, Long id) {
       teacherRepository.save(teacher);
    }
}
