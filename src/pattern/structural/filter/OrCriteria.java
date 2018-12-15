 package pattern.structural.filter;

import java.util.List;

/**
 * 或过滤
 * @author xiang
 * @date 2018/12/15
 */
 public class OrCriteria implements Criteria {
     
     private Criteria criteria;
     private Criteria otherCriteria;
   
     public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria; 
     }
   
     @Override
     public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);
   
        for (Person person : otherCriteriaItems) {
            //过滤的核心
           if(!firstCriteriaItems.contains(person)){
             firstCriteriaItems.add(person);
           }
        }  
        return firstCriteriaItems;
     }
  }