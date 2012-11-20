package com.donetr.trvio.business;

public class BaseQuestion {

	private long id;
	private String text;
	
	/**
	 * Anket sorusunun hangi program i�in gelen bir soru oldu�u
	 */
	private Program program;
	
	/**
	 * Anket sorusunun hangi b�l�m i�in gelen bir soru oldu�u
	 */
	private Episode episode;
	
	/**
	 * Sorunun episod i�indeki sorulma s�ras� (birka� soru birden geldi�inde hangisinin 
	 * �nce sorulaca��n� belirlemekte kullan�l�r)
	 */
	private long questionPubOrder;
	
	/**
	 * Soruya ait kat�l�m puan�
	 */
	private int participationPoint;
	
	/**
	 * Zaman k�s�tl� bir soru mu
	 */
	private boolean hasDuration;
	
	/**
	 * Zaman k�s�t� ne kadar s�re olarak (sn)
	 */
	private int invalidationDuration;
	
	/**
	 * Hemen akabinde sorulacak soru var m�?
	 */
	private boolean hasImmediateFollowupQuestions;
	
	// Kullan�c�n�n bilgileri
	private int point;
	private Rozet userRozet;
	private int kaymeCount;
	
	public int getParticipationPoint() {
		return participationPoint;
	}
	public void setParticipationPoint(int participationPoint) {
		this.participationPoint = participationPoint;
	}
	public boolean isHasDuration() {
		return hasDuration;
	}
	public void setHasDuration(boolean hasDuration) {
		this.hasDuration = hasDuration;
	}
	public int getInvalidationDuration() {
		return invalidationDuration;
	}
	public void setInvalidationDuration(int invalidationDuration) {
		this.invalidationDuration = invalidationDuration;
	}
	public boolean isHasImmediateFollowupQuestions() {
		return hasImmediateFollowupQuestions;
	}
	public void setHasImmediateFollowupQuestions(
			boolean hasImmediateFollowupQuestions) {
		this.hasImmediateFollowupQuestions = hasImmediateFollowupQuestions;
	}
	private long expireDate;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Program getProgram() {
		return program;
	}
	public void setProgram(Program program) {
		this.program = program;
	}
	public Episode getEpisode() {
		return episode;
	}
	public void setEpisode(Episode episode) {
		this.episode = episode;
	}
	public long getQuestionPubOrder() {
		return questionPubOrder;
	}
	public void setQuestionPubOrder(long questionPubOrder) {
		this.questionPubOrder = questionPubOrder;
	}	
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public Rozet getUserRozet() {
		return userRozet;
	}
	public void setUserRozet(Rozet userRozet) {
		this.userRozet = userRozet;
	}
	public int getKaymeCount() {
		return kaymeCount;
	}
	public void setKaymeCount(int kaymeCount) {
		this.kaymeCount = kaymeCount;
	}
	public long getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(long expireDate) {
		this.expireDate = expireDate;
	}
	
}
