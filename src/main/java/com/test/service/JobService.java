package com.test.service;

import com.test.model.User;
import com.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class JobService {
    private final Logger logger = Logger.getLogger(JobService.class.getName());

    @Autowired
    private UserRepository userRepository;

    public JobService() {
        logger.info("Init");
    }

    public void apply() {
        if (userRepository != null) {
            logger.warning("repository NOT null");
            userRepository.save(new User("123", "456"));
        } else {
            logger.warning("repository is null");
        }
    }
}
