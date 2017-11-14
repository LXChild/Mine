package me.chong.mongo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserDAOTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void saveUser() throws Exception {
        User user = new User("chong123", "123");
        userRepository.save(user);
        userRepository.save(user);
    }

    @Test
    public void findOneByUsername() throws Exception {
        Assert.assertEquals("chong", userRepository.findOneByUsername("chong").getUsername());
    }

    @Test
    public void update() throws Exception {
        User user = new User(String.valueOf(1), "dsfaf", "123");
        userRepository.update(user);
    }

    @Test
    public void delete() throws Exception {
        User user = new User(String.valueOf(1), "chong", "123");
        userRepository.delete(user);
    }

}