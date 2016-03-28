package hello.exam;

import org.springframework.stereotype.Service;

@Service
public interface ExamService {
	public ExamEntity getExamById(long id);
}
