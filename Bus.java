class Bus {
private String name;
private String depart;
private String terminal;

public Bus(String name, String depart, String terminal){
this.name = name;
this.depart = depart;
this.terminal = terminal;
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


}