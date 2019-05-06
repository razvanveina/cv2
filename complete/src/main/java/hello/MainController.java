
package hello;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "/demo")
public class MainController {
  Logger logger = LoggerFactory.getLogger(MainController.class);

  @Autowired
  private UserRepository userRepository;

  @PostMapping(path = "/add")
  public String addNewUser(@ModelAttribute Candidate candidate, Model model) {
    userRepository.save(candidate);
    model.addAttribute("candidates", userRepository.findAll());
    return "view";
  }

  @GetMapping(path = "/edit")
  public String editCandidate(Model model, @RequestParam int id) {
    Optional<Candidate> findById = userRepository.findById(id);
    logger.info("id = " + findById.get().getId());
    model.addAttribute("candidate", findById);
    return "add";
  }

  @GetMapping("/add")
  public String addForm(Model model) {
    model.addAttribute("candidate", new Candidate());
    return "add";
  }

  @GetMapping(path = "/all")
  public String getAllCandidates(Model model) {
    model.addAttribute("candidates", userRepository.findAll());
    return "view";
  }

  @GetMapping(path = "")
  public String index() {
    return "index";
  }

}
