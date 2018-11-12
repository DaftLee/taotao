package com.taotao.mapper;

import com.taotao.pojo.TbItemParam;
import com.taotao.pojo.TbItemParamExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbItemParamMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Mon Nov 12 15:38:30 CST 2018
     */
    int countByExample(TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Mon Nov 12 15:38:30 CST 2018
     */
    int deleteByExample(TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Mon Nov 12 15:38:30 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Mon Nov 12 15:38:30 CST 2018
     */
    int insert(TbItemParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Mon Nov 12 15:38:30 CST 2018
     */
    int insertSelective(TbItemParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Mon Nov 12 15:38:30 CST 2018
     */
    List<TbItemParam> selectByExampleWithBLOBs(TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Mon Nov 12 15:38:30 CST 2018
     */
    List<TbItemParam> selectByExample(TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Mon Nov 12 15:38:30 CST 2018
     */
    TbItemParam selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Mon Nov 12 15:38:30 CST 2018
     */
    int updateByExampleSelective(@Param("record") TbItemParam record, @Param("example") TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Mon Nov 12 15:38:30 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") TbItemParam record, @Param("example") TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Mon Nov 12 15:38:30 CST 2018
     */
    int updateByExample(@Param("record") TbItemParam record, @Param("example") TbItemParamExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Mon Nov 12 15:38:30 CST 2018
     */
    int updateByPrimaryKeySelective(TbItemParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Mon Nov 12 15:38:30 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(TbItemParam record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_item_param
     *
     * @mbggenerated Mon Nov 12 15:38:30 CST 2018
     */
    int updateByPrimaryKey(TbItemParam record);
}