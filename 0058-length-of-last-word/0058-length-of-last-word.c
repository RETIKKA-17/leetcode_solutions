int lengthOfLastWord(char* s) {
    int len = strlen(s);
    int count = 0;
    int i = len - 1;

    // skip trailing spaces
    while (i >= 0 && s[i] == ' ') {
        i--;
    }

    // count characters in last word
    while (i >= 0 && s[i] != ' ') {
        count++;
        i--;
    }

    return count;
}

