uint32_t reverseBits(uint32_t n) {
   uint32_t rs=0;
        for(int i=0;i<32;i++){
             rs<<=1;
             if(n & 1){
                rs|=1;
             } 
             n>>=1;
        }
        return rs;
}