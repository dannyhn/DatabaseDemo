package com.github.dannyhn.demo.domain;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseDomain {

	@org.hibernate.annotations.CreationTimestamp
	@Column(name="created")
    protected Timestamp createdDate;
    
    @org.hibernate.annotations.UpdateTimestamp
	@Column(name="updated")
    protected Timestamp updatedDate;
}
