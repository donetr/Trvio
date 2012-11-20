package com.donetr.trvio.business;

public class PollQuestion extends BaseQuestion{

	protected PollType type;
	
	private PollAnswerItem answerItems;
	
	/**
	 * Hangi seçenek trigger ediyor (e.g. Hakem Haklý mý – Hayýr ise sence pozisyon ne olmalýydý)
	 */
	private String optionsTriggeringFollowup;
	
	public PollType getType() {
		return type;
	}

	public void setType(PollType type) {
		this.type = type;
	}

	public PollAnswerItem getAnswerItems() {
		return answerItems;
	}

	public void setAnswerItems(PollAnswerItem answerItems) {
		this.answerItems = answerItems;
	}

	public PollQuestion(PollType type) {
		this.type=type;
	}
	
	public String getOptionsTriggeringFollowup() {
		return optionsTriggeringFollowup;
	}

	public void setOptionsTriggeringFollowup(String optionsTriggeringFollowup) {
		this.optionsTriggeringFollowup = optionsTriggeringFollowup;
	}
	
}
