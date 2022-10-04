package io.github.tjwnuk.miniblog.Data;

import org.springframework.data.repository.CrudRepository;

public interface EntryRepository extends CrudRepository<Entry, Integer> {
}
