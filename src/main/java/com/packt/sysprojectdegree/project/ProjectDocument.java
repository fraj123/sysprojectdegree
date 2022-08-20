package com.packt.sysprojectdegree.project;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.MapsId;
import javax.persistence.ManyToOne;

import com.packt.sysprojectdegree.document.Document;

@Entity
@Table(name="projects_documents")
public class ProjectDocument {

    @EmbeddedId
    private ProjectDocumentId id = new ProjectDocumentId();

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("projectId")
    private Project project;

    @ManyToOne
    @MapsId("documentId")
    private Document document;

    @Column(nullable = false)
    private String score;

    public ProjectDocument() {}


    /**
     * @param id
     * @param score
     */
    public ProjectDocument(ProjectDocumentId id, String score) {
        this.id = id;
        this.score = score;
    }


    /**
     * @return the id
     */
    public ProjectDocumentId getId() {
        return id;
    }


    /**
     * @param id the id to set
     */
    public void setId(ProjectDocumentId id) {
        this.id = id;
    }


    /**
     * @return the project
     */
    public Project getProject() {
        return project;
    }


    /**
     * @param project the project to set
     */
    public void setProject(Project project) {
        this.project = project;
    }


    /**
     * @return the document
     */
    public Document getDocument() {
        return document;
    }


    /**
     * @param document the document to set
     */
    public void setDocument(Document document) {
        this.document = document;
    }


    /**
     * @return the score
     */
    public String getScore() {
        return score;
    }


    /**
     * @param score the score to set
     */
    public void setScore(String score) {
        this.score = score;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "ProjectDocument [document=" + document + ", id=" + id + ", project=" + project + ", score=" + score
                + "]";
    }

    @Embeddable
    public static class ProjectDocumentId implements Serializable {
        
        private static final long serialVersionUID = 1L;

        private long projectId;
        private long documentId;

        public ProjectDocumentId() {}

        public ProjectDocumentId(long projectId, long documentId) {
            super();
            this.projectId = projectId;
            this.documentId = documentId;
        }

        public long getProjectId() {
            return projectId;
        }

        public long getDocumentId() {
            return documentId;
        }

        public void setProjectId(long projectId) {
            this.projectId = projectId;
        }

        public void setDocumentId(long documentId) {
            this.documentId = documentId;
        }

        @Override
        public String toString(){
            return "ProjectDocumentId{" + "projectIdi=" + projectId + ", documentId=" + documentId + "}";
        }

    }

}

