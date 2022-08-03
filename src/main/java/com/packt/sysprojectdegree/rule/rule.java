package com.packt.sysprojectdegree.rule;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class rule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String title;
	private String content;
	private String path;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(content, id, path, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		rule other = (rule) obj;
		return Objects.equals(content, other.content) && id == other.id && Objects.equals(path, other.path)
				&& Objects.equals(title, other.title);
	}
	
	
	@Override
	public String toString() {
		return "rule [id=" + id + ", title=" + title + ", content=" + content + ", path=" + path + "]";
	}
	
	
	
}
