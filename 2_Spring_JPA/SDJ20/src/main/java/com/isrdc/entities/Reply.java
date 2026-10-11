package com.isrdc.entities;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "replies")
public class Reply {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer replyId;
	
	private LocalDate replyDate;
	
	private String replyMsg;
	
	@ManyToOne
	@JoinColumn(name = "member_id_fk")
	private Member member;
	
	@ManyToOne
	@JoinColumn(name = "post_id_fk")
	private Post post;
}
