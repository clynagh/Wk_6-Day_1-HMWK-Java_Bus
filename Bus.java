class Bus {
private String name;
private String depart;
private String terminal;
private int weight;
private double height;
private Passenger[] capacity;

public Bus(String name, String depart, String terminal, int weight, double height){
this.name = name;
this.depart = depart;
this.terminal = terminal;
this.weight = weight;
this.height = height;
this.capacity = new Passenger[12];
}

public String getName(){
  return this.name;
}

public String getDeparture(){
  return this.depart;
}

public String getTerminal(){
  return this.terminal;
}

public int getWeight(){
  return this.weight;
}

public double getHeight(){
  return this.height;
}

public int emptyBus(){
  int count = 0;
  for (Passenger passenger : this.capacity) {
    if (passenger != null) {
      count++;
    }
  }
  return count;
}

public void addPassenger(Passenger passenger){
  if (busIsFull()) {
    return;
  }
  int emptyBus = emptyBus();
  capacity[emptyBus] = passenger;
}
public boolean busIsFull(){
  return emptyBus() == capacity.length;
}

}

