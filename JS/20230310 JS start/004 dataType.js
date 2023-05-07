//8종류의 데이터타입
//String, Number, Boolean, Object, Undefined, Null, Bigint, Symbol

//String
const str1 = "Smith";
const str2 = "1";
const str3 = "true";
console.log(str1, typeof str1);

//Number
const num1 = 2;
const num2 = 5;
const num3 = 1.423;
console.log(num1, typeof num1);
console.log(num1 * num2);

//Boolean
const bool1 = true;
const bool2 = false;
console.log(bool1, typeof bool1);

//Object 객체
const obj1 = [1,2,3,4,5,6,7,"Smith"]; // 배열,Array
const obj2 = {
    userName: "Smith",
    userAge: 25,
};
console.log(obj1, typeof obj1);

//Undefined
// const undef1; // 상수는 반드시 값을 가져야 한다.
let undef2;
console.log(undef2, typeof undef2);

//Null
let nulValue = null; // null은 아무것도 없다는 의미 (== void)
let objectType = null;
console.log(nulValue, typeof nulValue);

