package example.axxes.model;

import example.axxes.beans.Trainee;
import example.axxes.beans.TraineeList;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

public class TraineeService {
    public List<Trainee> getTrainees(){
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.add("X-Parse-Application-Id", "EobLmBPuMPa7y2eZ5yt4ELaWEeEJUprGKrx78zDz");
        headers.add("X-Parse-REST-API-Key","EnT6MvmYC5cK6lH6iBZ0eu3AcBUm5npvdlkdZYxV");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

        final String uri = "https://api.parse.com/1/classes/Trainee";
        ResponseEntity<TraineeList> trainees=restTemplate.exchange(uri, HttpMethod.GET, entity, TraineeList.class);

        return trainees.getBody().getTrainees();
    }
}
