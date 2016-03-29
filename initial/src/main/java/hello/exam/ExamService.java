package hello.exam;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface ExamService {
	public ExamEntity getExamById(long id);
	public List<ExamEntity> getAllByTestDoneAsc();
}
