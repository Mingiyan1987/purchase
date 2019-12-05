package ru.basanov.saleproject.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.basanov.saleproject.domain.User;

@Repository
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    User findByName(String name);
}
