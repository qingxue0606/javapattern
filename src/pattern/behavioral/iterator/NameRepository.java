 package pattern.behavioral.iterator;

 public class NameRepository implements Container {
     public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        // TODO Auto-generated method stub
        
         return new NameIterator();
    }
    private class NameIterator implements Iterator{
        //在集合的内部实现一个迭代器
        int index;
        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
             }
             return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
             }
             return null;
          }     
        }

}
