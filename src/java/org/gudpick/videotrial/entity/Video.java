/**
 * This file was generated by the Jeddict
 */
package org.gudpick.videotrial.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "video")
public class Video {

    @Column(name = "id", table = "video", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", table = "video", length = 45)
    @Basic
    private String name;

    public Video() {
    }

    public Video(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Video{" + "id=" + id + ", name=" + name + '}';
    }
    
}