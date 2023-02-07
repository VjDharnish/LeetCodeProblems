package Medium;
import java.util.HashMap;
public class FruitsInABucket {
	public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i =0;
        int max =0;
        for(int j=0;j<fruits.length;j++){
            map.put(fruits[j],map.getOrDefault(fruits[j],0)+1);
            while(map.size()>2){
              map.put(fruits[i],map.get(fruits[i])-1);
              if(map.get(fruits[i])==0) 
               map.remove(fruits[i]);
               i++;
            }
            max= Math.max(max,j-i+1);
        } 
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fruits = {1,2,1};
		FruitsInABucket f = new FruitsInABucket();
		System.out.println(f.totalFruit(fruits));

	}

}
