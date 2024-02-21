package com.propz.fullstack.atividade.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "perfect_number")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id")
public class PerfectNumberEntity implements Serializable {

    private static final long serialVersionUUID = 1L;

    public PerfectNumberEntity() {
    }
    public PerfectNumberEntity(Long perfectNumber) {
        this.perfectNumber = perfectNumber;
    }

    public PerfectNumberEntity(PerfectNumberEntity perfectNumberEntity) {
        this.perfectNumber = perfectNumberEntity.getPerfectNumber();
    }

    @Id
    @GeneratedValue(generator = "perfect_number_id_generator", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "perfect_number_id_generator", sequenceName = "perfect_number_id_sequence", initialValue = 300)
    private Long id;

    @Column(name = "perfect_number", nullable = false)
    private Long perfectNumber;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPerfectNumber() {
        return perfectNumber;
    }

    public void setPerfectNumber(Long perfectNumber) {
        this.perfectNumber = perfectNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PerfectNumberEntity that = (PerfectNumberEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(perfectNumber, that.perfectNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, perfectNumber);
    }

    @Override
    public String toString() {
        return "PerfectNumberEntity{" +
                "id=" + id +
                ", perfectNumber='" + perfectNumber + '\'' +
                '}';
    }
}
