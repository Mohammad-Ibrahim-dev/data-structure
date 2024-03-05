import java.util.ArrayList;

public class PrepareStack {
    static class stackAl{
        ArrayList<Integer> list =new ArrayList<>();
        public boolean isempty() {
            return list.size() == 0;
        }

        public void PUSH(int data){
            list.add(data);
        }

        public int POP(){
            if(isempty()){
                return -1;
            }
            int top = list.remove(list.size()-1);
            return top;
        }

        public int PEEK(){
            return list.get(list.size()-1);
        }
    }
    public static void main(String[] args) {
       stackAl ob =new stackAl();
       ob.PUSH(1000);
       ob.PUSH(2000);
       System.out.println();
       ob.POP();    

    }
}
