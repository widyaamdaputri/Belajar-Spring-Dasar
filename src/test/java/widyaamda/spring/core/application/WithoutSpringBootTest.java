package widyaamda.spring.core.application;

import widyaamda.spring.core.application.FooApplication;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import widyaamdaa.spring.core.data.Foo;

public class WithoutSpringBootTest {

  private ConfigurableApplicationContext applicationContext;

  @BeforeEach
  void setUp() {
    applicationContext = new AnnotationConfigApplicationContext(FooApplication.class);
    applicationContext.registerShutdownHook();
  }

  @Test
  void testFoo() {
    Foo foo = applicationContext.getBean(Foo.class);
  }
}
