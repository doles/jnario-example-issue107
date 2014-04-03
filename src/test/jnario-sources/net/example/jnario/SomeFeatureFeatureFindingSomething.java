package net.example.jnario;

import net.example.jnario.SomeFeatureFeature;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Finding something")
@SuppressWarnings("all")
public class SomeFeatureFeatureFindingSomething extends SomeFeatureFeature {
  int nothing;
  
  @Test
  @Order(0)
  @Named("Given a nothing")
  public void _givenANothing() {
    this.nothing = 0;
  }
  
  @Test
  @Order(1)
  @Named("When I increment nothing")
  public void _whenIIncrementNothing() {
    this.nothing = (this.nothing + 1);
  }
  
  @Test
  @Order(2)
  @Named("Then it should create something")
  public void _thenItShouldCreateSomething() {
    Assert.assertTrue("\nExpected nothing should be 1 but"
     + "\n     nothing is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(this.nothing)).toString() + "\n", Should.<Integer>should_be(
      Integer.valueOf(this.nothing), Integer.valueOf(1)));
    
  }
}
