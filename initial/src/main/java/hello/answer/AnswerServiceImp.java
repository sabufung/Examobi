package hello.answer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerServiceImp implements AnswerService {

	@Autowired
	AnswerRepository repository;

	@Override
	public AnswerEntity getAnswerById(long id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

	@Override
	public List<AnswerEntity> getAnswerByQuestionId(long id) {
		// TODO Auto-generated method stub
		return repository.findAllAnswerByQuesionId(id);
	}

	

	

}
