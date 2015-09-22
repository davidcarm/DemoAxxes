package example.axxes.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Trainee {
    private String objectId;
    private String firstname;
    private String lastname;
    private String image;
}