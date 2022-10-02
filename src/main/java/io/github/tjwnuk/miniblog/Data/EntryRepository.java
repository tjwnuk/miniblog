package io.github.tjwnuk.miniblog.Data;

import org.springframework.data.repository.Repository;

import java.util.Optional;

public interface EntryRepository extends Repository<Entry, String> {
    Iterable<Entry> findAll();
    Optional<Entry> findById(int id);
//    Entry save(Entry entry);
}
