package hello.exam;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_exam")
public class ExamEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "exam_id")
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "level")
	private int level;
	
	@Column(name = "testdone")
	private int testDone;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	

	public int getTestDone() {
		return testDone;
	}

	public void setTestDone(int testDone) {
		this.testDone = testDone;
	}

	public void setData(ExamEntity data) {
		this.id = data.id;
		this.name = data.name;
		this.level = data.level;
		this.testDone = data.testDone;
	}
}
