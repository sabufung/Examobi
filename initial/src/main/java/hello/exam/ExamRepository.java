package hello.exam;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamRepository extends JpaRepository<ExamEntity, Long>{

}
