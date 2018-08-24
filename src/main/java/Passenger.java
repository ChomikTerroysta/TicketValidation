public class Passenger {

    private String name;
    private String lastName;
    private Object ticket;

    public Passenger(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Object getTicket() {
        return ticket;
    }

    public Passenger(String name, String lastName, Ticket ticket){
        this.name = name;
        this.lastName = lastName;
        this.ticket = ticket;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ticket=" + ticket +
                '}';
    }
}
