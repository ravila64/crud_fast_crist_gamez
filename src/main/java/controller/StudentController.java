package controller;

import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.StudentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping
    public List<Student> getAll(){
        return studentService.getStudents();
    }
    @GetMapping("/{studentId}")
    public Optional<Student> listStudent(@PathVariable Long studendId){
        return studentService.getStudent(studendId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Student student){
        studentService.saveOrUpdate(student);
    }
    @DeleteMapping("/{studentId}")
    public void deleteStudent(@PathVariable Long studentId){
        studentService.delete(studentId);
    }

}
