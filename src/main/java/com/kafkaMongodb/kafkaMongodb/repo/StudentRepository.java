package com.kafkaMongodb.kafkaMongodb.repo;

import com.kafkaMongodb.kafkaMongodb.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student,Integer>{

}
