package by.java_online.module4.simple_class_and_object.task3.logic;

import by.java_online.module4.simple_class_and_object.task3.entity.Group;
import by.java_online.module4.simple_class_and_object.task3.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class GroupLogic {
    private StudentLogic studentLogic;

    public GroupLogic(StudentLogic studentLogic) {
        this.studentLogic = studentLogic;
    }

    public List<Student> AcademicPerformanceStudents(Group group) {
        List<Student> students = group.getStudentList();
        List<Student> AStudents = new ArrayList<>();

        for (Student st : students) {
            if (studentLogic.excellentStudents(st)) {
                AStudents.add(st);
            }
        }
        return AStudents;
    }
}
