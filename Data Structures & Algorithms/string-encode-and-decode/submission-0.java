class Solution {

    public String encode(List<String> strs) {
       String result = "";
      for(String s: strs){
        int length = s.length();
         result += length+"#"+s;
      }

      return result;
       
    }

    public List<String> decode(String str) {

        int i=0;
        List<String> list = new ArrayList<>();
        while(i<str.length()){

            int hasPos = str.indexOf('#', i);
            String length = str.substring(i, hasPos);
            int res = Integer.parseInt(length);
            String len = str.substring(hasPos +1, hasPos+1+res);

            
           

            list.add(len);
            i = hasPos + 1 + res;
        }
        return list;
        
    }
}
