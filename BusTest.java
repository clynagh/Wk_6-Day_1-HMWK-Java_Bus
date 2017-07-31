import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest {

  Bus bus;

  @Before
  public void before(){
    bus = new Bus("Henry", "Edinburgh", "Portobello");
}

@Test
public void hasName(){
  assertEquals("Henry", bus.getName() );
}

@Test
public void hasDeparture(){
  assertEquals("Edinburgh", bus.getDeparture() );
}

@Test
public void hasTerminal(){
  assertEquals("Portobello", bus.getTerminal());
}



}