package net.example.jnario;

import net.example.jnario.SomeFeatureFeatureFindingSomething;
import org.jnario.runner.Contains;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains(SomeFeatureFeatureFindingSomething.class)
@Named("SomeFeature")
@RunWith(FeatureRunner.class)
@SuppressWarnings("all")
public class SomeFeatureFeature {
}
