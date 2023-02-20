package com.testP.data.model;

import java.security.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = LoginInfo.TABLE_NAME)
public class LoginInfo extends BaseEntity {

	public static final String TABLE_NAME = "loginInfo";

	@Id
	@Column(name = "log_id", unique = true, length = 10)
	String id;

	@Column(name = "emp_id", unique = true, length = 10)
	String empId;

	@Column(name = "shift_start")
	Timestamp shiftStart;

	@Column(name = "shift_end")
	Timestamp shiftEnd;

	@Column(name = "total_hours")
	Double totalHours;
}
