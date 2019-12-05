package ru.basanov.saleproject.service;

import ru.basanov.saleproject.domain.User;

public interface UserService {

    Iterable<User> findAll();

    User findById(Long id);
}
