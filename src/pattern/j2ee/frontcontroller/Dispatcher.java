 package pattern.j2ee.frontcontroller;

 /**
  * 核心类来管理整个页面的请求
 * @author xiang
 * @date 2018/12/18
 */
public class Dispatcher {
    private StudentView studentView;
    private HomeView homeView;
    public Dispatcher(){
        studentView = new StudentView();
        homeView = new HomeView();
     }
    //请求地址对应的页面
    public void dispatch(String request){
        if(request.equalsIgnoreCase("STUDENT")){
           studentView.show();
        }else{
           homeView.show();
        }  
     }

}
