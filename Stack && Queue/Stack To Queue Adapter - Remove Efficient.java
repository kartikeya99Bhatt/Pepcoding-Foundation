  public static class StackToQueueAdapter {
    Stack<Integer> mainS;
    Stack<Integer> helperS;

    public StackToQueueAdapter() {
      mainS = new Stack<>();
      helperS = new Stack<>();
    }
    int size;
    int size() {
      // write your code here
      return size;
    }

    void add(int val) {
      // write your code here
      size++;
      while(mainS.size()>0)
      {
          helperS.push(mainS.pop());
      }
      mainS.push(val);
      while(helperS.size()>0)
      {
        mainS.push(helperS.pop());  
      }
    }

    int remove() {
      // write your code here
       if(mainS.size()==0)
       {
           System.out.println("Queue underflow");
           return -1;
       }
       size--;
       return mainS.pop();
    }

    int peek() {
      // write your code here
       if(mainS.size()==0)
       {
           System.out.println("Queue underflow");
           return -1;
       }
       return mainS.peek();
    }

  
