class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder(); 
        for(String str : strs){
            sb.append(str.length());
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();
    }

    // 3#abc2#pq
/*
i=0
strLen=8
j 0
ch='3'
wordLen 3

*/
    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int i=0;
        int strLen=str.length();
        
        while(i < strLen)
        {
            int wordLen = 0;
            while (str.charAt(i) != '#')
            {
                char ch = str.charAt(i);
                wordLen = wordLen*10 + (ch-'0');
                i++;
            }
            i++; 
            strs.add(str.substring(i,i+wordLen));
            i += wordLen;
        }
        return strs;
    }
}
