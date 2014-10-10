package ch.lukasmartinelli.redditclone;

import java.util.ArrayList;

public class Comment {
	private String text;
	private ArrayList<Comment> comments = new ArrayList<>();

	public void setText(String text){
		this.text = text;	
	}
	
	public String getText(){
		return text;	
	}
	
	public void addSubComment(Comment comment){
		comments.add(comment);
	}
	
	public Comment getSubComment(Comment comment){	
		return comments.get(comments.indexOf(comment));
	}
	
	public ArrayList<Comment> getSubComments(){
		return comments;
	}

}