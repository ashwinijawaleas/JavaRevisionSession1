package string.Programs;

import org.testng.annotations.Test;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindDuplicates {
    @Test
    public void dupliAdd(){
        int n[]={1,3,45,2,3,45,6,6,4,1,2,3,4,7};
        Set<Object> Op=new LinkedHashSet<Object>();
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n.length;j++){
                if(i==j){
                    continue;
                }
                else{
                    if(n[i]==n[j]){
                        Op.add(n[i]);
                    }
                }
            }
        }
        for(Object x:Op){
            System.out.println(x);
        }


    }
}
