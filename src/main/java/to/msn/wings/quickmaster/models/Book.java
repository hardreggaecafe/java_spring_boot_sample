package to.msn.wings.quickmaster.models;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Book{
@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	//ISBNコード
	@Column(name="isbn",nullable=false)
	private String isbn;
	//書名
	@Column(name="title",nullable=true)
	private String title;
	//価格
	@Column(name="price",nullable=false)
	private int price;
	//出版社
	@Column(name="publisher",nullable=false)
	private String publisher;
	//刊行日
	@Column(name="published",nullable=false)
	private LocalDate published;
	//付属品
	@Column(name="attach",nullable=true)
	private String attach;
}