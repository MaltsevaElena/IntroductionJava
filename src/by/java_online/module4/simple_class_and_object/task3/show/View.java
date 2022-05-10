package by.java_online.module4.simple_class_and_object.task3.show;

import by.java_online.module4.simple_class_and_object.task3.entity.Group;
import by.java_online.module4.simple_class_and_object.task3.entity.Student;

import java.util.Arrays;
import java.util.List;

public class View {

    public static void printGroup(Group group) {

        System.out.println("Все студенты группы " + group.getName() + ":");
        for (Student st : group.getStudentList()) {
            System.out.println("Фамилия и имя студента:" + st.getLastName() + " " + st.getName() + ", возраст: "
                    + st.getAge() + ", оценки за экзамены: " + Arrays.toString(st.getAcademicPerformance()));
        }
    }

    public static void printAStudents(List<Student> students, Group group) {

        System.out.println("Отличники:");
        for (Student st : students) {
            System.out.println("Фамилия студента:" + st.getLastName() + ", Номер группы: " + group.getName());
        }
    }
}
