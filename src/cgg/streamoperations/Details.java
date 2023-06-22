package cgg.streamoperations;

import java.util.List;

public class Details {

	private int detailId;
	private List<String> parts;
	
	public Details() {
		super();
	}
	
	public Details(int detailId, List<String> parts) {
		super();
		this.detailId = detailId;
		this.parts = parts;
	}

	public int getDetailId() {
		return detailId;
	}
	public void setDetailId(int detailId) {
		this.detailId = detailId;
	}
	public List<String> getParts() {
		return parts;
	}
	public void setParts(List<String> parts) {
		this.parts = parts;
	}
	@Override
	public String toString() {
		return "Details [detailId=" + detailId + ", parts=" + parts + "]";
	}
	
	
}
