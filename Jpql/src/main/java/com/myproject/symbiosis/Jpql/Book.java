package com.myproject.symbiosis.Jpql;

import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "book")
@NamedQuery(name = "find name", query="select max(b.bookPrice)from Book b")

public class Book {
	

}
