package project;

public class Bill {
    private int billno;
    private int patientid;
    private Double amount;

    public Bill(int billno, int patientid, Double amount) {
        this.billno = billno;
        this.patientid = patientid;
        this.amount = amount;
    }

    public int getbillno() {
        return billno;
    }

    public int getpatientid() {
        return patientid;
    }

    public Double getamount() {
        return amount;
    }

    @Override
    public String toString() {
        return "bill{" +
                "billno=" + billno +
                ", patientid=" + patientid +
                ", amount=" + amount +
                '}';
    }
}
