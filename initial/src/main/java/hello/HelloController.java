
package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import hello.answer.AnswerService;
import hello.exam.ExamService;
import hello.question.QuestionService;
import hello.user.UserService;

@RestController
public class HelloController {

	@Autowired
	UserService userService;

	@Autowired
	ExamService examService;

	@Autowired
	QuestionService questionService;

	@Autowired
	AnswerService answerService;

	@RequestMapping(value = "/html", method = RequestMethod.GET)
	public String index() {
		String clgt = "sao dek lên";
		String result = userService.getUserById(1).getName() + examService.getExamById(1).getName()
				+ questionService.getQuestionById(1).getContent() + answerService.getAnswerById(1).getContent();
		return result;
	}

}
