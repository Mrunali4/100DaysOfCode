class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False;
        map={}
        i=j=0;
        for i in s:
            if i not in map:
                map[i] = 1;
            else:
                map[i]+=1;
                
        for j in t:
            if j not in map:
                return False
            else:
                map[j]-=1;

            
        for i in s:
            if map.get(i) != 0:
                return False;
        return True;
            
