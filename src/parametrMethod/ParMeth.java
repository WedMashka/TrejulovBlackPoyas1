package parametrMethod;

import java.util.List;

public class ParMeth {
    public static  <T>T getFirstEl(List<T> list){
        return  list.get(0);
    }
}

