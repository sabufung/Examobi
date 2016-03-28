package hello.question;

import org.springframework.stereotype.Service;

@Service
public interface QuestionService {
	public QuestionEntity getQuestionById(long id);
}
