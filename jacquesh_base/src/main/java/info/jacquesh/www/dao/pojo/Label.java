package info.jacquesh.www.dao.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*********************************************************************************
 **                      Created by IDEA.  
 **                      Author: JacquesH
 **                      Date: 2018/12/5
 **                     Time: 23:26 
 **********************************************************************************/
@Entity
@Table(name="tb_label")
public class Label {
   @Id
    private String id;//
    private String labelname;//标签名称
    private String state;//状态
    private Long count;//使用数量
    private Long fans;//关注数
    private String recommend;//是否推荐

    public Label(String id, String labelname, String state, Long count, Long fans, String recommend) {
        this.id = id;
        this.labelname = labelname;
        this.state = state;
        this.count = count;
        this.fans = fans;
        this.recommend = recommend;
    }
}
