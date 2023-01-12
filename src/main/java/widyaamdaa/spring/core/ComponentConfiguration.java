package widyaamdaa.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import widyaamdaa.spring.core.data.MultiFoo;

@Configuration
@ComponentScan(basePackages = {
    "widyaamda.spring.core.repository",
    "widyaamda.spring.core.service",
    ".spring.core.configuration"
})
@Import(MultiFoo.class)
public class ComponentConfiguration {
}
