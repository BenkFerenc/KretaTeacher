package org.vasvari.kreta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.vasvari.kreta.model.Teacher;
import org.vasvari.kreta.service.TeacherService;

import java.util.List;

@RestController
public class TeacherAPIController {

    @Autowired
    TeacherService service;

    @GetMapping(value = "/api/teacher", name = "List of all teachers.")
    public List<Teacher> getAllSubjects() {
        return service.getAllTeacher();
    }

    @PostMapping(value = "/api/teacher", name= "Save teacher")
    public long saveSubject(@RequestBody Teacher teacher){
        service.saveOrUpdate(teacher);
        return teacher.getId();
    }

    @PutMapping(value = "/api/teacher",name="Update teacher")
    private Teacher update(@RequestBody Teacher teacher) {
        service.saveOrUpdate(teacher);
        return teacher;
    }

    @DeleteMapping(value="/api/teacher/{teacherid}",name = "Delete teacher")
    private void deleteTeacher(@PathVariable("teacherid") Long teacherid) {
        service.delete(teacherid);
    }




}
