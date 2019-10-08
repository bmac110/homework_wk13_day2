package com.codeclan.example.FilesFolders.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @JsonIgnoreProperties(value = "user")
    @OneToMany(mappedBy = "user")
    private List<Folder> folders;

    public User() {
    }

    public User(String name) {
        this.name = name;
        this.folders = new ArrayList<Folder>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Folder> getFolder() {
        return folders;
    }

    public void setFolder(List<Folder> folder) {
        this.folders = folder;
    }
}
