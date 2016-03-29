package hello.exam;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<ExamEntity, Long>{
	public List<ExamEntity> findAllByOrderByTestDone();
}
