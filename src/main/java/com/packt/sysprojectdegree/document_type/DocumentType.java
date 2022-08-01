package com.packt.sysprojectdegree.document_type;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.packt.sysprojectdegree.document.Document;



@Entity
@JsonIgnoreProperties({"hibernateLazyInitilazer","handler"})
public class DocumentType {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	private String reference_score;
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL, mappedBy="documentType")
	private List<Document> documents;
	
	public DocumentType(long id, String name, String reference_score) {
		super();
		this.id = id;
		this.name = name;
		this.reference_score = reference_score;
	}
	
	
	public List<Document> getDocuments() {
		return documents;
	}


	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getReference_score() {
		return reference_score;
	}
	public void setReference_score(String reference_score) {
		this.reference_score = reference_score;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name, reference_score);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DocumentType other = (DocumentType) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Objects.equals(reference_score, other.reference_score);
	}
	
	
	

}
