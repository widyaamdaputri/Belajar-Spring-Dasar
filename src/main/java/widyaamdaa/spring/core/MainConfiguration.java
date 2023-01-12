package widyaamdaa.spring.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import widyaamda.spring.core.configuration.BarConfiguration;
import widyaamda.spring.core.configuration.FooConfiguration;

@Configuration
@Import({
    FooConfiguration.class,
    BarConfiguration.class
})
public class MainConfiguration {
}
