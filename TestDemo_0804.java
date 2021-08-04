import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TestDemo_0804 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 加载JDBC驱动程序：反射，这样调用初始化com.mysql.jdbc.Driver类，即将该类加载到JVM方法区，并执行该类的静态方法块、静态属性。
        MysqlDataSource ds = new MysqlDataSource();
        ds.setUrl("jdbc:mysql://localhost:3306/test?user=root&password=quan417568&useUnicode=true&characterEncoding=UTF-8");
        Connection connection = ds.getConnection();
        // 创建数据库连接
        PreparedStatement preparedStatement = null;
        String name = "计算机系2019级1班";
        String sql = "select classes.name classes_name,student.name student_name,student.sn,course.name course_name,score.score" +
                "    from classes,student,course,score" +
                "    where classes.id = student.classes_id" +
                "    and student.id = score.student_id" +
                "    and course.id = score.course_id" +
                "    and classes.name = ?";
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,name);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<InClass> list = new ArrayList<>();
        while (resultSet.next()) {
            String classesName = resultSet.getString("classes_name");
            Integer sn = resultSet.getInt("sn");
            String studentName = resultSet.getString("student_name");
            String courseName = resultSet.getString("course_name");
            BigDecimal score = resultSet.getBigDecimal("score");
            System.out.printf("classesName = %s,sn = %s,studentName = %s,courseName = %s,score = %s%n",classesName,sn,studentName,courseName,score);
            InClass inClass = new InClass();
            inClass.setClassesName(classesName);
            inClass.setSn(sn);
            inClass.setStudentName(studentName);
            inClass.setCourseName(courseName);
            inClass.setScore(score);
            list.add(inClass);
        }
        System.out.println(list);
    }
    public static class InClass {
        private String classesName;
        private Integer sn;
        private String studentName;
        private String courseName;
        private BigDecimal score;

        @Override
        public String toString() {
            return "InClass{" +
                    "classesName='" + classesName + '\'' +
                    ", sn=" + sn +
                    ", studentName='" + studentName + '\'' +
                    ", courseName='" + courseName + '\'' +
                    ", score=" + score +
                    '}';
        }

        public String getClassesName() {
            return classesName;
        }

        public void setClassesName(String classesName) {
            this.classesName = classesName;
        }

        public Integer getSn() {
            return sn;
        }

        public void setSn(Integer sn) {
            this.sn = sn;
        }

        public String getStudentName() {
            return studentName;
        }

        public void setStudentName(String studentName) {
            this.studentName = studentName;
        }

        public String getCourseName() {
            return courseName;
        }

        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public BigDecimal getScore() {
            return score;
        }

        public void setScore(BigDecimal score) {
            this.score = score;
        }
    }
}
