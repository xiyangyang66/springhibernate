import com.entity.StudentEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class SpringHibernateTest {
    @Autowired
    HibernateTemplate hibernateTemplate;

    @Test
    public void testGet(){
        StudentEntity studentEntity = hibernateTemplate.get(StudentEntity.class, 1);
        System.out.println(studentEntity);
    }
}
