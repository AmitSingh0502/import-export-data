package com.testP.data.model;

import java.time.ZonedDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public abstract class BaseEntity {

	@Column(name = "import_ts")
	ZonedDateTime importTS;

	@PrePersist
	protected void onCreate() {
		if (this.importTS == null) {
			this.importTS = ZonedDateTime.now();
		}
	}

	@PreUpdate
	protected void onUpdate() {
		this.importTS = ZonedDateTime.now();

	}

}
