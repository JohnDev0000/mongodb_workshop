package com.mongodbworkshop.course.repository;

import com.mongodbworkshop.course.domain.Post;
import com.mongodbworkshop.course.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    @Query("{ 'title': { $regex: ?0, $options: 'i' } }\n")
    List<Post> searchTitle (String text);

    List<Post> findByTitleContainingIgnoreCase(String text);


}
