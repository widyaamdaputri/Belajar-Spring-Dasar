package widyaamdaa.spring.core.data;

import lombok.Getter;
import org.springframework.stereotype.Component;
import widyaamda.spring.core.aware.IdAware;

@Component
public class Car implements IdAware {

  @Getter
  private String id;

  @Override
  public void setId(String id) {
    this.id = id;
  }
}
