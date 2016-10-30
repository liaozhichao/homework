package com.lovo.bean;

public class ArtistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Artist artist = new Artist();
		Rectangle r = new Rectangle(7,7);
		RightTriangle rt = new RightTriangle(6,5);
		Ladder ladder = new Ladder(5);
		artist.drawShape(r);
		System.out.println("-------------------------");
		artist.drawShape(rt);
		System.out.println("-------------------------");
		artist.drawShape(ladder);
	}
}
