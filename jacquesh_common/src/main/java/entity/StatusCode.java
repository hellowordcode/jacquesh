package entity;

/*********************************************************************************
 **                      Created by IDEA.  
 **                      Author: JacquesH
 **                      Date: 2018/12/4
 **                     Time: 16:37 
 **********************************************************************************/
public class StatusCode {
    public static final int ERROR=400;   //失败
    public static final int ACCESSERROR =401;//未授权，请登录
    public static final int  NOENTER =403;//拒绝访问
    public static final int NOFIRE= 404;//请求地址出错
    public static final int OK=200;   //失败
//    public static final int OK=20000;//成功
//    public static final int ERROR =20001;//失败
//    public static final int LOGINERROR =20002;//用户名或密码错误
//    public static final int ACCESSERROR =20003;//权限不足
//    public static final int REMOTEERROR =20004;//远程调用失败
//    public static final int REPERROR =20005;//重复操作
}
