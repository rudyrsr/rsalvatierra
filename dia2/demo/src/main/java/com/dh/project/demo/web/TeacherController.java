package com.dh.project.demo.web;

import com.dh.project.demo.domain.Teacher;
import com.dh.project.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jhonny on 5/18/17.
 */
@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    TeacherService teacherService;
    @RequestMapping(method = RequestMethod.GET)
    public List<Teacher> getTeacher(){
        return teacherService.getAllTeachers();
    }
}
