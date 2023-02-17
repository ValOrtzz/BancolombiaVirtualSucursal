package model;
public class SucursalVirtual {
    private Turnos start;
    private Turnos end;

    public void addTurn(){ //Dar turno
        if(start==null){
            Turnos turn=new Turnos(1);
            start=turn;
            end=turn;
        }else{
            Turnos turn=new Turnos(end.getNumber()+1);
            turn.setPrior(end);
            end.setNext(turn);
            end=turn;
        }
    }
    public void nextTurn(Turnos turn) { //Pasar turno
        if (start == null) {
            System.out.println("Empty turn");
        } else {
            end.setNext(turn);
            turn.setPrior(end);
        }
        end = turn;
    }

    public void showActualTurn(){
        Turnos Actualturn=new Turnos(0);
        if(Actualturn==null){
            System.out.println("We do not have turns ate moment");
        }else{
            System.out.println("Your actual turn is " +Actualturn.getNumber());|
        }
    }
}
