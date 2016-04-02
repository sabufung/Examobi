package hello.answer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AnswerRepository extends JpaRepository<AnswerEntity, Long>{
	List<AnswerEntity> findAllAnswerByQuesionId(long id);
}
