package com.therealdanvega.repository;

import com.therealdanvega.domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface PostRepository extends CrudRepository<Post,Long> {

    Post findFirstByOrderByPostedOnDesc();
}
