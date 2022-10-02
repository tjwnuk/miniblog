package io.github.tjwnuk.miniblog.Data;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Repository
@Data
public class JdbcEntryRepository implements EntryRepository{

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public JdbcEntryRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Iterable<Entry> findAll() {
        String queryString = "select username, content from Entry";
        return jdbcTemplate.query(queryString, this::mapRowToEntry);
    }

    public Optional<Entry> findById(int id) {
        String queryString = "select username, content from Entry where id=?";
        List<Entry> results = jdbcTemplate.query(queryString, this::mapRowToEntry, id);
        return results.size() == 0 ?
                Optional.empty() :
                Optional.of(results.get(0));
    }

    private Entry mapRowToEntry(ResultSet row, int rowNum) throws SQLException {
        return new Entry(row.getString("username"), row.getString("content"));
    }
}
