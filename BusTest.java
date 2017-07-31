import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest {

  Bus bus;

  @Before
  public void before(){
    bus = new Bus("Henry", "Edinburgh", "Portobello", 1000, 4.2);
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

@Test
public void hasWeight(){
  assertEquals(1000, bus.getWeight());
}

@Test
public void hasHeight(){
  assertEquals(4.2, bus.getHeight(), 0.01);
}



}