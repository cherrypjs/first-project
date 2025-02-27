package info.example.restcontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {

    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    //메인 페이지 이동
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public void mainPageGET() {

        logger.info("메인 페이지 진입");

    }

}
