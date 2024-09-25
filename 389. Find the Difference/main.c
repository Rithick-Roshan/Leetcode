char findTheDifference(char* s, char* t) {
    int res =0;
    for(int i=0;s[i]!='\0';i++){
        res^=s[i];
    }
    for(int i=0;t[i]!='\0';i++){
        res^=t[i];
    }
    char ch=res;
    return ch;
}