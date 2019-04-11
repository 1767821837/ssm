import com.song.crud.bean.TblEmp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * s使用spring测试模块测试spring请求
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration    //获取context 对象的注解
@ContextConfiguration(locations={"classpath:applocation.xml","classpath:springmv.xml"})
public class MVCtest {
    @Autowired
    WebApplicationContext context;
    MockMvc mockMvc;
    @Before
  public void  initmockMvc(){
      mockMvc =    MockMvcBuilders.webAppContextSetup(context).build();
    }
    @Test
    public void testpage(){
        try {
            MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/emps/emps.do").param("pn", "1")).andReturn();
            MockHttpServletRequest request = result.getRequest();
            PageInfo pageinfo = (PageInfo) request.getAttribute("pageinfo");
            System.out.println("当前页码"+pageinfo.getPageNum());
            System.out.println("总页码"+pageinfo.getPages());
            System.out.println("总记录数"+pageinfo.getTotal());
            System.out.println("在页面需要连续显示的页码");
            int[] nums = pageinfo.getNavigatepageNums();
            for (int i: nums
                 ) {
                System.out.print("  "+i);
            }


            List<TblEmp> list = pageinfo.getList();
            for (int i = 0; i < list.size(); i++) {
                System.out.println("****"+list.get(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
