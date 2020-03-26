package org.sang;

import java.util.Optional;

import org.sang.dao1.UserDao;
import org.sang.dao2.UserDao2;
import org.sang.model.LogEntry;
import org.sang.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sang on 2018/7/17.
 */
@RestController
public class UserController {
    @Autowired
    UserDao userDao;
    @Autowired
    UserDao2 userDao2;
    @GetMapping("/test1")
    public void test1() {
        User u1 = new User();
        u1.setAge(55);
        u1.setName("tom");
        u1.setGender("boy");
        userDao.save(u1);
        
        /*
        User u2 = new User();
        u2.setAge(80);
        u2.setName("ttt");
        u2.setGender("girl");
        userDao2.save(u2);
        */
        Optional<LogEntry> leOptional = userDao2.findById(1202296l);
        System.out.println(leOptional.get().toString());
    }
}
