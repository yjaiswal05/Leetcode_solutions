#include <bits/stdc++.h>
using namespace std;

string toLowerCase(string s) 
{ 
    string ans = ""; 
    for(int i = 0 ; i < s.size() ; i++) { 
        ans += tolower(s[i]); 
    } 
    return ans; 
}

int main() {
    string s;
    cin>>s;
    cout<<toLowerCase(s)<<endl;
}