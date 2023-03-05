package com.soccer.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name="category")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int category_no;
	
	private String category_title;
	
	private String categroy_url;
	
	private int pno;
	
//	@ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "category_parent")
	private int category_parent; 
	
//	@OneToMany(mappedBy = "category_parent", orphanRemoval = true)
//    private List<Category> children = new ArrayList<>();
}
 