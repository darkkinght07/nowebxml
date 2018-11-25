package controller;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@CommonsLog
@RestController
public class UserController {

    @RequestMapping("/users")
    public List<String> getUsers() {
        log.debug("getUsers() ..");

        return Arrays.asList(
                "user1",
                "user2",
                "user3");
    }
}
