const elem = document.querySelector("p").innerText;
console.log(elem, typeof elem);
// String method 문자열 메소드
console.log(elem.length);
document.querySelector("#demo").innerHTML = elem.length;

//Slice
let text = "Apple, Banana, Kiwi";
let part = text.slice(7, 13);   //slice메소드가 텍스트를 잘라서 return한다.
console.log(text.slice(7, 13)); //slice메소드가 리턴까지하므로 콘솔로그에 출력됨 (그렇지않은 메소드도있음)
console.log(text.slice(7)); //자른 범위만 리턴한다.

//Replace
console.log(text.replace("Apple", "Orange")); //바꾼 원본을 리턴한다.

//UpperCase, LowerCase
console.log(text.toUpperCase()); //메소드는 프로퍼티와 다르게 끝에 소괄호가(보이드형이라도) 있다.
console.log(text.toLowerCase());

//Concat
let text1 = "Hello";
let text2 = "World";
let text3 = text1.concat(" " + text2);
console.log(text3);