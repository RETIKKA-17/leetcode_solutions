int romanToInt(char* s) {
    // Define the Roman numeral values
    int romanValues[256] = {0}; // Array to store the value for each character
    
    // Mapping Roman characters to their integer values
    romanValues['I'] = 1;
    romanValues['V'] = 5;
    romanValues['X'] = 10;
    romanValues['L'] = 50;
    romanValues['C'] = 100;
    romanValues['D'] = 500;
    romanValues['M'] = 1000;

    int result = 0;
    int len = strlen(s);

    // Iterate through the string and apply the rules
    for (int i = 0; i < len; i++) {
        // If the current character is smaller than the next character
        if (i + 1 < len && romanValues[s[i]] < romanValues[s[i + 1]]) {
            result -= romanValues[s[i]];  // Subtract current value
        } else {
            result += romanValues[s[i]];  // Add current value
        }
    }

    return result;
}
