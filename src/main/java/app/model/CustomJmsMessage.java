package app.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
public class CustomJmsMessage implements Serializable {

    private Integer id;
    private String msg;
    private CustomJmsMessageDetails details;
}
