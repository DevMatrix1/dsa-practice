var isAnagram = function(test, original) {
    let len1= test.length;
    let len2 = original.length
    if(len1 !== len2){
      return false
    }
    let str1 =  test.toLowerCase().split('').sort().join('');
    let str2 = original.toLowerCase().split('').sort().join('');
    if(str1 === str2){
        return true
     } else { 
        return false
     }
    
  };
  console.log(isAnagram("foefet", "toffee"), true, 'The word foefet is an anagram of toffee')
  console.log(isAnagram("Buckethead", "DeathCubeK"), true, 'The word Buckethead is an anagram of DeathCubeK')
  console.log(isAnagram("Twoo", "WooT"), true, 'The word Twoo is an anagram of WooT')
  console.log(isAnagram("dumble", "bumble"), false, 'Characters do not match for test case dumble, bumble')
  console.log(isAnagram("ound", "round"), false, 'Missing characters for test case ound, round')
  console.log(isAnagram("apple", "pale"), false, 'Same letters, but different count')
  // isAnagram("foefet", "toffee")
  // isAnagram("Buckethead", "DeathCubeK")
  // isAnagram("apple", "pale")
  