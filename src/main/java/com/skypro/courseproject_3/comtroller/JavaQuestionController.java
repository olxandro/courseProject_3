package com.skypro.courseproject_3.comtroller;

import com.skypro.courseproject_3.model.Question;
import com.skypro.courseproject_3.service.JavaQuestionService;
import com.skypro.courseproject_3.service.QuestionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam/java")
public class JavaQuestionController {

    private final QuestionService service;

    public JavaQuestionController(JavaQuestionService service) {
        this.service = service;
    }

    @RequestMapping("/add")
    public Question addQuestion(@RequestParam String question, String answer) {
        return service.add(question, answer);
    }

    @GetMapping()
    public Collection<Question> getQuestions() {
        return service.getAll();
    }

    @RequestMapping("/remove")
    public Question removeQuestion(@RequestParam String question, String answer) {
        var receivedQuestion = new Question(question, answer);
        return service.remove(receivedQuestion);
    }
}
