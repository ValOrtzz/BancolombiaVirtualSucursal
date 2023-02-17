package model;
public class Turnos {
    private Turnos prior;
    private Turnos next;
    private int number;

    public Turnos(int number){
        this.number = number;
    }

    public Turnos getPrior() {
        return prior;
    }

    public void setPrior(Turnos prior) {
        this.prior = prior;
    }

    public Turnos getNext() {
        return next;
    }

    public void setNext(Turnos next) {
        this.next = next;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Turnos{" +
                "number=" + number +
                '}';
    }
}
