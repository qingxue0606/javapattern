 package pattern.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤出来的单身
 * @author xiang
 * @date 2018/12/15
 */
 public class CriteriaSingle implements Criteria {
     
     @Override
     public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>(); 
        for (Person person : persons) {
            //过滤的核心
           if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
              singlePersons.add(person);
           }
        }
        return singlePersons;
     }
  }