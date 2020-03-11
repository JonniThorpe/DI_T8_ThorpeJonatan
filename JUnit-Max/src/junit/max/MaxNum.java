package junit.max;

public class MaxNum {

    public static int max(int[] a) {
        int i, m = 0, z = 0;
        
        if(a == null) {
            return 0;
        } else if(a.length == 0) {
            return 0;
        }
  
        m = a[0];
        
        for (i = 0; i < a.length; i++) {
            if (a[i] > m) 
                m = a[i];
        }
        
        return m;
    }
} 
