class Solution {
   static Map<String, Integer> ValuesHash=new HashMap<>();
   static {
       ValuesHash.put("I",1);
       ValuesHash.put("V",5);
       ValuesHash.put("X",10);
       ValuesHash.put("L",50);
       ValuesHash.put("C",100);
       ValuesHash.put("D",500);
       ValuesHash.put("M",1000);
       ValuesHash.put("IV",4);
       ValuesHash.put("IX",9);
       ValuesHash.put("XL",40);
       ValuesHash.put("XC",90);
       ValuesHash.put("CD",400);
       ValuesHash.put("CM",900);
     }
     public int romanToInt(String s){
        int sum=0,i=0;
        while(i<s.length()){
            if(i<s.length()-1){
                String twoSymbols=s.substring(i,i+2);
                if(ValuesHash.containsKey(twoSymbols)){
                  sum += ValuesHash.get(twoSymbols);
                  i=i+2;
                  continue;
                }
            }
            String oneSymbol=s.substring(i,i+1);
            sum += ValuesHash.get(oneSymbol);
            i++;
        }
        return sum;
     }
}