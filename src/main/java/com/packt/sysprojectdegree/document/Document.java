package com.packt.sysprojectdegree.document;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Document {

	
		
		@Id
		@GeneratedValue(strategy = 	GenerationType.AUTO)
		private Long id;
		
		private String titulo;
		private String resumen;
		private String indice;
		private String bibliografia;
		private String pdf;
		private Boolean VoBo;
		
		
		private Long id_doc_type;


		public Document(Long id, String titulo, String resumen, String indice, String bibliografia, String pdf,
				Boolean voBo, Long id_doc_type) {
			super();
			this.id = id;
			this.titulo = titulo;
			this.resumen = resumen;
			this.indice = indice;
			this.bibliografia = bibliografia;
			this.pdf = pdf;
			VoBo = voBo;
			this.id_doc_type = id_doc_type;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getTitulo() {
			return titulo;
		}


		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}


		public String getResumen() {
			return resumen;
		}


		public void setResumen(String resumen) {
			this.resumen = resumen;
		}


		public String getIndice() {
			return indice;
		}


		public void setIndice(String indice) {
			this.indice = indice;
		}


		public String getBibliografia() {
			return bibliografia;
		}


		public void setBibliografia(String bibliografia) {
			this.bibliografia = bibliografia;
		}


		public String getPdf() {
			return pdf;
		}


		public void setPdf(String pdf) {
			this.pdf = pdf;
		}


		public Boolean getVoBo() {
			return VoBo;
		}


		public void setVoBo(Boolean voBo) {
			VoBo = voBo;
		}


		public Long getId_doc_type() {
			return id_doc_type;
		}


		public void setId_doc_type(Long id_doc_type) {
			this.id_doc_type = id_doc_type;
		}


		@Override
		public int hashCode() {
			return Objects.hash(VoBo, bibliografia, indice, pdf, resumen, titulo);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Document other = (Document) obj;
			return Objects.equals(VoBo, other.VoBo) && Objects.equals(bibliografia, other.bibliografia)
					&& Objects.equals(indice, other.indice) && Objects.equals(pdf, other.pdf)
					&& Objects.equals(resumen, other.resumen) && Objects.equals(titulo, other.titulo);
		}
		
		
		
		



}
