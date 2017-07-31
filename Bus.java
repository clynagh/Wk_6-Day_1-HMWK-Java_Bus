class Bus {
private String name;
private String depart;
private String terminal;
private int weight;
private double height;

public Bus(String name, String depart, String terminal, int weight, double height){
this.name = name;
this.depart = depart;
this.terminal = terminal;
this.weight = weight;
this.height = height;
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


}