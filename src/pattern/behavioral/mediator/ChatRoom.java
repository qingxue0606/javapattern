 package pattern.behavioral.mediator;

import java.util.Date;

public class ChatRoom {
     //chatRoom就是個中介 帮人说话
     public static void showMessage(User user, String message){
         System.out.println(new Date().toString()
            + " [" + user.getName() +"] : " + message);
      }
}
