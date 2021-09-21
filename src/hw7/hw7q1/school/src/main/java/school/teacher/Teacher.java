package school.teacher;

import school.oprators.Oprators;

import java.sql.SQLException;

public class Teacher extends Oprators {

    public Teacher() throws SQLException {
    }

    @Override
    public void insert() throws SQLException {
        QUERY1 = "INSERT INTO School.teacher " + QUERY1;
        super.insert();
    }

    @Override
    public void update() throws SQLException {
        QUERY2 = "UPDATE School.teacher " + QUERY2;
        super.update();
    }

    @Override
    public void delete() throws SQLException {
        QUERY3 = "DELETE FROM School.teacher " + QUERY3;
        super.delete();
    }

    @Override
    public void select() throws SQLException {
        QUERY4 = QUERY4 + " FROM School.teacher;";
        super.select();
    }
}
