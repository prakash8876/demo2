package io.matoshri.demo2;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "api/{version}/students", version = "1")
public class StudentController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Student> getAllStudents() {
        return List.of(
                new Student(1, "Foo", 20),
                new Student(2, "Bar", 21)
        );
    }
}
