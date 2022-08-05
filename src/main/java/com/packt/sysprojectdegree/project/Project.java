package com.packt.sysprojectdegree.project;

import com.packt.sysprojectdegree.cronograma.Cronograma;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @OneToMany(cascade=CascadeType.ALL, mappedBy="project")
    private List<Cronograma> cronogramas;

    public Project () {

    }

    /**
     * @param name
     */
    public Project(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Project))
            return false;
        Project other = (Project) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    
    @Override
    public String toString() {
        return "Project [id=" + id + ", name=" + name + "]";
    }


}
