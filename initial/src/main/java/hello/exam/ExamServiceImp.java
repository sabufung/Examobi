package hello.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamServiceImp implements ExamService {

	@Autowired
	ExamRepository repository;

	@Override
	public ExamEntity getExamById(long id) {
		// TODO Auto-generated method stub
		return repository.findOne(id);
	}

}
