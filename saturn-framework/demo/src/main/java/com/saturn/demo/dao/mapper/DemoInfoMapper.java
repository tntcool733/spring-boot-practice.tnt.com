package com.saturn.demo.dao.mapper;

import com.saturn.demo.dao.bean.DemoInfo;
import com.saturn.demo.dao.bean.DemoInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DemoInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_info
     *
     * @mbg.generated Thu Jun 27 12:43:04 CST 2019
     */
    long countByExample(DemoInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_info
     *
     * @mbg.generated Thu Jun 27 12:43:04 CST 2019
     */
    int insert(DemoInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_info
     *
     * @mbg.generated Thu Jun 27 12:43:04 CST 2019
     */
    int insertSelective(DemoInfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_info
     *
     * @mbg.generated Thu Jun 27 12:43:04 CST 2019
     */
    List<DemoInfo> selectByExample(DemoInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_info
     *
     * @mbg.generated Thu Jun 27 12:43:04 CST 2019
     */
    int updateByExampleSelective(@Param("record") DemoInfo record, @Param("example") DemoInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table demo_info
     *
     * @mbg.generated Thu Jun 27 12:43:04 CST 2019
     */
    int updateByExample(@Param("record") DemoInfo record, @Param("example") DemoInfoExample example);
}