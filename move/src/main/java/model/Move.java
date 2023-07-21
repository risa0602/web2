package model;

public class Move {
	private String userName;
	private String title;
	private String comment;
	public Move() {}
	public Move(String userName,String title,String comment) {
		this.userName = userName;
		this.title = title;
		this.comment = comment;
	}
	public String getUserName() {return userName;}
	public String getTitle() {return title;}
	public String getComment() {return comment;}
	

}
