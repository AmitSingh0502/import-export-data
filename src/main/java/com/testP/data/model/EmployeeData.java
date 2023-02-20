package com.testP.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = EmployeeData.TABLE_NAME)
public class EmployeeData {

	public static final String TABLE_NAME = "employeeData";

	@Id
	@Column(name = "emp_id", unique = true, length = 10)
	String id;

	@Column(name = "name")
	String name;

	@Column(name = "role")
	String role;

	@Column(name = "experience")
	Double experience;
}
