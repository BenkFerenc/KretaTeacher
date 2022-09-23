package org.vasvari.kreta.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="teachers")
public class Teacher {
    @Id
    @Column(name="id",nullable = false)
    Long id;

    @Column(name="teacher_name",nullable = false)
    String teacherName;

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}
