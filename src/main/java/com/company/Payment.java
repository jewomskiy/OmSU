package com.company;

public class Payment {
    private String fullName;
    private int dateDay;
    private int dateMonth;
    private int dateYear;
    private int summOfPayment;

    public Payment() {
        this.fullName = "";
        this.dateDay = 0;
        this.dateMonth = 0;
        this.dateYear = 0;
        this.summOfPayment = 0;
    }

    public Payment(String fullName, int dateDay, int dateMonth, int dateYear, int summOfPayment) {
        this.fullName = fullName;
        this.dateDay = dateDay;
        this.dateMonth = dateMonth;
        this.dateYear = dateYear;
        this.summOfPayment = summOfPayment;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDateDay(int dateDay) {
        this.dateDay = dateDay;
    }

    public void setDateMonth(int dateMonth) {
        this.dateMonth = dateMonth;
    }

    public void setDateYear(int dateYear) {
        this.dateYear = dateYear;
    }

    public void setSummOfPayment(int summOfPayment) {
        this.summOfPayment = summOfPayment;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDateDay() {
        return dateDay;
    }

    public int getDateMonth() {
        return dateMonth;
    }

    public int getDateYear() {
        return dateYear;
    }

    public int getSummOfPayment() {
        return summOfPayment;
    }

    public boolean equals(Payment sec) {
        if (this.fullName == sec.getFullName() && this.dateDay == sec.getDateDay() && this.dateMonth == sec.getDateMonth() && this.dateYear == sec.getDateYear() && this.summOfPayment == sec.getSummOfPayment()) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = fullName.hashCode();
        result =
                31 * result + Integer.hashCode(dateDay) + Integer.hashCode(dateMonth) + Integer.hashCode(dateYear) + Integer.hashCode(summOfPayment);

        return result;
    }

    @Override
    public String toString() {
        return String.format("%nПлательщик: %s Дата: %sn Сумма: %f", fullName, dateDay, summOfPayment);
    }

//    чекну у арсения гитхаб, типы передаваемых значений

}
