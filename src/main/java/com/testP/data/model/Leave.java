package com.testP.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
@Table(name = Leave.TABLE_NAME)
public class Leave extends BaseEntity {

	public static final String TABLE_NAME = "leaveTable";

	@Id
	@Column(name = "leave_id", unique = true, length = 10)
	String id;

	@Column(name = "leave_type")
	@Enumerated(EnumType.STRING)
	LeaveType leaveType;

	@Column(name = "leaveBalance")
	Double leaveBalance;
}
