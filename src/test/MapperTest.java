import com.song.crud.bean.TblEmp;
import com.song.crud.bean.TblEmpExample;
import com.song.crud.bean.TbleDept;
import com.song.crud.dao.TblEmpMapper;
import com.song.crud.dao.TbleDeptMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Random;
import java.util.UUID;

/**
 * spring 项目就用Spring的单元测试 ，可以自动注入 需要的组件
 */


@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applocation.xml"})
public class MapperTest {
    @Autowired
  TbleDeptMapper tbleDeptMapper ;
    @Autowired
    TblEmpMapper tblEmpMapper;
@Test
    public void test01(){
    Random random = new Random();

    for (int i= 0; i < 1000; i++) {
    String name= UUID.randomUUID().toString().substring(0,9).replaceAll("-", "");;
       tblEmpMapper.insert(new TblEmp(name,"男",i*10+"123456@qq.com",random.nextInt(4)+1));
//tblEmpMapper.deleteByPrimaryKey(i);
    }
    }
}
