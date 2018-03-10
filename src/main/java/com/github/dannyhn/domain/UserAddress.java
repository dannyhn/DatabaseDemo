package com.github.dannyhn.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@org.hibernate.annotations.Immutable
@org.hibernate.annotations.Subselect(
     value = "select u.ID as ID, u.EMAIL as EMAIL, " +
    "u.NAME as NAME, " +
    "a.CITY as CITY, a.ZIPCODE as ZIPCODE " +
    "from USER u left join ADDRESS a on u.ID = a.USER_ID"
)
@org.hibernate.annotations.Synchronize({"User", "Address"})
public class UserAddress {
	
	@Id
	private long id;
	private String name;
	private String email;
	private String city;
	private String zipcode;

}
