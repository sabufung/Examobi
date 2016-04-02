package hello.answer;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface AnswerService {
	public AnswerEntity getAnswerById(long id);
	public List<AnswerEntity> getAnswerByQuestionId(long id);
}
