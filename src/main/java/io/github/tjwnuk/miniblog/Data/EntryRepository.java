package io.github.tjwnuk.miniblog.Data;

import java.util.Optional;

public interface EntryRepository {
    Iterable<Entry> findAll();
    Optional<Entry> findById(int id);
//    Entry save(Entry entry);
}
