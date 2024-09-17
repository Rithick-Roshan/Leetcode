class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        l1=s1.split()
        l2=s2.split()
        l3=l1+l2
        rs=Counter(l3)
        rs2=[x for x in rs if rs[x]==1]
        return rs2
