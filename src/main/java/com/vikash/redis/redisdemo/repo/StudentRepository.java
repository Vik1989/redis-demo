package com.vikash.redis.redisdemo.repo;

import com.vikash.redis.redisdemo.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, String> {}
