 package pattern.structural.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤出来的男人
 * @author xiang
 * @date 2018/12/15
 */
public class CriteriaMale implements Criteria {

    /** (non-Javadoc)
     * @see pattern.structural.filter.Criteria#meetCriteria(java.util.List)
     */
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>(); 
        for (Person person : persons) {
            //过滤的核心
           if(person.getGender().equalsIgnoreCase("MALE")){
              malePersons.add(person);
           }
        }
        return malePersons;
    }

}
