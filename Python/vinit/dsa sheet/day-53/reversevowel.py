# Q:https://leetcode.com/problems/reverse-vowels-of-a-string/submissions/836909855/

def reverseVowels(self, s: str) -> str:
        st, en = 0, len(s)-1
        ls = list(s)
        vow = set("aeiouAEIOU")
        while st < en:
            if ls[st] in vow and ls[en] in vow:
                ls[st], ls[en] = ls[en], ls[st]
                st += 1
                en -= 1
            if ls[st] not in vow:
                st += 1
            if ls[en] not in vow:
                en -= 1
    
    
        return "".join(ls)