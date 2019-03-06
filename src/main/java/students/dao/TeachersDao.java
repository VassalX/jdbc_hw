package students.dao;

import students.entities.Teacher;

public interface TeachersDao {
    void addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    void saveTacher(Teacher teacher);
}
