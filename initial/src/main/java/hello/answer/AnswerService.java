package hello.answer;

import org.springframework.stereotype.Service;

@Service
public interface AnswerService {
	public AnswerEntity getAnswerById(long id);
}
