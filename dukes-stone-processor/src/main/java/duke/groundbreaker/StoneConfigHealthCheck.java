package duke.groundbreaker;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;

@Health
@ApplicationScoped
public class StoneConfigHealthCheck implements HealthCheck {

    @Inject
    @ConfigProperty(name = "stone", defaultValue = "none")
    private String infinityStone;

    @Override
    public HealthCheckResponse call() {

        final List<String> validStones = Arrays.asList("space", "reality", "power", "soul", "mind", "time");

        if (!validStones.contains(infinityStone)) {

            return HealthCheckResponse.named("unsuccessful-check")
                    .down()
                    .withData("Stone Processor", "Misconfigured")
                    .withData("Invalid stone", infinityStone)
                    .build();
        } else {

            return HealthCheckResponse.named("successful-check")
                    .up()
                    .withData("Infinity Stone", infinityStone)
                    .build();
        }
    }
}
