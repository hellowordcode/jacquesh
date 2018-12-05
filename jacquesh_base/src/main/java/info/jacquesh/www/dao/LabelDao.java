package info.jacquesh.www.dao;

import info.jacquesh.www.dao.pojo.Label;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
/*********************************************************************************
 **                      Created by IDEA.  
 **                      Author: JacquesH
 **                      Date: 2018/12/5
 **                     Time: 23:25 
 **********************************************************************************/
/**
 * 标签数据访问接口
 */
public interface LabelDao extends
        JpaRepository<Label,String>, JpaSpecificationExecutor<Label> {
}
