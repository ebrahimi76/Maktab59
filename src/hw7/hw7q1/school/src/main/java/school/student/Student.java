package school.student;

import school.oprators.Oprators;

import java.sql.SQLException;

public class Student extends Oprators {

    public Student() throws SQLException {
    }

    @Override
    public void insert() throws SQLException {
        QUERY1 = "INSERT INTO School.student " + QUERY1;
        super.insert();
    }

    @Override
    public void update() throws SQLException {
        QUERY2 = "UPDATE School.student " + QUERY2;
        super.update();
    }

    @Override
    public void delete() throws SQLException {
        QUERY3 = "DELETE FROM School.student " + QUERY3;
        super.delete();
    }

    @Override
    public void select() throws SQLException {
        QUERY4 = QUERY4 + " FROM School.student;";
        super.select();
    }
}
