package crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import crud.repo.UserRepository;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class RestEntpoints {
	
	@Autowired
    private UserRepository userRepository;
    
    @GetMapping("/restUsers")
    public ResponseEntity<Object> showIndex(Model model) {
    	log.info("--------A req was made");
    	return new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

}
