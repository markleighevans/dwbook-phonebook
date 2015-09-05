package com.mle.tinker.mappers;

import com.mle.tinker.representaions.Person;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by mark on 05/09/15.
 */
public class PersonMapper implements ResultSetMapper<Person>
{
    public Person map(int index, ResultSet resultSet, StatementContext statementContext) throws SQLException
    {
        return new Person()
                .setId(resultSet.getInt("ID"))
                .setName(resultSet.getString("NAME"));
    }
}