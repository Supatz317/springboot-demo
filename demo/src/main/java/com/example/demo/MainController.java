package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestMethod;



@Controller
@RequestMapping("/demo")
public class MainController {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private SubjectRepository subjectRepository;

    // @GetMapping("")
    // public @ResponseBody String getMethodName() {
    //     return "Hello, " + "World" + "!";
    // }

    @PostMapping(path="/add-student") 
    public @ResponseBody String addNewStudent (@RequestBody Student student) {
        studentRepository.save(student);
        return "Saved";
    }

    @GetMapping(path="/all-student")
    public @ResponseBody Iterable<Student> getAllStudents() {
        // This returns a JSON or XML with the users
        return studentRepository.findAll();
    }

    @GetMapping(path="/find-student-id")
    public @ResponseBody Student getStudent(@RequestParam int id) {
        return studentRepository.findById(id).get();
    }

    @PostMapping(path="/add-subject")
    public @ResponseBody String addnewsubject (@RequestBody Subject subject) {
        subjectRepository.save(subject);
        return "Saved";
    }

    @GetMapping(path="/all-subject")
    public @ResponseBody Iterable<Subject>  getAllSubject() {
        return subjectRepository.findAll();
    }
    
    

    
}
