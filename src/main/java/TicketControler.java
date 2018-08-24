import java.time.LocalTime;
import java.time.temporal.TemporalAmount;
import java.util.Arrays;

public class TicketControler {

//    public boolean isValid(){
//
//
//    }

//    public void getNonValidTicket(Passenger[] passenger) {
//        Passenger[] nonValidPassaenger = new Passenger[4];
//        for (int i =0; i<passenger.length; i++){
//            Object n = (Ticket)passenger[i].getTicket();
//            long z = ((Ticket) n).getVadlidTime();
//            if (((Ticket) n).getTimeStamp().plusMinutes(z)  LocalTime.now());
//
//            /// i co teraz?
//
//        }
//    }

    public static void main(String[] args) {

        Passenger[] passenger = new Passenger[4];


        Ticket t1 = new Ticket(60, LocalTime.now());
        Passenger p1 = new Passenger("Marcin", "Wyrwalski", t1);
        Ticket t2 = new Ticket(30, LocalTime.parse("18:20:28"));
        Ticket t3 = new Ticket(30, LocalTime.parse("18:10:15"));
        Passenger p2 = new Passenger("Katarzyna", "Woźniak", t2);
        Passenger p3 = new Passenger("Marta", "Bodziony");
        Passenger p4 = new Passenger("Kyu", "Wroński", t3);




        passenger[0]= p1;
        passenger[1]= p2;
        passenger[2]= p3;
        passenger[3]= p4;

        System.out.println(Arrays.toString(passenger));
        System.out.println((Ticket)p2.getTicket());

    }
}
