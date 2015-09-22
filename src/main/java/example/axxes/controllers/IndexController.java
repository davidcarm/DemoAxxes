package example.axxes.controllers;

import example.axxes.beans.Trainee;
import example.axxes.model.TraineeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class IndexController {

    @RequestMapping({"/", "/index"})
    public String index(Model model){
        TraineeService traineeService = new TraineeService();

        List<Trainee> trainees=traineeService.getTrainees();

        model.addAttribute("trainees",trainees);
        return "index";
    }

}
