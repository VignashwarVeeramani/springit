package com.vega.springit.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Data
public class Link extends Auditable {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String url;

    //comments - Entity Association
    @OneToMany(mappedBy = "link") //one link to many comments
    private List<Comment> comments = new ArrayList<>();

}
