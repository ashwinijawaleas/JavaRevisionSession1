package string.Programs;
import net.bytebuddy.dynamic.scaffold.MethodGraph;
import org.testng.annotations.Test;
import java.awt.*;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicates {

    @Test
    public void dupleRemove() {
        String s = "this is is is java java program program";
        String[] st = s.trim().split(" ");
        LinkedHashSet<String> op= new LinkedHashSet<>(List.of(st));
        for(String temp:op){
            StringBuilder sb=new StringBuilder();
            sb=sb.append(temp.substring(0,1).toUpperCase());
            sb=sb.append(temp.substring(1,temp.length()));
            System.out.print(sb+" ");



        }
    }

}
