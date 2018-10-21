package duke.groundbreaker;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Ivar Grimstad (ivar.grimstad@cybercom.com)
 */
@ApplicationScoped
@ApplicationPath("")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> set = new HashSet<>();
        set.add(StonesResource.class);
        return Collections.unmodifiableSet(set);
    }
}
