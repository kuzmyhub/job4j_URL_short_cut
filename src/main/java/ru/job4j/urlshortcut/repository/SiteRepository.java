package ru.job4j.urlshortcut.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.job4j.urlshortcut.model.Site;

@Repository
public interface SiteRepository extends CrudRepository<Site, Integer> {

    Site findByLogin(String login);
}
