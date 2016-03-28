package hello.answer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_answer")
public class AnswerEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "answer_id")
	private long id;

	@Column(name = "answer_content")
	private String content;

	@Column(name = "is_correct")
	private boolean isCorrect;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setData(AnswerEntity data) {
		this.id = data.id;
		this.content = data.content;
		this.isCorrect = data.isCorrect;
	}
}
