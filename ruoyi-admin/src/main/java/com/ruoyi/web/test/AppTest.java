package com.ruoyi.web.test;

import com.ejlchina.searcher.BeanSearcher;
import com.ejlchina.searcher.MapSearcher;
import com.ruoyi.RuoYiApplication;
import com.ruoyi.system.domain.SingleOption;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author pan
 * @Date 2022/8/3 16:33
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= RuoYiApplication.class)
public class AppTest {
    @Resource
    private BeanSearcher beanSearcher;
    @Resource
    private MapSearcher mapSearcher;
    @Test
    public void test(){
        List<SingleOption> singleOptions = beanSearcher.searchAll(SingleOption.class, new HashMap<>());
        System.out.println(singleOptions);
        List<SingleOption> myList = singleOptions.stream().collect(Collectors.toCollection(LinkedList::new));
    }
}
