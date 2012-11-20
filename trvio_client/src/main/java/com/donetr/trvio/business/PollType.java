package com.donetr.trvio.business;

public enum PollType {

	Unknown((short)0),
		
	/**
	 * Gelen cevap listesinden sadece bir tanesi seçilebilir
	 */
	SingleChoice((short)1),
	
	/**
	 * Gelen cevap listesinde birkaç tane seçenek seçilebilir 
	 */	
	MultipleChoice((short)2),
	
	/**
	 * : Yapý olarak aslýnda bir tek cevap sorusudur. 
	 * Farklý olarak tek bir ekranda bir çembersel olarak dizilmiþ 4 
	 * tane seçenekten oluþacaktýr. Bu seçeneklerden kullanýcý herhangi 
	 * birisine týkladýðýnda bu seçenek sunucuya gönderilecektir. 
	 * Diðer sorulardan farklý olarak kullanýcýnýn seçeneði deðiþtirmesi 
	 * mümkün olacaktýr ve seçenek deðiþtirdiðinde bu deðiþim de 
	 * sunucuya gönderilecektir. Bir örnekle konuyu canlandýrmak gerekirse 
	 * bugün ne giysem programýnda kullanýcý bir yarýþmacýnýn 
	 * jüriye verdiði cevaplara duygusal olarak farklý zaman aralýklarýnda farklý tepkiler verebilir 
	 * – baþta  makul bulurken sonradan sinirlenebilir – bu duygularý anlýk olarak yakalayabilmek 
	 * için hazýrlanmýþ bir soru tipidir.
	 */	
	Moodometer((short)3),
	
	/**
	 * 2 küme þeklinde sorular son kullanýcýya gösterilecektir. 
	 * Kullanýcý her 2 kümeden de bir adet seçeneði seçebilecektir. 
	 * Kullanýcý bir küme içerisinde bir seçeneði seçip sonrasýnda da ayný küme içerisinde 
	 * diðer bir seçeneði seçtiðinde yeni seçtiði seçenek ilk seçeneðin üzerine yazýlacaktýr
	 */
	SingleItem2Sets((short)4),
	
	/**
	 * Bir listedeki her bir opsiyon için bu opsiyona 0-10 arasýnda bir not verme seçeneði bulunacaktýr. 
	 * Burada kullanýcý sliderlar aracýlýðý ile notlarý verecek 
	 */
	Rating((short)5),
	
	/**
	 * 2 küme sorusu ile ayný tiptedir. 
	 * Tek fark olarak kullanýcý ayný küme içerisinde birden fazla seçeneði bir arada seçebilecektir.
	 */
	MultiItem2Sets((short)6),
	;
	
	short id;
	
	private PollType(short id) {
		this.id=id;			
	}
	
}
