package test;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Account {
	private String no;
	private String owner;
	private int balance;
}
