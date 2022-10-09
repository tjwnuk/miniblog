package io.github.tjwnuk.miniblog.Data;

import org.springframework.data.domain.Sort;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EntryRepository extends CrudRepository<Entry, Integer> {
    List<Entry> findAll(Sort id);
}
