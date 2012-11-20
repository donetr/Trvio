package com.donetr.trvio.business;

public enum PollType {

	Unknown((short)0),
		
	/**
	 * Gelen cevap listesinden sadece bir tanesi se�ilebilir
	 */
	SingleChoice((short)1),
	
	/**
	 * Gelen cevap listesinde birka� tane se�enek se�ilebilir 
	 */	
	MultipleChoice((short)2),
	
	/**
	 * : Yap� olarak asl�nda bir tek cevap sorusudur. 
	 * Farkl� olarak tek bir ekranda bir �embersel olarak dizilmi� 4 
	 * tane se�enekten olu�acakt�r. Bu se�eneklerden kullan�c� herhangi 
	 * birisine t�klad���nda bu se�enek sunucuya g�nderilecektir. 
	 * Di�er sorulardan farkl� olarak kullan�c�n�n se�ene�i de�i�tirmesi 
	 * m�mk�n olacakt�r ve se�enek de�i�tirdi�inde bu de�i�im de 
	 * sunucuya g�nderilecektir. Bir �rnekle konuyu canland�rmak gerekirse 
	 * bug�n ne giysem program�nda kullan�c� bir yar��mac�n�n 
	 * j�riye verdi�i cevaplara duygusal olarak farkl� zaman aral�klar�nda farkl� tepkiler verebilir 
	 * � ba�ta  makul bulurken sonradan sinirlenebilir � bu duygular� anl�k olarak yakalayabilmek 
	 * i�in haz�rlanm�� bir soru tipidir.
	 */	
	Moodometer((short)3),
	
	/**
	 * 2 k�me �eklinde sorular son kullan�c�ya g�sterilecektir. 
	 * Kullan�c� her 2 k�meden de bir adet se�ene�i se�ebilecektir. 
	 * Kullan�c� bir k�me i�erisinde bir se�ene�i se�ip sonras�nda da ayn� k�me i�erisinde 
	 * di�er bir se�ene�i se�ti�inde yeni se�ti�i se�enek ilk se�ene�in �zerine yaz�lacakt�r
	 */
	SingleItem2Sets((short)4),
	
	/**
	 * Bir listedeki her bir opsiyon i�in bu opsiyona 0-10 aras�nda bir not verme se�ene�i bulunacakt�r. 
	 * Burada kullan�c� sliderlar arac�l��� ile notlar� verecek 
	 */
	Rating((short)5),
	
	/**
	 * 2 k�me sorusu ile ayn� tiptedir. 
	 * Tek fark olarak kullan�c� ayn� k�me i�erisinde birden fazla se�ene�i bir arada se�ebilecektir.
	 */
	MultiItem2Sets((short)6),
	;
	
	short id;
	
	private PollType(short id) {
		this.id=id;			
	}
	
}
