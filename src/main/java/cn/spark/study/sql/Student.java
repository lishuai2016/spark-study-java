package cn.spark.study.sql;

import java.io.Serializable;

/**
 * 学生JavaBean
 * @author Administrator
 *
 */
public class Student implements Serializable {

	private static final long serialVersionUID = -422071446486457663L;
	
	private int id;
	private String name;
	private int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}