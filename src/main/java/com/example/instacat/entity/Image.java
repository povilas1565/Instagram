package com.example.instacat.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Lob;

public class Image {
    @Id
    private Long id;

    @Column(updatable = false)
    private String name;

    @Lob
    @Column (columnDefinition = "LONGBLOB")
    private byte[] imageBytes;

    @JsonIgnore
    private Long userId;

    @JsonIgnore
    private Long postId;

}
