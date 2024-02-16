package com.mongodbworkshop.course.repository;

import com.mongodbworkshop.course.domain.Post;
import com.mongodbworkshop.course.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
