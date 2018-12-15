 package pattern.structural.filter;

import java.util.List;

/**
 * @author xiang
 * @date 2018/12/15
 */
 public interface Criteria {
     public List<Person> meetCriteria(List<Person> persons);
  }