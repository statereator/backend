package com.statereator.auth_service.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Component
@Repository
public class UserRepository {
  public record Greeting(Long id, String content) {
  }
}
