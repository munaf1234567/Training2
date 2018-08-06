package com.exilant.colections;

import java.util.*;

public class QuestionBank {
	private String ques;
	private List<String> options;
	public String getQues() {
		return ques;
	}
	public void setQues(String ques) {
		this.ques = ques;
	}
	public List<String> getOptions() {
		return options;
	}
	public void setOptions(List<String> options) {
		this.options = options;
	}
	@Override
	public String toString() {
		return "QuestionBank [ques=" + ques + ", options=" + options + "]";
	}
	
	

}
