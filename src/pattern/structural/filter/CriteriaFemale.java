 package pattern.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
  * 过滤出来的女人
 * @author xiang
 * @date 2018/12/15
 */
 public class CriteriaFemale implements Criteria {
     
     @Override
     public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>(); 
        for (Person person : persons) {
            //过滤的核心
           if(person.getGender().equalsIgnoreCase("FEMALE")){
              femalePersons.add(person);
           }
        }
        return femalePersons;
     }
  }