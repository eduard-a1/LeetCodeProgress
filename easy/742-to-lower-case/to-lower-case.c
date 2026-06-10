char* toLowerCase(char* s) {
    int i = 0;

    while(s[i] != NULL){

        if(s[i] < 91 && s[i] > 64)
        
            s[i] = s[i] + 32;

        i++;
    }

    return s;
}