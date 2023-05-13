package com.test;

import com.test.model.User;
import com.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class JobClass {
    static Logger logger = Logger.getLogger(JobClass.class.getName());
    @Autowired
    private static UserRepository userRepository;

    public JobClass() {
        logger.info("Init");

        if (userRepository != null) {
            userRepository.save(new User("123", "456"));
        }else{
            logger.warning("repository is null");
        }
    }
}
