package app.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class CustomJmsMessageDetails implements Serializable {

    private Integer id;
    private String msgDetails;
    private String controlSum;
}
