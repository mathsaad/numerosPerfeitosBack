package com.propz.fullstack.atividade.model;

import java.io.Serializable;
import java.util.Objects;

public class PerfectNumberRange implements Serializable {

    private static final long serialVersionUUID = 1L;
    PerfectNumberEntity number1;
    PerfectNumberEntity number2;

    public PerfectNumberRange(PerfectNumberEntity number1, PerfectNumberEntity number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public PerfectNumberEntity getNumber1() {
        return number1;
    }

    public void setNumber1(PerfectNumberEntity number1) {
        this.number1 = number1;
    }

    public PerfectNumberEntity getNumber2() {
        return number2;
    }

    public void setNumber2(PerfectNumberEntity number2) {
        this.number2 = number2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PerfectNumberRange that = (PerfectNumberRange) o;
        return Objects.equals(number1, that.number1) && Objects.equals(number2, that.number2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number1, number2);
    }

    @Override
    public String toString() {
        return "PerfectNumberRange{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                '}';
    }
}
