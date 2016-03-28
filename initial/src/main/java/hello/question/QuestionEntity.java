package hello.question;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_question")
public class QuestionEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "question_id")
	private long id;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "question_content")
	private String content;

	@Column(name = "type")
	private String type;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setData(QuestionEntity data) {
		this.id = data.id;
		this.content = data.content;
		this.type = data.type;
	}
}
