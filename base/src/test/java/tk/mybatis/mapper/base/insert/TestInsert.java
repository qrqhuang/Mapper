package tk.mybatis.mapper.base.insert;

import org.apache.ibatis.session.SqlSession;
import org.junit.Assert;
import org.junit.Test;
import tk.mybatis.mapper.base.BaseTest;

import java.io.IOException;
import java.io.Reader;
import java.net.URL;

/**
 * @description:
 * @author: qrqhuangcy
 * @date: 2018-11-18
 **/
public class TestInsert extends BaseTest {

    @Override
    protected Reader getConfigFileAsReader() throws IOException {
        URL url = getClass().getResource("mybatis-config.xml");
        return toReader(url);
    }


    @Override
    protected Reader getSqlFileAsReader() throws IOException {
        URL url = getClass().getResource("CreateDB.sql");
        return toReader(url);    }

    @Test
    public void testInsert() {
        SqlSession sqlSession = super.getSqlSession();
        DemoCountryMapper countryMapper = sqlSession.getMapper(DemoCountryMapper.class);
        DemoCountry record = new DemoCountry(null, "PARIS", "巴黎");
        countryMapper.insert(record);
        Assert.assertNotNull(record.getCountryId());
        System.out.println(record);
    }
}
