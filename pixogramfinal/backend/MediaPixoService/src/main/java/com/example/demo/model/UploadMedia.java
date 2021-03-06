package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UploadMedia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int uid;
	private String title;
	private String description;
	private String tags;
	private String url;
	private String date;
	private String username;
	private int likes;
	


	public UploadMedia(int id, int uid, String title, String description, String tags, String url) {
		super();
		this.id = id;
		this.uid = uid;
		this.title = title;
		this.description = description;
		this.tags = tags;
		this.url = url;

	}

	public UploadMedia(int uid, String title, String description, String tags, String url, String date,
			String username, int likes) {
		super();
		this.uid = uid;
		this.title = title;
		this.description = description;
		this.tags = tags;
		this.url = url;
		this.username = username;
		this.likes=likes;
		this.setDate(date);

	}
}
