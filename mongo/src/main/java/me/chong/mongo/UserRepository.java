package me.chong.mongo;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Component;

@Component
public class UserRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    public void save(User user) {
        mongoTemplate.save(user);
    }

    public User findOneByUsername(@NonNull String username) {
        Query query = new Query(Criteria.where("username").is(username));
        return mongoTemplate.findOne(query, User.class);
    }

    public void update(@NonNull User user) {
        Query query = new Query(Criteria.where("id").is(user.getId()));
        Update update = new Update().set("username", user.getUsername())
                .set("password", user.getPassword());
        // 更新查询返回结果集的第一条
        mongoTemplate.updateFirst(query, update, User.class);
        // 更新查询结果返回结果集的所有
        // mongoTemplate.updateMulti(query, update, User.class);
    }

    public void delete(@NonNull User user) {
        Query query = new Query(Criteria.where("id").is(user.getId()));
        mongoTemplate.remove(query, User.class);
    }
}
