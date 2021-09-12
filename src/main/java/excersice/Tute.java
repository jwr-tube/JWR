package excersice;

public class Tute {

    public static void main(String[] args) {

        /*
        TimeTable timeTable = new TimeTable();
        timeTable.setState(State.BUSY);
        timeTable.printState();
        */

        System.out.println(PhoneNumber.GALLE.getNumber());

    }
}

enum State {
    MEETING, AVAILABLE, BUSY, AWAY, DO_NOT_DISTURB;
}

class TimeTable {

    private State state = State.AWAY;

    //manager
    public void setState(State state) {
        this.state = state;
    }

    public void printState() {
        switch (state) {
            case MEETING:
                System.out.println("I’m in a meeting");
                break;
            case AVAILABLE:
                System.out.println("I’m available now");
                break;
            case BUSY:
                System.out.println("I’m busy now");
                break;
            case AWAY:
                System.out.println("I’m aray now");
                break;
            case DO_NOT_DISTURB:
                System.out.println("Do not disturb, I’m in a discussion with client");
                break;
            default:
                System.out.println("WARNING! :wrong state");
        }
    }
}


enum PhoneNumber {
    GALLE("0915623891"), KANDY("0815623891"), COLOMBO("0115623891");

    String number;

    PhoneNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return this.number;
    }
}


