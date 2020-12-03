package com.marybeth.TechTalentTwitter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.relational.core.mapping.Table;

import com.marybeth.TechTalentTwitter.model.Tweet;
import com.marybeth.TechTalentTwitter.model.User;

@Repository
public interface TweetRepository extends CrudRepository<Tweet, Long> {
    List<Tweet> findAllByOrderByCreatedAtDesc();

    List<Tweet> findAllByUserOrderByCreatedAtDesc(User user);

    List<Tweet> findAllByUserInOrderByCreatedAtDesc(List<User> users);

    List<Tweet> findByTags_PhraseOrderByCreatedAtDesc(String phrase);
}