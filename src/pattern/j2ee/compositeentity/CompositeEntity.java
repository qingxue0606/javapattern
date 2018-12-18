 package pattern.j2ee.compositeentity;

 /**
 * @author xiang
 * @date 2018/12/18
 * 混合的实体
 */
public class CompositeEntity {
    private CoarseGrainedObject cgo = new CoarseGrainedObject();
    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
     }
   
     public String[] getData(){
        return cgo.getData();
     }

}
