char* capitalizeTitle(char* title) {
    int i = 0;
    int counter = 0;
    int firstletter = 0;

    while(title[i] != '\0'){

        printf("%d %s\n", i, title);

        while(title[i] != ' ' && title[i] != '\0'){
            counter++;
            if(title[i] >= 'A' && title[i] <= 'Z'){
                title[i] = title[i] + 32;
            }
            i++;
        }

        if(counter > 2){
            if(title[firstletter] <= 'z' && title[firstletter] >= 'a'){
                title[firstletter] = title[firstletter] - 32;
            }
        }

        if (title[i] == ' ') {
            i++;
        }

        firstletter = i;
        counter = 0;

    }

    return title;
}