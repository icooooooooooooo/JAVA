package stack_of_strings;

import com.sun.jdi.event.ExceptionEvent;

import java.util.ArrayList;
import java.util.Stack;

public class StackOfStrings {
    /*
•	Private field: data: ArrayList<String>
•	Public method: push(String item): void
•	Public method: pop(): String
•	Public method: peek(): String
•	Public method: isEmpty(): boolean
     */
    private ArrayList<String> data;

    public StackOfStrings(){
        this.data=new ArrayList<>();
    }

    public void push(String item){
        data.add(item);
    }
    public String pop() throws Exception {
        if (!data.isEmpty()){
            String element = data.get(data.size()-1);
            data.remove(data.size()-1);
            return element;
        } else {
            throw new Exception("empty list");
        }
    }
    public String peek() throws Exception {
        if (!data.isEmpty()){
            String element = data.get(data.size()-1);
            return element;
        } else {
            throw new Exception("empty list");
        }
    }
    public boolean isEmpty(){
        return this.data.size()==0;
    }

}
