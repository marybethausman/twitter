package com.marybeth.TechTalentTwitter.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.relational.core.mapping.Table;

import com.marybeth.TechTalentTwitter.model.Tag;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long>  {
    
	Tag findByPhrase(String phrase);

}