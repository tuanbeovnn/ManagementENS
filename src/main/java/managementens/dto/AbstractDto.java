package managementens.dto;

import java.util.ArrayList;
import java.util.List;

public class AbstractDto<T> {
private Long id;
	
	private List<T> listResult = new ArrayList<>();
	
	public List<T> getListResult() {
		return listResult;
	}

	public void setListResult(List<T> listResult) {
		this.listResult = listResult;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
